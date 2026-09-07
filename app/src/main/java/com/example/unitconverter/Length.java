package com.example.unitconverter;

public class Length {

    public Length() {
    }

    //Centimeter Conversion
    public static double CMtoM (double CM){
        double M = CM / 100;
        return M;
    }
    public static double CMtoIN (double CM){
        double IN = CM / 2.54;
        return IN;
    }
    public static double CMtoFT (double CM){
        double FT = CM / 30.48;
        return FT;
    }
    public static double CMtoYD (double CM){
        double YD = CM / 91.44;
        return YD;
    }
    public static double CMtoMI (double CM){
        double MI = CM / 160934.4;
        return MI;
    }

    //Meter Conversion
    public static double MtoCM (double M){
        double CM = M * 100;
        return CM;
    }
    public static double MtoIN (double M){
        double IN = M / 0.0254;
        return IN;
    }
    public static double MtoFT (double M){
        double FT = M / 0.3048;
        return FT;
    }
    public static double MtoYD (double M){
        double YD = M / 0.9144;
        return YD;
    }
    public static double MtoMI (double M){
        double MI = M / 1609.344;
        return MI;
    }

    //Inches Conversion
    public static double INtoCM (double IN){
        double CM = IN * 2.54;
        return CM;
    }
    public static double INtoM (double IN){
        double M = IN * 0.0254;
        return M;
    }
    public static double INtoFT (double IN){
        double FT = IN / 12;
        return FT;
    }
    public static double INtoYD (double IN){
        double YD = IN / 36;
        return YD;
    }
    public static double INtoMI (double IN){
        double MI = IN / 63360;
        return MI;
    }

    //Feet Conversion
    public static double FTtoCM (double FT){
        double CM = FT * 30.48;
        return CM;
    }
    public static double FTtoM (double FT){
        double M = FT * 0.3048;
        return M;
    }
    public static double FTtoIN (double FT){
        double IN = FT * 12;
        return IN;
    }
    public static double FTtoYD (double FT){
        double YD = FT / 3;
        return YD;
    }
    public static double FTtoMI (double FT){
        double MI = FT / 5280;
        return MI;
    }

    //Yard Conversion
    public static double YDtoCM (double YD){
        double CM = YD * 91.44;
        return CM;
    }
    public static double YDtoM (double YD){
        double M = YD * 0.9144;
        return M;
    }
    public static double YDtoIN (double YD){
        double IN = YD * 36;
        return IN;
    }
    public static double YDtoFT (double YD){
        double FT = YD * 3;
        return FT;
    }
    public static double YDtoMI (double YD){
        double MI = YD / 1760;
        return MI;
    }

    //Miles Conversion
    public static double MItoCM (double MI){
        double CM = MI * 160934.4;
        return CM;
    }
    public static double MItoM (double MI){
        double M = MI * 1609.344;
        return M;
    }
    public static double MItoIN (double MI){
        double IN = MI * 63360;
        return IN;
    }
    public static double MItoFT (double MI){
        double FT = MI * 5280;
        return FT;
    }
    public static double MItoYD (double MI){
        double YD = MI * 1760;
        return YD;
    }
}
