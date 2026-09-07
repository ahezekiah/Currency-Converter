# Unit Converter

A native Android unit-conversion application built with **Java**,
**Android XML layouts**, and **Gradle**. The app provides four converter
categories from a single main menu: **Currency, Temperature, Length, and
Weight**.

## Features

-   Convert between 7 currencies: USD, CAD, EUR, AUD, JPY, KRW, and RMB.
-   Convert between Fahrenheit, Celsius, and Kelvin.
-   Convert between centimeters, meters, inches, feet, yards, and miles.
-   Convert between milligrams, grams, kilograms, and metric tons.
-   Enter a value in any supported unit and convert it to the other
    units in that category.
-   Clear all values on the current converter screen.
-   Return to the main menu from each converter.
-   Invalid or empty numeric input displays a Toast message instead of
    crashing.
-   Conversion buttons perform their calculations on the first click.

## Technology Stack

-   **Language:** Java
-   **Platform:** Android
-   **UI:** Android XML layouts
-   **Build system:** Gradle 7.4
-   **Android Gradle Plugin:** 7.3.1
-   **AndroidX AppCompat:** 1.4.1
-   **Material Components:** 1.5.0
-   **ConstraintLayout:** 2.1.3
-   **JUnit:** 4.13.2
-   **Espresso:** 3.4.0

## Android Configuration

  Setting                     Value
  --------------------------- -----------------------------
  Application name            Unit Converter
  Namespace                   `com.example.unitconverter`
  Application ID              `com.example.unitconverter`
  Compile SDK                 32
  Target SDK                  32
  Minimum SDK                 21
  Version                     1.0
  Java source compatibility   Java 8

The project can be built with a newer installed JDK such as JDK 17 while
the source compatibility remains Java 8.

## Supported Conversions

### Currency

  Code   Currency
  ------ -------------------------
  USD    United States Dollar
  CAD    Canadian Dollar
  EUR    Euro
  AUD    Australian Dollar
  JPY    Japanese Yen
  KRW    South Korean Won
  RMB    Chinese Yuan / Renminbi

Currency calculations are stored in `Currency.java`.

> **Important:** Exchange rates are hard-coded. This app does not use a
> live exchange-rate API, so currency results should be treated as
> educational/demo values rather than current financial rates.

### Temperature

The temperature converter supports:

-   Fahrenheit
-   Celsius
-   Kelvin

Conversions include Fahrenheit ↔ Celsius, Fahrenheit ↔ Kelvin, and
Celsius ↔ Kelvin. The Kelvin conversion buttons use the correct `KtoF()`
and `KtoC()` methods.

Temperature calculations are stored in `Temperature.java`.

### Length

The length converter supports:

-   Centimeters (CM)
-   Meters (M)
-   Inches (IN)
-   Feet (FT)
-   Yards (YD)
-   Miles (MI)

Length calculations are stored in `Length.java`.

### Weight

The weight converter supports:

-   Milligrams (MG)
-   Grams (G)
-   Kilograms (KG)
-   Metric Tons (T)

Weight calculations are stored in `Weight.java`.

## Application Architecture

The project uses a single Android activity, `MainActivity`, and switches
between XML layouts with `setContentView()`.

``` text
MainActivity
│
├── activity_main.xml
├── currencyconversion.xml
├── tempconversion.xml
├── lengthconversion.xml
└── weightconversion.xml
```

`MainActivity.java` is responsible for navigation, retrieving user
input, responding to button clicks, validating numeric input, calling
the appropriate conversion method, and displaying results.

The mathematical conversion logic is separated into four utility
classes:

``` text
Currency.java
Temperature.java
Length.java
Weight.java
```

This keeps the conversion formulas separate from most of the Android UI
code.

## Project Structure

``` text
Unit-Converter-main/
├── app/
│   ├── build.gradle
│   ├── proguard-rules.pro
│   └── src/
│       ├── androidTest/
│       │   └── java/
│       ├── test/
│       │   └── java/
│       └── main/
│           ├── AndroidManifest.xml
│           ├── java/
│           │   └── com/example/unitconverter/
│           │       ├── MainActivity.java
│           │       ├── Currency.java
│           │       ├── Temperature.java
│           │       ├── Length.java
│           │       └── Weight.java
│           └── res/
│               ├── layout/
│               │   ├── activity_main.xml
│               │   ├── currencyconversion.xml
│               │   ├── tempconversion.xml
│               │   ├── lengthconversion.xml
│               │   └── weightconversion.xml
│               ├── values/
│               │   ├── strings.xml
│               │   ├── colors.xml
│               │   └── themes.xml
│               ├── values-night/
│               ├── drawable/
│               ├── mipmap-*/
│               └── xml/
├── gradle/
│   └── wrapper/
├── build.gradle
├── gradle.properties
├── gradlew
├── gradlew.bat
└── settings.gradle
```

## How Conversion Works

The XML layouts call public methods in `MainActivity` through Android
`onClick` handlers. Each conversion method checks the ID of the button
that was pressed and immediately performs the appropriate calculation.

For example, the temperature flow is:

``` text
Enter a value
      ↓
Press its Convert button
      ↓
OnClickConvertTemp(View view)
      ↓
Check the pressed button ID
      ↓
Read and validate the source value
      ↓
Call Temperature conversion methods
      ↓
Display converted values
```

This avoids installing a second `OnClickListener` after the user has
already pressed a button.

## Input Validation

Numeric input is parsed as a `double`.

If the source field is empty or cannot be parsed as a number, the app
displays:

``` text
Please enter a number.
```

using an Android `Toast`.

## Building the Project

### Requirements

Before building, install:

-   JDK
-   Android SDK
-   Android SDK Platform Tools
-   Android Emulator or a physical Android device
-   VS Code or Android Studio

If using JDK 17 on Windows, `JAVA_HOME` should point to the JDK root
directory, not its `bin` folder.

Example:

``` text
C:\Program Files\Java\jdk-17
```

### Android SDK Configuration

If Gradle cannot locate the Android SDK, create `local.properties` in
the project root:

``` properties
sdk.dir=C:\\Users\\YOUR_USERNAME\\AppData\\Local\\Android\\Sdk
```

`local.properties` is machine-specific and normally should not be
committed to Git.

### Build on Windows

From the project root:

``` powershell
.\gradlew.bat clean
.\gradlew.bat assembleDebug
```

A successful build ends with:

``` text
BUILD SUCCESSFUL
```

The debug APK is generated at:

``` text
app\build\outputs\apk\debug\app-debug.apk
```

## Running with an Android Emulator from VS Code

### List available emulators

``` powershell
emulator -list-avds
```

If `emulator` is not on `PATH`:

``` powershell
& "$env:LOCALAPPDATA\Android\Sdk\emulator\emulator.exe" -list-avds
```

### Start an emulator

``` powershell
emulator -avd YOUR_AVD_NAME
```

### Confirm the device is connected

``` powershell
adb devices
```

A running emulator should appear similar to:

``` text
emulator-5554    device
```

### Install the APK

``` powershell
adb install -r ".\app\build\outputs\apk\debug\app-debug.apk"
```

### Launch Unit Converter

``` powershell
adb shell am start -n "com.example.unitconverter/.MainActivity"
```

## Testing Checklist

After installing the app, verify:

-   The app launches and displays **Unit Converter**.
-   Currency, Length, Weight, and Temperature screens open.
-   Every conversion button calculates on the first click.
-   Fahrenheit, Celsius, and Kelvin conversions work in each direction.
-   USD, CAD, EUR, AUD, JPY, KRW, and RMB buttons populate the other
    currency fields.
-   CM, M, IN, FT, YD, and MI conversions work.
-   MG, G, KG, and T conversions work.
-   Clear buttons empty all fields on the current screen.
-   Main Menu buttons return to the home screen.
-   Empty or invalid input displays the numeric-input Toast.

Useful reference values include:

``` text
32°F = 0°C = 273.15 K
100°C = 212°F = 373.15 K
1 m = 100 cm
1 mi = 5280 ft
1 kg = 1000 g
1 metric ton = 1000 kg
```

## Current Limitations

-   Currency exchange rates are static rather than live.
-   Numeric results use raw `double` output and may contain long decimal
    values.
-   The application uses one Activity with repeated `setContentView()`
    calls rather than Fragments or the Navigation Component.
-   The included test files are primarily starter/template tests rather
    than comprehensive conversion tests.
-   The project targets Android SDK 32 and uses older Android library
    versions.
-   Some user-facing text is defined directly in layout XML rather than
    centralized in `strings.xml`.

## Possible Future Improvements

-   Connect to a live currency exchange-rate API.
-   Format and round conversion results.
-   Add dropdown-based source and destination unit selection.
-   Add a swap-units button.
-   Convert automatically while typing.
-   Add conversion history.
-   Add additional currencies and measurement units.
-   Add View Binding.
-   Migrate navigation to Fragments and Navigation Component.
-   Add unit tests for every conversion formula.
-   Add Espresso UI tests.
-   Improve accessibility and localization.
-   Update Android SDK and library versions.
-   Add landscape-responsive layouts.

## Educational Concepts Demonstrated

This project demonstrates:

-   Native Android development
-   Java
-   Object-oriented programming
-   Android Activities
-   XML layouts
-   Android resources
-   `EditText`
-   Buttons
-   `Toast`
-   `findViewById()`
-   XML `onClick` handlers
-   Exception handling
-   Static utility methods
-   Mathematical conversion formulas
-   Gradle builds
-   Android emulator testing
-   APK installation with ADB

## License

No explicit open-source license file is currently included in this
repository. Unless a license is added, normal copyright rules apply.

------------------------------------------------------------------------

## Summary

**Unit Converter** is a Java Android application that combines four
conversion tools into one interface. It supports **20 units across four
categories** and separates mathematical formulas into dedicated
conversion classes while `MainActivity` handles navigation and user
interaction.

The project is suitable as a demonstration of introductory native
Android development, Java event handling, XML-based interfaces, input
validation, Gradle builds, and mathematical conversion logic.
