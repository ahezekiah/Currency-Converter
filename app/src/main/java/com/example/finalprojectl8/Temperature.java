package com.example.finalprojectl8;

public class Temperature {

    public Temperature() {
    }

    //Fahrenheit Conversion
    public static double FtoC (double F){
        double C = (F - 32) * 5/9;
        return C;
    }
    public static double FtoK (double F){
        double K = (F - 32) * 5/9 + 273.15;
        return K;
    }

    //Celsius Conversion
    public static double CtoF (double C){
        double F = (C * 9/5) + 32;
        return F;
    }
    public static double CtoK (double C){
        double K = C + 273.15;
        return K;
    }

    //Kelvin Conversion
    public static double KtoF (double K){
        double F = (K - 273.15) * 9/5 + 32;
        return F;
    }
    public static double KtoC (double K){
        double C = K - 273.15;
        return C;
    }
}
