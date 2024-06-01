import 'package:flutter_secure_storage/flutter_secure_storage.dart';

class SecureStorageManager {
  static const String packageLey = "com.nttdata.travelmar";
  static const String identityPoolIdKey = "identityPoolId";
  static const String trackerNameKey = "trackerName";

  final FlutterSecureStorage _secureStorage = const FlutterSecureStorage();

  Future<void> saveData(String key, String value) async {
    await _secureStorage.write(key: key, value: value);
  }

  Future<String?> getData(String key) async {
    return await _secureStorage.read(key: key);
  }
}
