import 'package:flutter/material.dart';
import 'package:traking_location_app/pages/success_screen.dart';
import '../core/secure_storage_manager.dart';

class SignInScreen extends StatefulWidget {
  const SignInScreen({super.key});

  @override
  _SignInScreenState createState() => _SignInScreenState();
}

class _SignInScreenState extends State<SignInScreen> {
  final _formKey = GlobalKey<FormState>();
  final TextEditingController _userIdentityPoolController = TextEditingController();
  final TextEditingController _trackerNameController = TextEditingController();
  final SecureStorageManager _secureStorageManager = SecureStorageManager();

  @override
  void dispose() {
    _userIdentityPoolController.dispose();
    _trackerNameController.dispose();
    super.dispose();
  }

  Future<void> _saveToSecureStorage() async {
    await _secureStorageManager.saveData(
      SecureStorageManager.identityPoolIdKey,
      _userIdentityPoolController.text,
    );
    await _secureStorageManager.saveData(
      SecureStorageManager.trackerNameKey,
      _trackerNameController.text,
    );
  }

  void _submitForm() async {
    if (_formKey.currentState!.validate()) {
      await _saveToSecureStorage();
      Navigator.push(
        context,
        MaterialPageRoute(builder: (context) => SuccessScreen()),
      );
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Authentication'),
      ),
      body: Padding(
        padding: const EdgeInsets.all(24.0),
        child: Form(
          key: _formKey,
          child: Column(
            mainAxisSize: MainAxisSize.min,
            children: <Widget>[
              TextFormField(
                controller: _userIdentityPoolController,
                decoration: const InputDecoration(labelText: 'User Identity Pool'),
                validator: (value) {
                  if (value == null || value.isEmpty) {
                    return 'Please enter user identity pool';
                  }
                  return null;
                },
              ),
              TextFormField(
                controller: _trackerNameController,
                decoration: const InputDecoration(labelText: 'Tracker Name'),
                validator: (value) {
                  if (value == null || value.isEmpty) {
                    return 'Please enter tracker name';
                  }
                  return null;
                },
              ),
              const SizedBox(height: 20),
              ElevatedButton(
                onPressed: _submitForm,
                child: const Text('Login'),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
