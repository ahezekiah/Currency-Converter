# Unit Converter

A native Android unit-conversion application built with **Java**, **Android XML layouts**, and **Gradle**.

The app provides four conversion categories from a single main menu:

- Currency
- Temperature
- Length
- Weight

---

## Features

- Convert between 7 currencies
- Convert between Fahrenheit, Celsius, and Kelvin
- Convert between centimeters, meters, inches, feet, yards, and miles
- Convert between milligrams, grams, kilograms, and metric tons
- Enter a value in any supported unit and convert it to the other units in that category
- Clear all values on the current converter screen
- Return to the main menu from each converter
- Invalid or empty input displays an error message
- Conversion buttons calculate on the first click

---

## Technology Stack

- **Language:** Java
- **Platform:** Android
- **UI:** Android XML
- **Build System:** Gradle 7.4
- **Android Gradle Plugin:** 7.3.1
- **AndroidX AppCompat:** 1.4.1
- **Material Components:** 1.5.0
- **ConstraintLayout:** 2.1.3
- **JUnit:** 4.13.2
- **Espresso:** 3.4.0

---

## Android Configuration

| Setting | Value |
| --- | --- |
| Application Name | Unit Converter |
| Namespace | `com.example.unitconverter` |
| Application ID | `com.example.unitconverter` |
| Compile SDK | 32 |
| Target SDK | 32 |
| Minimum SDK | 21 |
| Version | 1.0 |
| Java Source Compatibility | Java 8 |

The application can be built using a newer installed JDK such as **JDK 17**, while the project source compatibility remains Java 8.

---

# Supported Conversions

## Currency

The currency converter supports:

- USD
- CAD
- EUR
- AUD
- JPY
- KRW
- RMB

| Code | Currency |
| --- | --- |
| USD | United States Dollar |
| CAD | Canadian Dollar |
| EUR | Euro |
| AUD | Australian Dollar |
| JPY | Japanese Yen |
| KRW | South Korean Won |
| RMB | Chinese Yuan / Renminbi |

Currency calculations are located in:

```text
Currency.java
