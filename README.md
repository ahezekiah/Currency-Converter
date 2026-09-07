# Unit Converter

A native Android unit-conversion application built with **Java**, **Android XML layouts**, and **Android Studio**.

The application provides four conversion tools:

* Currency Converter
* Temperature Converter
* Length Converter
* Weight Converter

Users select a converter from the main menu, enter a value into one unit, and convert that value into all of the other supported units.

---

## Overview
The main menu provides four options:

```text
Unit Converter
│
├── Currency
├── Length
├── Weight
└── Temperature
```

Each converter has its own screen and conversion logic.

The project demonstrates native Android development concepts including:

* Java classes
* Android Activities
* XML layouts
* `EditText`
* `Button`
* `Toast`
* `setContentView()`
* `findViewById()`
* Android `onClick` handlers
* Exception handling
* Static utility methods
* Mathematical conversion formulas
* Gradle

---

# Technology Stack

## Language

```text
Java
```

## Platform

```text
Android
```

## UI

```text
Android XML Layouts
```

## Build System

```text
Gradle
```

## Android Libraries

The project uses:

```text
AndroidX AppCompat 1.4.1
Material Components 1.5.0
ConstraintLayout 2.1.3
```

Testing dependencies include:

```text
JUnit 4.13.2
AndroidX JUnit
Espresso
```

---

# Android Configuration

The application currently targets:

```text
Compile SDK: 32
Target SDK: 32
Minimum SDK: 21
```

Java compatibility is configured for:

```text
Java 8
```

The application ID is:

```text
com.example.finalprojectl8
```

---

# Features

## Main Menu

The application opens to a main menu titled:

```text
Unit Converter
```

Users can select:

```text
Currency
Length
Weight
Temperature
```

Each selection replaces the current activity layout with the appropriate converter.

---

# Currency Converter

The currency converter supports seven currencies:

```text
USD
CAD
EUR
AUD
JPY
KRW
RMB
```

These represent:

| Code | Currency                |
| ---- | ----------------------- |
| USD  | United States Dollar    |
| CAD  | Canadian Dollar         |
| EUR  | Euro                    |
| AUD  | Australian Dollar       |
| JPY  | Japanese Yen            |
| KRW  | South Korean Won        |
| RMB  | Chinese Yuan / Renminbi |

---

## Currency Conversion Flow

A user can enter an amount into any currency field.

For example:

```text
Enter USD
   ↓
Select Convert
   ↓
Calculate CAD
Calculate EUR
Calculate AUD
Calculate JPY
Calculate KRW
Calculate RMB
```

The same pattern exists for every supported currency.

---

# Currency Conversion Logic

Currency logic is located in:

```text
app/src/main/java/com/example/finalprojectl8/Currency.java
```

The class contains static conversion functions.

Example:

```java
public static double USDtoCAD(double USD) {
    double CAD = USD * 1.36;
    return CAD;
}
```

Additional examples include:

```java
Currency.USDtoEUR(...)
Currency.CADtoUSD(...)
Currency.EURtoJPY(...)
Currency.AUDtoKRW(...)
Currency.JPYtoUSD(...)
Currency.KRWtoRMB(...)
Currency.RMBtoCAD(...)
```

---

# Important Currency Limitation

Currency exchange rates are:

```text
Hard-coded
```

inside:

```text
Currency.java
```

The application does **not** currently connect to a live currency exchange API.

For example:

```java
USD * 1.36
```

is used for USD-to-CAD conversion.

That means the converter should be considered an educational/demo currency converter rather than a source of current financial exchange rates.

---

# Temperature Converter

The application supports:

```text
Fahrenheit
Celsius
Kelvin
```

Displayed as:

```text
°F
°C
°K
```

The conversion logic is located in:

```text
Temperature.java
```

---

# Fahrenheit Conversions

The application implements:

```text
Fahrenheit → Celsius
Fahrenheit → Kelvin
```

Example:

```java
public static double FtoC(double F) {
    double C = (F - 32) * 5 / 9;
    return C;
}
```

---

# Celsius Conversions

The application implements:

```text
Celsius → Fahrenheit
Celsius → Kelvin
```

Example:

```java
public static double CtoK(double C) {
    double K = C + 273.15;
    return K;
}
```

---

# Kelvin Conversions

The utility class correctly defines:

```text
Kelvin → Fahrenheit
Kelvin → Celsius
```

using:

```java
Temperature.KtoF(...)
Temperature.KtoC(...)
```

---

# Temperature Bug That Needs Fixing

There is currently an error in:

```text
MainActivity.java
```

inside the Kelvin conversion button.

The code currently uses:

```java
etTemperature1.setText(
    String.valueOf(
        Temperature.FtoK(
            Double.parseDouble(k)
        )
    )
);

etTemperature2.setText(
    String.valueOf(
        Temperature.FtoC(
            Double.parseDouble(k)
        )
    )
);
```

This incorrectly treats the Kelvin value as Fahrenheit.

It should use:

```java
etTemperature1.setText(
    String.valueOf(
        Temperature.KtoF(
            Double.parseDouble(k)
        )
    )
);

etTemperature2.setText(
    String.valueOf(
        Temperature.KtoC(
            Double.parseDouble(k)
        )
    )
);
```

So the corrected section should be:

```java
String k =
    etTemperature3
        .getText()
        .toString();

double kelvin =
    Double.parseDouble(k);

etTemperature1.setText(
    String.valueOf(
        Temperature.KtoF(kelvin)
    )
);

etTemperature2.setText(
    String.valueOf(
        Temperature.KtoC(kelvin)
    )
);
```

---

# Length Converter

The length converter supports:

```text
Centimeters
Meters
Inches
Feet
Yards
Miles
```

Displayed as:

```text
CM
M
IN
FT
YD
MI
```

---

# Length Conversion Class

Length conversions are located in:

```text
Length.java
```

Supported conversion groups include:

```text
CM → M
CM → IN
CM → FT
CM → YD
CM → MI

M → CM
M → IN
M → FT
M → YD
M → MI

IN → CM
IN → M
IN → FT
IN → YD
IN → MI

FT → CM
FT → M
FT → IN
FT → YD
FT → MI

YD → CM
YD → M
YD → IN
YD → FT
YD → MI

MI → CM
MI → M
MI → IN
MI → FT
MI → YD
```

---

# Example Length Formula

Meters to centimeters:

```java
public static double MtoCM(double M) {
    double CM = M * 100;
    return CM;
}
```

Miles to feet:

```java
public static double MItoFT(double MI) {
    double FT = MI * 5280;
    return FT;
}
```

---

# Weight Converter

The weight converter supports:

```text
Milligrams
Grams
Kilograms
Metric Tons
```

Displayed as:

```text
MG
G
KG
T
```

---

# Weight Conversion Class

Weight conversion logic is located in:

```text
Weight.java
```

Supported conversions include:

```text
MG → G
MG → KG
MG → T

G → MG
G → KG
G → T

KG → MG
KG → G
KG → T

T → MG
T → G
T → KG
```

---

# Example Weight Conversion

Kilograms to grams:

```java
public static double KGtoG(double KG) {
    double G = KG * 1000;
    return G;
}
```

Metric tons to kilograms:

```java
public static double TtoKG(double T) {
    double KG = T * 1000;
    return KG;
}
```

---

# Application Architecture

The project uses one Android Activity:

```text
MainActivity
```

and switches between multiple XML layouts.

```text
MainActivity
      │
      ├── activity_main.xml
      │
      ├── tempconversion.xml
      │
      ├── currencyconversion.xml
      │
      ├── lengthconversion.xml
      │
      └── weightconversion.xml
```

Instead of creating a separate Activity or Fragment for every converter, the application calls:

```java
setContentView(...)
```

to replace the current layout.

---

# Main Activity

The central application logic is located in:

```text
app/src/main/java/com/example/finalprojectl8/MainActivity.java
```

This class handles:

* Main menu navigation
* Layout switching
* Input fields
* Convert buttons
* Clear buttons
* Main-menu buttons
* Number parsing
* Conversion calls
* Error messages

---

# Conversion Classes

Conversion logic has been separated into dedicated classes:

```text
Currency.java
Temperature.java
Length.java
Weight.java
```

This separation is useful because mathematical conversion logic does not need to be directly embedded inside the UI code.

The general design is:

```text
MainActivity
     ↓
Read User Input
     ↓
Conversion Class
     ↓
Perform Formula
     ↓
Return double
     ↓
Display Result
```

---

# Project Structure

```text
Currency-Converter-main/
│
├── app/
│   │
│   ├── src/
│   │   │
│   │   ├── androidTest/
│   │   │   └── java/
│   │   │
│   │   ├── test/
│   │   │   └── java/
│   │   │
│   │   └── main/
│   │       │
│   │       ├── java/
│   │       │   └── com/
│   │       │       └── example/
│   │       │           └── finalprojectl8/
│   │       │               ├── MainActivity.java
│   │       │               ├── Currency.java
│   │       │               ├── Temperature.java
│   │       │               ├── Length.java
│   │       │               └── Weight.java
│   │       │
│   │       ├── res/
│   │       │   ├── layout/
│   │       │   │   ├── activity_main.xml
│   │       │   │   ├── currencyconversion.xml
│   │       │   │   ├── lengthconversion.xml
│   │       │   │   ├── tempconversion.xml
│   │       │   │   └── weightconversion.xml
│   │       │   │
│   │       │   ├── drawable/
│   │       │   ├── mipmap-*/
│   │       │   ├── values/
│   │       │   ├── values-night/
│   │       │   └── xml/
│   │       │
│   │       └── AndroidManifest.xml
│   │
│   ├── build.gradle
│   └── proguard-rules.pro
│
├── gradle/
├── build.gradle
├── gradle.properties
├── gradlew
├── gradlew.bat
└── settings.gradle
```

---

# XML Layouts

## Main Menu

```text
activity_main.xml
```

Contains buttons for:

```text
Currency
Length
Weight
Temperature
```

---

## Currency Screen

```text
currencyconversion.xml
```

Contains fields for:

```text
USD
CAD
EUR
AUD
JPY
KRW
RMB
```

along with:

```text
Convert
Clear
Main Menu
```

controls.

---

## Temperature Screen

```text
tempconversion.xml
```

Contains:

```text
Fahrenheit
Celsius
Kelvin
```

inputs.

---

## Length Screen

```text
lengthconversion.xml
```

Contains:

```text
Centimeters
Meters
Inches
Feet
Yards
Miles
```

---

## Weight Screen

```text
weightconversion.xml
```

Contains:

```text
Milligrams
Grams
Kilograms
Metric Tons
```

---

# Main Menu Navigation

The application uses XML `android:onClick` callbacks.

For example:

```xml
android:onClick="OnClickCurrency"
```

calls:

```java
public void OnClickCurrency(View view) {
    setContentView(
        R.layout.currencyconversion
    );
}
```

Similar methods exist for:

```java
OnClickTemp(...)
OnClickLength(...)
OnClickWeight(...)
```

---

# Returning to the Main Menu

Each converter provides a:

```text
Main Menu
```

button.

This calls:

```java
public void OnClickMainMenu(View view) {
    setContentView(
        R.layout.activity_main
    );
}
```

---

# Clear Buttons

Each screen includes a clear function.

For example:

```java
public void OnClickClearTemp(View view) {
    etTemperature1 =
        findViewById(
            R.id.etTemperature1
        );

    etTemperature1.setText("");

    // Remaining fields...
}
```

Clear methods exist for:

```text
Temperature
Currency
Length
Weight
```

---

# Input Validation

Conversion operations are wrapped inside:

```java
try {
    ...
} catch (
    NumberFormatException e
) {
    ...
}
```

If an empty or invalid value is entered, the app displays:

```text
Please enter a number.
```

using an Android:

```java
Toast
```

Example:

```java
Toast.makeText(
    getApplicationContext(),
    "Please enter a number.",
    Toast.LENGTH_SHORT
).show();
```

---

# Important Convert-Button Issue

The current conversion-button architecture contains an interaction problem.

The XML button already calls methods such as:

```xml
android:onClick="OnClickConvertCurrency"
```

However, that method does not immediately perform the conversion.

Instead, it calls:

```java
BTNConvertC1.setOnClickListener(...)
```

inside the click handler.

That means the first button press can merely install another click listener, while the actual calculation may require another press.

The same pattern exists for:

```text
Temperature
Currency
Length
Weight
```

---

# Recommended Convert-Button Fix

Instead of attaching another listener when the button is already clicked, perform the conversion directly.

For example, instead of:

```java
public void OnClickConvertTemp(
    View view
) {
    BTNConvertT1.setOnClickListener(
        new View.OnClickListener() {
            @Override
            public void onClick(
                View view
            ) {
                // conversion
            }
        }
    );
}
```

use the clicked view ID:

```java
public void OnClickConvertTemp(
    View view
) {
    try {
        EditText fahrenheit =
            findViewById(
                R.id.etTemperature1
            );

        EditText celsius =
            findViewById(
                R.id.etTemperature2
            );

        EditText kelvin =
            findViewById(
                R.id.etTemperature3
            );

        if (
            view.getId() ==
            R.id.BTNConvertT1
        ) {
            double value =
                Double.parseDouble(
                    fahrenheit
                        .getText()
                        .toString()
                );

            celsius.setText(
                String.valueOf(
                    Temperature.FtoC(
                        value
                    )
                )
            );

            kelvin.setText(
                String.valueOf(
                    Temperature.FtoK(
                        value
                    )
                )
            );
        }

        // Handle T2 and T3 similarly.

    } catch (
        NumberFormatException e
    ) {
        Toast.makeText(
            this,
            "Please enter a number.",
            Toast.LENGTH_SHORT
        ).show();
    }
}
```

Another good option is removing `android:onClick` from XML and configuring listeners entirely inside Java.

Using **one approach or the other**, instead of both, makes the interaction easier to maintain.

---

# Current Currency Rates

The exchange values inside:

```text
Currency.java
```

are fixed constants.

Examples include conversion multipliers such as:

```text
USD → CAD
USD → EUR
USD → AUD
USD → JPY
USD → KRW
USD → RMB
```

These numbers do not automatically update.

Therefore:

> Currency results represent the rates that were manually entered when the project was created and should not be treated as current live exchange rates.

---

# Recommended Live Currency Upgrade

A future version could connect to an exchange-rate API.

The architecture could become:

```text
Currency Screen
      ↓
Currency API
      ↓
Latest Exchange Rates
      ↓
Conversion Calculation
      ↓
Display Result
```

Possible improvements would include:

* Automatic exchange-rate updates
* Offline cached rates
* Last-updated timestamp
* More currencies
* Currency dropdowns
* Currency symbols

---

# Output Formatting

The current app displays raw Java `double` values using:

```java
String.valueOf(...)
```

This can produce long decimal results.

For better display formatting, values could use:

```java
String.format(
    "%.2f",
    result
);
```

For example:

```text
1.35789457
```

could display as:

```text
1.36
```

For currencies such as JPY or KRW, formatting rules could be adjusted separately.

---

# Additional Code Improvements

## 1. Rename the Application

The Android resource currently uses:

```xml
<string name="app_name">
    Final Project [L8]
</string>
```

A clearer production name would be:

```xml
<string name="app_name">
    Unit Converter
</string>
```

---

## 2. Improve Package Name

The current package is:

```text
com.example.finalprojectl8
```

A production project would normally use something more descriptive, such as:

```text
com.example.unitconverter
```

---

## 3. Avoid Public-Looking Field Collections

`MainActivity` contains a large number of fields:

```java
EditText etTemperature1,
         etTemperature2,
         etTemperature3,
         etCurrency1,
         ...
```

and many buttons.

A cleaner implementation could initialize only the controls needed by the currently displayed screen.

---

## 4. Avoid Repeated `findViewById()`

The code repeatedly executes:

```java
findViewById(...)
```

inside each conversion.

Views could instead be initialized once after loading each layout.

---

## 5. Use View Binding

A modern Android implementation could enable:

```text
View Binding
```

instead of repeatedly using:

```java
findViewById()
```

This would make view access safer and cleaner.

---

## 6. Use Separate Activities or Fragments

The entire application currently runs through:

```text
MainActivity
```

while repeatedly replacing its content view.

A more scalable architecture could use:

```text
MainActivity
    │
    ├── CurrencyFragment
    ├── TemperatureFragment
    ├── LengthFragment
    └── WeightFragment
```

or separate Activities.

---

## 7. Move User-Facing Text to `strings.xml`

Many labels are currently written directly into the XML layouts.

For example:

```xml
android:text="Currency"
```

A more maintainable approach is:

```xml
android:text="@string/currency"
```

with:

```xml
<string name="currency">
    Currency
</string>
```

This also improves localization support.

---

## 8. Improve Unit Naming

The temperature UI currently uses:

```text
°K
```

Kelvin is conventionally written:

```text
K
```

rather than:

```text
°K
```

because kelvin does not use the degree symbol.

---

# Running the Project

## Requirements

You will need:

```text
Android Studio
Android SDK
JDK
Gradle
Android Emulator or Android Device
```

The original project configuration uses:

```text
compileSdk 32
targetSdk 32
minSdk 21
```

---

# Clone the Repository

```bash
git clone <YOUR-REPOSITORY-URL>
```

Then:

```bash
cd Currency-Converter-main
```

---

# Open in Android Studio

Open Android Studio and select:

```text
Open
```

Then select the:

```text
Currency-Converter-main
```

directory.

Allow Android Studio to:

```text
Sync Gradle
Download dependencies
Index the project
```

---

# Run the Application

Select an:

```text
Android Emulator
```

or connected Android device.

Then select:

```text
Run
```

from Android Studio.

---

# Building from the Command Line

## Windows

```powershell
.\gradlew.bat assembleDebug
```

## macOS / Linux

```bash
./gradlew assembleDebug
```

---

# Debug APK

After a successful debug build, the APK is typically created at:

```text
app/build/outputs/apk/debug/app-debug.apk
```

---

# Install APK with ADB

If Android Debug Bridge is configured:

```bash
adb install app/build/outputs/apk/debug/app-debug.apk
```

---

# Testing

The repository includes the standard Android test templates:

```text
app/src/test/
```

and:

```text
app/src/androidTest/
```

with dependencies for:

```text
JUnit
AndroidX JUnit
Espresso
```

However, the repository does not currently contain meaningful unit tests for the converter formulas.

---

# Recommended Unit Tests

The conversion classes are especially suitable for unit testing because they contain static mathematical methods.

For example:

```java
@Test
public void celsiusToFahrenheit() {
    assertEquals(
        32.0,
        Temperature.CtoF(0),
        0.001
    );
}
```

Another example:

```java
@Test
public void kilometersNotIncludedButMetersToCentimeters() {
    assertEquals(
        100.0,
        Length.MtoCM(1),
        0.001
    );
}
```

Currency tests should be written with the understanding that their expected values depend on the hard-coded rates.

---

# Current Known Issues

The most important issues found in the current project are:

### Kelvin conversion uses the wrong functions

The Kelvin button calls Fahrenheit conversion methods rather than:

```java
KtoF()
KtoC()
```

### Convert buttons attach click listeners from inside click callbacks

Because XML already handles the button click, installing another `OnClickListener` inside that callback creates unnecessary and potentially confusing two-click behavior.

### Currency rates are static

Currency rates are hard-coded and are not current/live.

### Raw doubles are displayed

Results are not rounded or formatted for readability.

### No meaningful automated conversion tests

The testing directories mainly contain the Android Studio starter tests.

### All screens are controlled by one Activity

The current architecture works for a small class project but becomes harder to maintain as the application grows.

---

# Potential Future Improvements

Possible enhancements include:

* Live currency API
* Additional currencies
* Currency dropdown selectors
* Reverse/swap conversion
* Automatic conversion while typing
* Conversion history
* Favorites
* Dark mode
* Material Design improvements
* View Binding
* Fragments
* Navigation Component
* MVVM architecture
* Unit tests
* UI tests
* Rounded number formatting
* Scientific notation handling
* Better error messages
* Accessibility improvements
* Landscape layouts
* Localization
* Offline exchange-rate caching

---

# Educational Concepts Demonstrated

This project demonstrates:

```text
Android Development
Java
Object-Oriented Programming
Static Utility Methods
Android Activities
XML Layouts
Buttons
EditText
Toast Messages
Event Handling
Exception Handling
Mathematical Formulas
View Lookup
Gradle
Android Resources
Unit Conversion
```

---

# Conversion Architecture

```text
User
 ↓
Select Converter
 ↓
MainActivity
 ↓
setContentView()
 ↓
Converter XML Layout
 ↓
Enter Number
 ↓
Press Convert
 ↓
MainActivity
 ↓
Conversion Utility Class
 ↓
Mathematical Formula
 ↓
double Result
 ↓
EditText Output
```

---

# Class Responsibilities

```text
MainActivity.java
│
├── Navigation
├── UI handling
├── User input
├── Button events
├── Input validation
└── Displaying results

Currency.java
└── Currency calculations

Temperature.java
└── Temperature calculations

Length.java
└── Length calculations

Weight.java
└── Weight calculations
```

---

# Quick Start

```text
1. Clone the repository
2. Open it in Android Studio
3. Allow Gradle to sync
4. Start an Android emulator
5. Run the app
6. Select a converter
7. Enter a number
8. Press Convert
```

The application supports:

```text
7 currencies
3 temperature units
6 length units
4 weight units
```

for a total of:

```text
20 supported units
```

across four conversion categories.

---

# Summary

**Unit Converter** is a native Android application written in Java that provides four different conversion tools:

```text
Currency
Temperature
Length
Weight
```

The application separates mathematical logic into dedicated classes:

```text
Currency.java
Temperature.java
Length.java
Weight.java
```

while:

```text
MainActivity.java
```

handles the user interface and navigation between XML layouts.

The project is a useful demonstration of basic Android application development, Java methods, UI event handling, input validation, and mathematical conversion logic.

The most important fixes before further development are:

```text
1. Correct Kelvin conversion
2. Simplify button click handling
3. Replace static exchange rates if live currency accuracy is required
4. Format numeric results
5. Add conversion unit tests
```
