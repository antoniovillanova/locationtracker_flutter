import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:traking_location_app/sign_in_screen.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  
  static const MethodChannel channel = MethodChannel("com.nttdata.travelmar/native_aws");
  
  static Future<void> startTracking() async {
    await channel.invokeMethod('startTracking');
  }
  
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Simple Login App',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: SignInScreen(),
    );
  }
}