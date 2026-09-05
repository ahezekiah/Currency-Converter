package com.example.finalprojectl8;

public class Weight {

    public Weight() {
    }

    //Milligram Conversion
    public static double MGtoG (double MG){
        double G = MG / 1000;
        return G;
    }
    public static double MGtoKG (double MG){
        double KG = MG / 1000000;
        return KG;
    }
    public static double MGtoT (double MG){
        double T = MG / 1000000000;
        return T;
    }

    //Gram Conversion
    public static double GtoMG (double G){
        double MG = G * 1000;
        return MG;
    }
    public static double GtoKG (double G){
        double KG = G / 1000;
        return KG;
    }
    public static double GtoT (double G){
        double T = G / 1000000;
        return T;
    }

    //Kilogram Conversion
    public static double KGtoMG (double KG){
        double MG = KG * 1000000;
        return MG;
    }
    public static double KGtoG (double KG){
        double G = KG * 1000;
        return G;
    }
    public static double KGtoT (double KG){
        double T = KG / 1000;
        return T;
    }

    //Metric Ton Conversion
    public static double TtoMG (double T){
        double MG = T * 1000000000;
        return MG;
    }
    public static double TtoG (double T){
        double G = T * 1000000;
        return G;
    }
    public static double TtoKG (double T){
        double KG = T * 1000;
        return KG;
    }
}
