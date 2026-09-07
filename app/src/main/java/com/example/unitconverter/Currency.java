package com.example.unitconverter;

public class Currency {

    public Currency() {
    }

    //US Dollar Conversion
    public static double USDtoCAD (double USD){
        double CAD = USD * 1.36;
        return CAD;
    }
    public static double USDtoEUR (double USD){
        double EUR = USD * 0.95;
        return EUR;
    }
    public static double USDtoAUD (double USD){
        double AUD = USD * 1.49;
        return AUD;
    }
    public static double USDtoJPY (double USD){
        double JPY = USD * 137.06;
        return JPY;
    }
    public static double USDtoKRW (double USD){
        double KRW = USD * 1316.91;
        return KRW;
    }
    public static double USDtoRMB (double USD){
        double RMB = USD * 6.98;
        return RMB;
    }

    //Canadian Dollar Conversion
    public static double CADtoUSD (double CAD){
        double USD = CAD * 0.74;
        return USD;
    }
    public static double CADtoEUR (double CAD){
        double EUR = CAD * 0.70;
        return EUR;
    }
    public static double CADtoAUD (double CAD){
        double AUD = CAD * 1.09;
        return AUD;
    }
    public static double CADtoJPY (double CAD){
        double JPY = CAD * 100.80;
        return JPY;
    }
    public static double CADtoKRW (double CAD){
        double KRW = CAD * 968.52;
        return KRW;
    }
    public static double CADtoRMB (double CAD){
        double RMB = CAD * 5.14;
        return RMB;
    }

    //Euro Conversion
    public static double EURtoUSD (double EUR){
        double USD = EUR * 1.05;
        return USD;
    }
    public static double EURtoCAD (double EUR){
        double CAD = EUR * 1.43;
        return CAD;
    }
    public static double EURtoAUD (double EUR){
        double AUD = EUR * 1.56;
        return AUD;
    }
    public static double EURtoJPY (double EUR){
        double JPY = EUR * 143.70;
        return JPY;
    }
    public static double EURtoKRW (double EUR){
        double KRW = EUR * 1380.60;
        return KRW;
    }
    public static double EURtoRMB (double EUR){
        double RMB = EUR * 7.32;
        return RMB;
    }

    //Australian Dollar Conversion
    public static double AUDtoUSD (double AUD){
        double USD = AUD * 0.67;
        return USD;
    }
    public static double AUDtoCAD (double AUD){
        double CAD = AUD * 0.91;
        return CAD;
    }
    public static double AUDtoEUR (double AUD){
        double EUR = AUD * 0.64;
        return EUR;
    }
    public static double AUDtoJPY (double AUD){
        double JPY = AUD * 92.19;
        return JPY;
    }
    public static double AUDtoKRW (double AUD){
        double KRW = AUD * 885.79;
        return KRW;
    }
    public static double AUDtoRMB (double AUD){
        double RMB = AUD * 4.70;
        return RMB;
    }

    //Japanese Yen Conversion
    public static double JPYtoUSD (double JPY){
        double USD = JPY * 0.0073;
        return USD;
    }
    public static double JPYtoCAD (double JPY){
        double CAD = JPY * 0.0099;
        return CAD;
    }
    public static double JPYtoEUR (double JPY){
        double EUR = JPY * 0.0070;
        return EUR;
    }
    public static double JPYtoAUD (double JPY){
        double AUD = JPY * 0.011;
        return AUD;
    }
    public static double JPYtoKRW (double JPY){
        double KRW = JPY * 9.61;
        return KRW;
    }
    public static double JPYtoRMB (double JPY){
        double RMB = JPY * 0.051;
        return RMB;
    }

    //South Korean Won Conversion
    public static double KRWtoUSD (double KRW){
        double USD = KRW * 0.00076;
        return USD;
    }
    public static double KRWtoCAD (double KRW){
        double CAD = KRW * 0.0010;
        return CAD;
    }
    public static double KRWtoEUR (double KRW){
        double EUR = KRW * 0.00072;
        return EUR;
    }
    public static double KRWtoAUD (double KRW){
        double AUD = KRW * 0.0011;
        return AUD;
    }
    public static double KRWtoJPY (double KRW){
        double JPY = KRW * 0.10;
        return JPY;
    }
    public static double KRWtoRMB (double KRW){
        double RMB = KRW * 0.0053;
        return RMB;
    }

    //Chinese Yuan Conversion
    public static double RMBtoUSD (double RMB){
        double USD = RMB * 0.14;
        return USD;
    }
    public static double RMBtoCAD (double RMB){
        double CAD = RMB * 0.19;
        return CAD;
    }
    public static double RMBtoEUR (double RMB){
        double EUR = RMB * 0.14;
        return EUR;
    }
    public static double RMBtoAUD (double RMB){
        double AUD = RMB *  0.21;
        return AUD;
    }
    public static double RMBtoJPY (double RMB){
        double JPY = RMB * 19.63;
        return JPY;
    }
    public static double RMBtoKRW (double RMB){
        double KRW = RMB * 188.57;
        return KRW;
    }
}
