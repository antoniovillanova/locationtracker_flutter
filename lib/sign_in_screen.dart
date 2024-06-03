import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:traking_location_app/success_screen.dart';

class SignInScreen extends StatefulWidget {
  @override
  _SignInScreenState createState() => _SignInScreenState();
}

class _SignInScreenState extends State<SignInScreen> {
  final _formKey = GlobalKey<FormState>();
  final TextEditingController _userIdentityPoolController = TextEditingController();
  final TextEditingController _trackerNameController = TextEditingController();
  final TextEditingController _mapNameController = TextEditingController();
  static const channel = MethodChannel('com.nttdata.travelmar.channel');

  Future<void> _startTracking() async {
    try{
      channel.invokeMethod('startTracking');
    } on PlatformException catch(e){
      print(e.message);
    }
  }

  @override
  void dispose() {
    _userIdentityPoolController.dispose();
    _trackerNameController.dispose();
    _mapNameController.dispose();
    super.dispose();
  }

  void _showSignInDialog() {
    showDialog(
      context: context,
      builder: (BuildContext context) {
        return AlertDialog(
          title: const Text('Sign In'),
          content: Form(
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
                TextFormField(
                  controller: _mapNameController,
                  decoration: const InputDecoration(labelText: 'Map Name'),
                  validator: (value) {
                    if (value == null || value.isEmpty) {
                      return 'Please enter map name';
                    }
                    return null;
                  },
                ),
              ],
            ),
          ),
          actions: <Widget>[
            TextButton(
              onPressed: () {
                _startTracking();
                //Navigator.of(context).pop();
              },
              child: const Text('Cancel'),
            ),
            TextButton(
              onPressed: () {
                if (_formKey.currentState!.validate()) {
                  Navigator.of(context).pop();
                  Navigator.push(
                    context,
                    MaterialPageRoute(builder: (context) => SuccessScreen()),
                  );
                }
              },
              child: const Text('Login'),
            ),
          ],
        );
      },
    );
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Sign In Screen'),
      ),
      body: Center(
        child: ElevatedButton(
          onPressed: _showSignInDialog,
          child: const Text('Sign In'),
        ),
      ),
    );
  }
}