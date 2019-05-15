# Road Signs
CSCI E-37 Assignment 6 : Road Signs

### Build
```shell
./gradlew installDebug
```
This should build the app apk under `./app/build/outputs/apk/debug/app-debug.apk`
The same apk has been copied under `./apk/app-debug.apk`

### Emulator
Before proceeding further, we need to start the local emulator. For this assignment I have used Pixel_3_API_28
To start an emulator:
```shell
./emulator -avd "Pixel_3_API_28"
```
The emular should be up and running after this command.

### Install
#### Install MoreLocale 2 (Not required if you are using System Language settings to switch languages)
```shell
./adb install ./apk/MoreLocale2.apk 
```

#### Install roadsigns apk into the emulator
```shell
./adb install ./apk/app-debug.apk 
```

This installs MoreLocale2 and roadsigns app in the emulator running. Once both the apps are installed, we need to give permissions to MoreLocale2 to modify system Locales

```shell
./adb shell pm grant jp.co.c_lis.ccl.morelocale android.permission.CHANGE_CONFIGURATION
```

### Run application
```shell
./adb shell am start -n "com.example.test/com.example.test.MainActivity" -a android.intent.action.MAIN -c android.intent.category.LAUNCHER
```

Now you should be able to view the roadsigns app running on your android emulator.

You can switch locales by going to system settings and changing language/region or by using MoreLocale2 application.


### Screenshots

en_US   |   fr_FR
:-------------------------:|:-------------------------:
<img src="https://github.com/pritamdey251/roadsigns/raw/master/demo/en_US.gif" alt="" height="350" width="200">  |  <img src="https://github.com/pritamdey251/roadsigns/raw/master/demo/fr_FR.gif" alt="" height="350" width="200">

