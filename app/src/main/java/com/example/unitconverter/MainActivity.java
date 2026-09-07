package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        private EditText etTemperature1, etTemperature2, etTemperature3;
        private EditText etCurrency1, etCurrency2, etCurrency3, etCurrency4, etCurrency5, etCurrency6, etCurrency7;
        private EditText etLength1, etLength2, etLength3, etLength4, etLength5, etLength6;
        private EditText etWeight1, etWeight2, etWeight3, etWeight4;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
        }

        // =========================================================
        // NAVIGATION
        // =========================================================

        public void OnClickTemp(View view) {
                setContentView(R.layout.tempconversion);
        }

        public void OnClickCurrency(View view) {
                setContentView(R.layout.currencyconversion);
        }

        public void OnClickLength(View view) {
                setContentView(R.layout.lengthconversion);
        }

        public void OnClickWeight(View view) {
                setContentView(R.layout.weightconversion);
        }

        public void OnClickMainMenu(View view) {
                setContentView(R.layout.activity_main);
        }

        // =========================================================
        // CLEAR BUTTONS
        // =========================================================

        public void OnClickClearTemp(View view) {
                initTemperatureFields();

                etTemperature1.setText("");
                etTemperature2.setText("");
                etTemperature3.setText("");
        }

        public void OnClickClearCurrency(View view) {
                initCurrencyFields();

                etCurrency1.setText("");
                etCurrency2.setText("");
                etCurrency3.setText("");
                etCurrency4.setText("");
                etCurrency5.setText("");
                etCurrency6.setText("");
                etCurrency7.setText("");
        }

        public void OnClickClearLength(View view) {
                initLengthFields();

                etLength1.setText("");
                etLength2.setText("");
                etLength3.setText("");
                etLength4.setText("");
                etLength5.setText("");
                etLength6.setText("");
        }

        public void OnClickClearWeight(View view) {
                initWeightFields();

                etWeight1.setText("");
                etWeight2.setText("");
                etWeight3.setText("");
                etWeight4.setText("");
        }

        // =========================================================
        // TEMPERATURE CONVERTER
        // T1 = Fahrenheit
        // T2 = Celsius
        // T3 = Kelvin
        // =========================================================

        public void OnClickConvertTemp(View view) {
                initTemperatureFields();

                try {

                        if (view.getId() == R.id.BTNConvertT1) {

                                double fahrenheit = getNumber(etTemperature1);

                                etTemperature2.setText(
                                                String.valueOf(
                                                                Temperature.FtoC(fahrenheit)));

                                etTemperature3.setText(
                                                String.valueOf(
                                                                Temperature.FtoK(fahrenheit)));

                        } else if (view.getId() == R.id.BTNConvertT2) {

                                double celsius = getNumber(etTemperature2);

                                etTemperature1.setText(
                                                String.valueOf(
                                                                Temperature.CtoF(celsius)));

                                etTemperature3.setText(
                                                String.valueOf(
                                                                Temperature.CtoK(celsius)));

                        } else if (view.getId() == R.id.BTNConvertT3) {

                                double kelvin = getNumber(etTemperature3);

                                etTemperature1.setText(
                                                String.valueOf(
                                                                Temperature.KtoF(kelvin)));

                                etTemperature2.setText(
                                                String.valueOf(
                                                                Temperature.KtoC(kelvin)));
                        }

                } catch (NumberFormatException e) {
                        showNumberError();
                }
        }

        // =========================================================
        // CURRENCY CONVERTER
        //
        // C1 = USD
        // C2 = CAD
        // C3 = EUR
        // C4 = AUD
        // C5 = JPY
        // C6 = KRW
        // C7 = RMB
        // =========================================================

        public void OnClickConvertCurrency(View view) {
                initCurrencyFields();

                try {

                        if (view.getId() == R.id.BTNConvertC1) {

                                double usd = getNumber(etCurrency1);

                                etCurrency2.setText(
                                                String.valueOf(
                                                                Currency.USDtoCAD(usd)));

                                etCurrency3.setText(
                                                String.valueOf(
                                                                Currency.USDtoEUR(usd)));

                                etCurrency4.setText(
                                                String.valueOf(
                                                                Currency.USDtoAUD(usd)));

                                etCurrency5.setText(
                                                String.valueOf(
                                                                Currency.USDtoJPY(usd)));

                                etCurrency6.setText(
                                                String.valueOf(
                                                                Currency.USDtoKRW(usd)));

                                etCurrency7.setText(
                                                String.valueOf(
                                                                Currency.USDtoRMB(usd)));

                        } else if (view.getId() == R.id.BTNConvertC2) {

                                double cad = getNumber(etCurrency2);

                                etCurrency1.setText(
                                                String.valueOf(
                                                                Currency.CADtoUSD(cad)));

                                etCurrency3.setText(
                                                String.valueOf(
                                                                Currency.CADtoEUR(cad)));

                                etCurrency4.setText(
                                                String.valueOf(
                                                                Currency.CADtoAUD(cad)));

                                etCurrency5.setText(
                                                String.valueOf(
                                                                Currency.CADtoJPY(cad)));

                                etCurrency6.setText(
                                                String.valueOf(
                                                                Currency.CADtoKRW(cad)));

                                etCurrency7.setText(
                                                String.valueOf(
                                                                Currency.CADtoRMB(cad)));

                        } else if (view.getId() == R.id.BTNConvertC3) {

                                double eur = getNumber(etCurrency3);

                                etCurrency1.setText(
                                                String.valueOf(
                                                                Currency.EURtoUSD(eur)));

                                etCurrency2.setText(
                                                String.valueOf(
                                                                Currency.EURtoCAD(eur)));

                                etCurrency4.setText(
                                                String.valueOf(
                                                                Currency.EURtoAUD(eur)));

                                etCurrency5.setText(
                                                String.valueOf(
                                                                Currency.EURtoJPY(eur)));

                                etCurrency6.setText(
                                                String.valueOf(
                                                                Currency.EURtoKRW(eur)));

                                etCurrency7.setText(
                                                String.valueOf(
                                                                Currency.EURtoRMB(eur)));

                        } else if (view.getId() == R.id.BTNConvertC4) {

                                double aud = getNumber(etCurrency4);

                                etCurrency1.setText(
                                                String.valueOf(
                                                                Currency.AUDtoUSD(aud)));

                                etCurrency2.setText(
                                                String.valueOf(
                                                                Currency.AUDtoCAD(aud)));

                                etCurrency3.setText(
                                                String.valueOf(
                                                                Currency.AUDtoEUR(aud)));

                                etCurrency5.setText(
                                                String.valueOf(
                                                                Currency.AUDtoJPY(aud)));

                                etCurrency6.setText(
                                                String.valueOf(
                                                                Currency.AUDtoKRW(aud)));

                                etCurrency7.setText(
                                                String.valueOf(
                                                                Currency.AUDtoRMB(aud)));

                        } else if (view.getId() == R.id.BTNConvertC5) {

                                double jpy = getNumber(etCurrency5);

                                etCurrency1.setText(
                                                String.valueOf(
                                                                Currency.JPYtoUSD(jpy)));

                                etCurrency2.setText(
                                                String.valueOf(
                                                                Currency.JPYtoCAD(jpy)));

                                etCurrency3.setText(
                                                String.valueOf(
                                                                Currency.JPYtoEUR(jpy)));

                                etCurrency4.setText(
                                                String.valueOf(
                                                                Currency.JPYtoAUD(jpy)));

                                etCurrency6.setText(
                                                String.valueOf(
                                                                Currency.JPYtoKRW(jpy)));

                                etCurrency7.setText(
                                                String.valueOf(
                                                                Currency.JPYtoRMB(jpy)));

                        } else if (view.getId() == R.id.BTNConvertC6) {

                                double krw = getNumber(etCurrency6);

                                etCurrency1.setText(
                                                String.valueOf(
                                                                Currency.KRWtoUSD(krw)));

                                etCurrency2.setText(
                                                String.valueOf(
                                                                Currency.KRWtoCAD(krw)));

                                etCurrency3.setText(
                                                String.valueOf(
                                                                Currency.KRWtoEUR(krw)));

                                etCurrency4.setText(
                                                String.valueOf(
                                                                Currency.KRWtoAUD(krw)));

                                etCurrency5.setText(
                                                String.valueOf(
                                                                Currency.KRWtoJPY(krw)));

                                etCurrency7.setText(
                                                String.valueOf(
                                                                Currency.KRWtoRMB(krw)));

                        } else if (view.getId() == R.id.BTNConvertC7) {

                                double rmb = getNumber(etCurrency7);

                                etCurrency1.setText(
                                                String.valueOf(
                                                                Currency.RMBtoUSD(rmb)));

                                etCurrency2.setText(
                                                String.valueOf(
                                                                Currency.RMBtoCAD(rmb)));

                                etCurrency3.setText(
                                                String.valueOf(
                                                                Currency.RMBtoEUR(rmb)));

                                etCurrency4.setText(
                                                String.valueOf(
                                                                Currency.RMBtoAUD(rmb)));

                                etCurrency5.setText(
                                                String.valueOf(
                                                                Currency.RMBtoJPY(rmb)));

                                etCurrency6.setText(
                                                String.valueOf(
                                                                Currency.RMBtoKRW(rmb)));
                        }

                } catch (NumberFormatException e) {
                        showNumberError();
                }
        }

        // =========================================================
        // LENGTH CONVERTER
        //
        // L1 = CM
        // L2 = M
        // L3 = IN
        // L4 = FT
        // L5 = YD
        // L6 = MI
        // =========================================================

        public void OnClickConvertLength(View view) {
                initLengthFields();

                try {

                        if (view.getId() == R.id.BTNConvertL1) {

                                double cm = getNumber(etLength1);

                                etLength2.setText(
                                                String.valueOf(
                                                                Length.CMtoM(cm)));

                                etLength3.setText(
                                                String.valueOf(
                                                                Length.CMtoIN(cm)));

                                etLength4.setText(
                                                String.valueOf(
                                                                Length.CMtoFT(cm)));

                                etLength5.setText(
                                                String.valueOf(
                                                                Length.CMtoYD(cm)));

                                etLength6.setText(
                                                String.valueOf(
                                                                Length.CMtoMI(cm)));

                        } else if (view.getId() == R.id.BTNConvertL2) {

                                double m = getNumber(etLength2);

                                etLength1.setText(
                                                String.valueOf(
                                                                Length.MtoCM(m)));

                                etLength3.setText(
                                                String.valueOf(
                                                                Length.MtoIN(m)));

                                etLength4.setText(
                                                String.valueOf(
                                                                Length.MtoFT(m)));

                                etLength5.setText(
                                                String.valueOf(
                                                                Length.MtoYD(m)));

                                etLength6.setText(
                                                String.valueOf(
                                                                Length.MtoMI(m)));

                        } else if (view.getId() == R.id.BTNConvertL3) {

                                double inches = getNumber(etLength3);

                                etLength1.setText(
                                                String.valueOf(
                                                                Length.INtoCM(inches)));

                                etLength2.setText(
                                                String.valueOf(
                                                                Length.INtoM(inches)));

                                etLength4.setText(
                                                String.valueOf(
                                                                Length.INtoFT(inches)));

                                etLength5.setText(
                                                String.valueOf(
                                                                Length.INtoYD(inches)));

                                etLength6.setText(
                                                String.valueOf(
                                                                Length.INtoMI(inches)));

                        } else if (view.getId() == R.id.BTNConvertL4) {

                                double ft = getNumber(etLength4);

                                etLength1.setText(
                                                String.valueOf(
                                                                Length.FTtoCM(ft)));

                                etLength2.setText(
                                                String.valueOf(
                                                                Length.FTtoM(ft)));

                                etLength3.setText(
                                                String.valueOf(
                                                                Length.FTtoIN(ft)));

                                etLength5.setText(
                                                String.valueOf(
                                                                Length.FTtoYD(ft)));

                                etLength6.setText(
                                                String.valueOf(
                                                                Length.FTtoMI(ft)));

                        } else if (view.getId() == R.id.BTNConvertL5) {

                                double yd = getNumber(etLength5);

                                etLength1.setText(
                                                String.valueOf(
                                                                Length.YDtoCM(yd)));

                                etLength2.setText(
                                                String.valueOf(
                                                                Length.YDtoM(yd)));

                                etLength3.setText(
                                                String.valueOf(
                                                                Length.YDtoIN(yd)));

                                etLength4.setText(
                                                String.valueOf(
                                                                Length.YDtoFT(yd)));

                                etLength6.setText(
                                                String.valueOf(
                                                                Length.YDtoMI(yd)));

                        } else if (view.getId() == R.id.BTNConvertL6) {

                                double mi = getNumber(etLength6);

                                etLength1.setText(
                                                String.valueOf(
                                                                Length.MItoCM(mi)));

                                etLength2.setText(
                                                String.valueOf(
                                                                Length.MItoM(mi)));

                                etLength3.setText(
                                                String.valueOf(
                                                                Length.MItoIN(mi)));

                                etLength4.setText(
                                                String.valueOf(
                                                                Length.MItoFT(mi)));

                                etLength5.setText(
                                                String.valueOf(
                                                                Length.MItoYD(mi)));
                        }

                } catch (NumberFormatException e) {
                        showNumberError();
                }
        }

        // =========================================================
        // WEIGHT CONVERTER
        //
        // W1 = MG
        // W2 = G
        // W3 = KG
        // W4 = T
        // =========================================================

        public void OnClickConvertWeight(View view) {
                initWeightFields();

                try {

                        if (view.getId() == R.id.BTNConvertW1) {

                                double mg = getNumber(etWeight1);

                                etWeight2.setText(
                                                String.valueOf(
                                                                Weight.MGtoG(mg)));

                                etWeight3.setText(
                                                String.valueOf(
                                                                Weight.MGtoKG(mg)));

                                etWeight4.setText(
                                                String.valueOf(
                                                                Weight.MGtoT(mg)));

                        } else if (view.getId() == R.id.BTNConvertW2) {

                                double g = getNumber(etWeight2);

                                etWeight1.setText(
                                                String.valueOf(
                                                                Weight.GtoMG(g)));

                                etWeight3.setText(
                                                String.valueOf(
                                                                Weight.GtoKG(g)));

                                etWeight4.setText(
                                                String.valueOf(
                                                                Weight.GtoT(g)));

                        } else if (view.getId() == R.id.BTNConvertW3) {

                                double kg = getNumber(etWeight3);

                                etWeight1.setText(
                                                String.valueOf(
                                                                Weight.KGtoMG(kg)));

                                etWeight2.setText(
                                                String.valueOf(
                                                                Weight.KGtoG(kg)));

                                etWeight4.setText(
                                                String.valueOf(
                                                                Weight.KGtoT(kg)));

                        } else if (view.getId() == R.id.BTNConvertW4) {

                                double tons = getNumber(etWeight4);

                                etWeight1.setText(
                                                String.valueOf(
                                                                Weight.TtoMG(tons)));

                                etWeight2.setText(
                                                String.valueOf(
                                                                Weight.TtoG(tons)));

                                etWeight3.setText(
                                                String.valueOf(
                                                                Weight.TtoKG(tons)));
                        }

                } catch (NumberFormatException e) {
                        showNumberError();
                }
        }

        // =========================================================
        // INITIALIZE TEMPERATURE FIELDS
        // =========================================================

        private void initTemperatureFields() {

                etTemperature1 = findViewById(
                                R.id.etTemperature1);

                etTemperature2 = findViewById(
                                R.id.etTemperature2);

                etTemperature3 = findViewById(
                                R.id.etTemperature3);
        }

        // =========================================================
        // INITIALIZE CURRENCY FIELDS
        // =========================================================

        private void initCurrencyFields() {

                etCurrency1 = findViewById(
                                R.id.etCurrency1);

                etCurrency2 = findViewById(
                                R.id.etCurrency2);

                etCurrency3 = findViewById(
                                R.id.etCurrency3);

                etCurrency4 = findViewById(
                                R.id.etCurrency4);

                etCurrency5 = findViewById(
                                R.id.etCurrency5);

                etCurrency6 = findViewById(
                                R.id.etCurrency6);

                etCurrency7 = findViewById(
                                R.id.etCurrency7);
        }

        // =========================================================
        // INITIALIZE LENGTH FIELDS
        // =========================================================

        private void initLengthFields() {

                etLength1 = findViewById(
                                R.id.etLength1);

                etLength2 = findViewById(
                                R.id.etLength2);

                etLength3 = findViewById(
                                R.id.etLength3);

                etLength4 = findViewById(
                                R.id.etLength4);

                etLength5 = findViewById(
                                R.id.etLength5);

                etLength6 = findViewById(
                                R.id.etLength6);
        }

        // =========================================================
        // INITIALIZE WEIGHT FIELDS
        // =========================================================

        private void initWeightFields() {

                etWeight1 = findViewById(
                                R.id.etWeight1);

                etWeight2 = findViewById(
                                R.id.etWeight2);

                etWeight3 = findViewById(
                                R.id.etWeight3);

                etWeight4 = findViewById(
                                R.id.etWeight4);
        }

        // =========================================================
        // INPUT HELPER
        // =========================================================

        private double getNumber(EditText editText)
                        throws NumberFormatException {

                String value = editText
                                .getText()
                                .toString()
                                .trim();

                if (value.isEmpty()) {
                        throw new NumberFormatException(
                                        "Empty input");
                }

                return Double.parseDouble(value);
        }

        // =========================================================
        // ERROR MESSAGE
        // =========================================================

        private void showNumberError() {

                Toast.makeText(
                                getApplicationContext(),
                                "Please enter a number.",
                                Toast.LENGTH_SHORT).show();
        }
}