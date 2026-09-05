package com.example.finalprojectl8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
       EditText etTemperature1, etTemperature2, etTemperature3, etCurrency1, etCurrency2, etCurrency3, etCurrency4, etCurrency5, etCurrency6, etCurrency7,
            etLength1, etLength2, etLength3, etLength4, etLength5, etLength6, etWeight1, etWeight2, etWeight3, etWeight4;
      Button BTNTemp, BTNCurrency, BTNLength, BTNWeight, BTNConvertT1, BTNConvertT2, BTNConvertT3, BTNConvertC1, BTNConvertC2, BTNConvertC3, BTNConvertC4,
            BTNConvertC5, BTNConvertC6, BTNConvertC7, BTNConvertL1, BTNConvertL2, BTNConvertL3, BTNConvertL4, BTNConvertL5, BTNConvertL6, BTNConvertW1,
            BTNConvertW2, BTNConvertW3, BTNConvertW4, BTNClear1, BTNClear2, BTNClear3, BTNClear4, BTNMainMenu1, BTNMainMenu2, BTNMainMenu3, BTNMainMenu4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OnInit();
    }

    public void OnClickTemp(View view) {
        setContentView(R.layout.tempconversion);
        BTNConvertT1 = findViewById(R.id.BTNConvertT1);
        BTNConvertT2 = findViewById(R.id.BTNConvertT2);
        BTNConvertT3 = findViewById(R.id.BTNConvertT3);
    }

    public void OnClickCurrency(View view) {
        setContentView(R.layout.currencyconversion);
        BTNConvertC1 = findViewById(R.id.BTNConvertC1);
        BTNConvertC2 = findViewById(R.id.BTNConvertC2);
        BTNConvertC3 = findViewById(R.id.BTNConvertC3);
        BTNConvertC4 = findViewById(R.id.BTNConvertC4);
        BTNConvertC5 = findViewById(R.id.BTNConvertC5);
        BTNConvertC6 = findViewById(R.id.BTNConvertC6);
        BTNConvertC7 = findViewById(R.id.BTNConvertC7);
    }

    public void OnClickLength(View view) {
        setContentView(R.layout.lengthconversion);
        BTNConvertL1 = findViewById(R.id.BTNConvertL1);
        BTNConvertL2 = findViewById(R.id.BTNConvertL2);
        BTNConvertL3 = findViewById(R.id.BTNConvertL3);
        BTNConvertL4 = findViewById(R.id.BTNConvertL4);
        BTNConvertL5 = findViewById(R.id.BTNConvertL5);
        BTNConvertL6 = findViewById(R.id.BTNConvertL6);
    }

    public void OnClickWeight(View view) {
        setContentView(R.layout.weightconversion);
        BTNConvertW1 = findViewById(R.id.BTNConvertW1);
        BTNConvertW2 = findViewById(R.id.BTNConvertW2);
        BTNConvertW3 = findViewById(R.id.BTNConvertW3);
        BTNConvertW4 = findViewById(R.id.BTNConvertW4);
    }

    public void OnClickClearTemp(View view) {
        BTNClear1 = findViewById(R.id.BTNClear1);
        etTemperature1 = findViewById(R.id.etTemperature1);
        etTemperature1.setText("");
        etTemperature2 = findViewById(R.id.etTemperature2);
        etTemperature2.setText("");
        etTemperature3 = findViewById(R.id.etTemperature3);
        etTemperature3.setText("");
    }

    public void OnClickClearCurrency(View view){
        BTNClear2 = findViewById(R.id.BTNClear2);
        etCurrency1 = findViewById(R.id.etCurrency1);
        etCurrency1.setText("");
        etCurrency2 = findViewById(R.id.etCurrency2);
        etCurrency2.setText("");
        etCurrency3 = findViewById(R.id.etCurrency3);
        etCurrency3.setText("");
        etCurrency4 = findViewById(R.id.etCurrency4);
        etCurrency4.setText("");
        etCurrency5 = findViewById(R.id.etCurrency5);
        etCurrency5.setText("");
        etCurrency6 = findViewById(R.id.etCurrency6);
        etCurrency6.setText("");
        etCurrency7 = findViewById(R.id.etCurrency7);
        etCurrency7.setText("");
    }

    public void OnClickClearLength(View view){
        BTNClear3 = findViewById(R.id.BTNClear3);
        etLength1 = findViewById(R.id.etLength1);
        etLength1.setText("");
        etLength2 = findViewById(R.id.etLength2);
        etLength2.setText("");
        etLength3 = findViewById(R.id.etLength3);
        etLength3.setText("");
        etLength4 = findViewById(R.id.etLength4);
        etLength4.setText("");
        etLength5 = findViewById(R.id.etLength5);
        etLength5.setText("");
        etLength6 = findViewById(R.id.etLength6);
        etLength6.setText("");
    }

    public void OnClickClearWeight(View view){
        BTNClear4 = findViewById(R.id.BTNClear4);
        etWeight1 = findViewById(R.id.etWeight1);
        etWeight1.setText("");
        etWeight2 = findViewById(R.id.etWeight2);
        etWeight2.setText("");
        etWeight3 = findViewById(R.id.etWeight3);
        etWeight3.setText("");
        etWeight4 = findViewById(R.id.etWeight4);
        etWeight4.setText("");
    }

    public void OnClickMainMenu(View view) {
        setContentView(R.layout.activity_main);
    }

    public void OnClickConvertTemp(View view) {
            BTNConvertT1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        etTemperature1 = findViewById(R.id.etTemperature1);
                        etTemperature2 =findViewById(R.id.etTemperature2);
                        etTemperature3 =findViewById(R.id.etTemperature3);
                    String f = etTemperature1.getText().toString();
                    etTemperature2.setText(String.valueOf(Temperature.FtoC(Double.parseDouble((f)))));
                    etTemperature3.setText((String.valueOf(Temperature.FtoK(Double.parseDouble(f)))));
                } catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(), "Please enter a number.", Toast.LENGTH_SHORT).show();
                }
            }});

            BTNConvertT2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        etTemperature1 = findViewById(R.id.etTemperature1);
                        etTemperature2 = findViewById(R.id.etTemperature2);
                        etTemperature3 = findViewById(R.id.etTemperature3);
                    String c = etTemperature2.getText().toString();
                    etTemperature1.setText((String.valueOf(Temperature.CtoF(Double.parseDouble(c)))));
                    etTemperature3.setText((String.valueOf(Temperature.CtoK(Double.parseDouble(c)))));
                } catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(), "Please enter a number.", Toast.LENGTH_SHORT).show();
                }
            }});

            BTNConvertT3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        etTemperature1 = findViewById(R.id.etTemperature1);
                        etTemperature2 = findViewById(R.id.etTemperature2);
                        etTemperature3 = findViewById(R.id.etTemperature3);
                    String k = etTemperature3.getText().toString();
                    etTemperature1.setText((String.valueOf(Temperature.FtoK(Double.parseDouble(k)))));
                    etTemperature2.setText((String.valueOf(Temperature.FtoC(Double.parseDouble(k)))));
                } catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(), "Please enter a number.", Toast.LENGTH_SHORT).show();
                }
            }});

    }

    public void OnClickConvertCurrency(View view) {
        BTNConvertC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    etCurrency1 = findViewById(R.id.etCurrency1);
                    etCurrency2 = findViewById(R.id.etCurrency2);
                    etCurrency3 = findViewById(R.id.etCurrency3);
                    etCurrency4 = findViewById(R.id.etCurrency4);
                    etCurrency5 = findViewById(R.id.etCurrency5);
                    etCurrency6 = findViewById(R.id.etCurrency6);
                    etCurrency7 = findViewById(R.id.etCurrency7);
                    String usd = etCurrency1.getText().toString();
                    etCurrency2.setText(String.valueOf(Currency.USDtoCAD(Double.parseDouble(usd))));
                    etCurrency3.setText(String.valueOf(Currency.USDtoEUR(Double.parseDouble(usd))));
                    etCurrency4.setText(String.valueOf(Currency.USDtoAUD(Double.parseDouble(usd))));
                    etCurrency5.setText(String.valueOf(Currency.USDtoJPY(Double.parseDouble(usd))));
                    etCurrency6.setText(String.valueOf(Currency.USDtoKRW(Double.parseDouble(usd))));
                    etCurrency7.setText(String.valueOf(Currency.USDtoRMB(Double.parseDouble(usd))));
                }catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(), "Please enter a number.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        BTNConvertC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    etCurrency1 = findViewById(R.id.etCurrency1);
                    etCurrency2 = findViewById(R.id.etCurrency2);
                    etCurrency3 = findViewById(R.id.etCurrency3);
                    etCurrency4 = findViewById(R.id.etCurrency4);
                    etCurrency5 = findViewById(R.id.etCurrency5);
                    etCurrency6 = findViewById(R.id.etCurrency6);
                    etCurrency7 = findViewById(R.id.etCurrency7);
                    String cad = etCurrency2.getText().toString();
                    etCurrency1.setText(String.valueOf(Currency.CADtoUSD(Double.parseDouble(cad))));
                    etCurrency3.setText(String.valueOf(Currency.CADtoEUR(Double.parseDouble(cad))));
                    etCurrency4.setText(String.valueOf(Currency.CADtoAUD(Double.parseDouble(cad))));
                    etCurrency5.setText(String.valueOf(Currency.CADtoJPY(Double.parseDouble(cad))));
                    etCurrency6.setText(String.valueOf(Currency.CADtoKRW(Double.parseDouble(cad))));
                    etCurrency7.setText(String.valueOf(Currency.CADtoRMB(Double.parseDouble(cad))));
                }catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(), "Please enter a number.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        BTNConvertC3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    etCurrency1 = findViewById(R.id.etCurrency1);
                    etCurrency2 = findViewById(R.id.etCurrency2);
                    etCurrency3 = findViewById(R.id.etCurrency3);
                    etCurrency4 = findViewById(R.id.etCurrency4);
                    etCurrency5 = findViewById(R.id.etCurrency5);
                    etCurrency6 = findViewById(R.id.etCurrency6);
                    etCurrency7 = findViewById(R.id.etCurrency7);
                    String eur = etCurrency3.getText().toString();
                    etCurrency1.setText(String.valueOf(Currency.EURtoUSD(Double.parseDouble(eur))));
                    etCurrency2.setText(String.valueOf(Currency.EURtoCAD(Double.parseDouble(eur))));
                    etCurrency4.setText(String.valueOf(Currency.EURtoAUD(Double.parseDouble(eur))));
                    etCurrency5.setText(String.valueOf(Currency.EURtoJPY(Double.parseDouble(eur))));
                    etCurrency6.setText(String.valueOf(Currency.EURtoKRW(Double.parseDouble(eur))));
                    etCurrency7.setText(String.valueOf(Currency.EURtoRMB(Double.parseDouble(eur))));
                }catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(), "Please enter a number.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        BTNConvertC4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    etCurrency1 = findViewById(R.id.etCurrency1);
                    etCurrency2 = findViewById(R.id.etCurrency2);
                    etCurrency3 = findViewById(R.id.etCurrency3);
                    etCurrency4 = findViewById(R.id.etCurrency4);
                    etCurrency5 = findViewById(R.id.etCurrency5);
                    etCurrency6 = findViewById(R.id.etCurrency6);
                    etCurrency7 = findViewById(R.id.etCurrency7);
                    String aud = etCurrency4.getText().toString();
                    etCurrency1.setText(String.valueOf(Currency.AUDtoUSD(Double.parseDouble(aud))));
                    etCurrency2.setText(String.valueOf(Currency.AUDtoCAD(Double.parseDouble(aud))));
                    etCurrency3.setText(String.valueOf(Currency.AUDtoEUR(Double.parseDouble(aud))));
                    etCurrency5.setText(String.valueOf(Currency.AUDtoJPY(Double.parseDouble(aud))));
                    etCurrency6.setText(String.valueOf(Currency.AUDtoKRW(Double.parseDouble(aud))));
                    etCurrency7.setText(String.valueOf(Currency.AUDtoRMB(Double.parseDouble(aud))));
                }catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(), "Please enter a number.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        BTNConvertC5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    etCurrency1 = findViewById(R.id.etCurrency1);
                    etCurrency2 = findViewById(R.id.etCurrency2);
                    etCurrency3 = findViewById(R.id.etCurrency3);
                    etCurrency4 = findViewById(R.id.etCurrency4);
                    etCurrency5 = findViewById(R.id.etCurrency5);
                    etCurrency6 = findViewById(R.id.etCurrency6);
                    etCurrency7 = findViewById(R.id.etCurrency7);
                    String jpy = etCurrency5.getText().toString();
                    etCurrency1.setText(String.valueOf(Currency.JPYtoUSD(Double.parseDouble(jpy))));
                    etCurrency2.setText(String.valueOf(Currency.JPYtoCAD(Double.parseDouble(jpy))));
                    etCurrency3.setText(String.valueOf(Currency.JPYtoEUR(Double.parseDouble(jpy))));
                    etCurrency4.setText(String.valueOf(Currency.JPYtoAUD(Double.parseDouble(jpy))));
                    etCurrency6.setText(String.valueOf(Currency.JPYtoKRW(Double.parseDouble(jpy))));
                    etCurrency7.setText(String.valueOf(Currency.JPYtoRMB(Double.parseDouble(jpy))));
                }catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(), "Please enter a number.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        BTNConvertC6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    etCurrency1 = findViewById(R.id.etCurrency1);
                    etCurrency2 = findViewById(R.id.etCurrency2);
                    etCurrency3 = findViewById(R.id.etCurrency3);
                    etCurrency4 = findViewById(R.id.etCurrency4);
                    etCurrency5 = findViewById(R.id.etCurrency5);
                    etCurrency6 = findViewById(R.id.etCurrency6);
                    etCurrency7 = findViewById(R.id.etCurrency7);
                    String krw = etCurrency6.getText().toString();
                    etCurrency1.setText(String.valueOf(Currency.KRWtoUSD(Double.parseDouble(krw))));
                    etCurrency2.setText(String.valueOf(Currency.KRWtoCAD(Double.parseDouble(krw))));
                    etCurrency3.setText(String.valueOf(Currency.KRWtoEUR(Double.parseDouble(krw))));
                    etCurrency4.setText(String.valueOf(Currency.KRWtoAUD(Double.parseDouble(krw))));
                    etCurrency5.setText(String.valueOf(Currency.KRWtoJPY(Double.parseDouble(krw))));
                    etCurrency7.setText(String.valueOf(Currency.KRWtoRMB(Double.parseDouble(krw))));
                }catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(), "Please enter a number.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        BTNConvertC7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    etCurrency1 = findViewById(R.id.etCurrency1);
                    etCurrency2 = findViewById(R.id.etCurrency2);
                    etCurrency3 = findViewById(R.id.etCurrency3);
                    etCurrency4 = findViewById(R.id.etCurrency4);
                    etCurrency5 = findViewById(R.id.etCurrency5);
                    etCurrency6 = findViewById(R.id.etCurrency6);
                    etCurrency7 = findViewById(R.id.etCurrency7);
                    String rmb = etCurrency7.getText().toString();
                    etCurrency1.setText(String.valueOf(Currency.RMBtoUSD(Double.parseDouble(rmb))));
                    etCurrency2.setText(String.valueOf(Currency.RMBtoCAD(Double.parseDouble(rmb))));
                    etCurrency3.setText(String.valueOf(Currency.RMBtoEUR(Double.parseDouble(rmb))));
                    etCurrency4.setText(String.valueOf(Currency.RMBtoAUD(Double.parseDouble(rmb))));
                    etCurrency5.setText(String.valueOf(Currency.RMBtoJPY(Double.parseDouble(rmb))));
                    etCurrency6.setText(String.valueOf(Currency.RMBtoKRW(Double.parseDouble(rmb))));
                }catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(), "Please enter a number.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void OnClickConvertLength(View view) {
        BTNConvertL1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    etLength1 = findViewById(R.id.etLength1);
                    etLength2 = findViewById(R.id.etLength2);
                    etLength3 = findViewById(R.id.etLength3);
                    etLength4 = findViewById(R.id.etLength4);
                    etLength5 = findViewById(R.id.etLength5);
                    etLength6 = findViewById(R.id.etLength6);
                    String cm = etLength1.getText().toString();
                    etLength2.setText(String.valueOf(Length.CMtoM(Double.parseDouble(cm))));
                    etLength3.setText(String.valueOf(Length.CMtoIN(Double.parseDouble(cm))));
                    etLength4.setText(String.valueOf(Length.CMtoFT(Double.parseDouble(cm))));
                    etLength5.setText(String.valueOf(Length.CMtoYD(Double.parseDouble(cm))));
                    etLength6.setText(String.valueOf(Length.CMtoMI(Double.parseDouble(cm))));
                }catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(), "Please enter a number.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        BTNConvertL2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    etLength1 = findViewById(R.id.etLength1);
                    etLength2 = findViewById(R.id.etLength2);
                    etLength3 = findViewById(R.id.etLength3);
                    etLength4 = findViewById(R.id.etLength4);
                    etLength5 = findViewById(R.id.etLength5);
                    etLength6 = findViewById(R.id.etLength6);
                    String m = etLength2.getText().toString();
                    etLength1.setText(String.valueOf(Length.MtoCM(Double.parseDouble(m))));
                    etLength3.setText(String.valueOf(Length.MtoIN(Double.parseDouble(m))));
                    etLength4.setText(String.valueOf(Length.MtoFT(Double.parseDouble(m))));
                    etLength5.setText(String.valueOf(Length.MtoYD(Double.parseDouble(m))));
                    etLength6.setText(String.valueOf(Length.MtoMI(Double.parseDouble(m))));
                }catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(), "Please enter a number.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        BTNConvertL3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    etLength1 = findViewById(R.id.etLength1);
                    etLength2 = findViewById(R.id.etLength2);
                    etLength3 = findViewById(R.id.etLength3);
                    etLength4 = findViewById(R.id.etLength4);
                    etLength5 = findViewById(R.id.etLength5);
                    etLength6 = findViewById(R.id.etLength6);
                    String in = etLength3.getText().toString();
                    etLength1.setText(String.valueOf(Length.INtoCM(Double.parseDouble(in))));
                    etLength2.setText(String.valueOf(Length.INtoM(Double.parseDouble(in))));
                    etLength4.setText(String.valueOf(Length.INtoFT(Double.parseDouble(in))));
                    etLength5.setText(String.valueOf(Length.INtoYD(Double.parseDouble(in))));
                    etLength6.setText(String.valueOf(Length.INtoMI(Double.parseDouble(in))));
                }catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(), "Please enter a number.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        BTNConvertL4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    etLength1 = findViewById(R.id.etLength1);
                    etLength2 = findViewById(R.id.etLength2);
                    etLength3 = findViewById(R.id.etLength3);
                    etLength4 = findViewById(R.id.etLength4);
                    etLength5 = findViewById(R.id.etLength5);
                    etLength6 = findViewById(R.id.etLength6);
                    String ft = etLength4.getText().toString();
                    etLength1.setText(String.valueOf(Length.FTtoCM(Double.parseDouble(ft))));
                    etLength2.setText(String.valueOf(Length.FTtoM(Double.parseDouble(ft))));
                    etLength3.setText(String.valueOf(Length.FTtoIN(Double.parseDouble(ft))));
                    etLength5.setText(String.valueOf(Length.FTtoYD(Double.parseDouble(ft))));
                    etLength6.setText(String.valueOf(Length.FTtoMI(Double.parseDouble(ft))));

                }catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(), "Please enter a number.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        BTNConvertL5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    etLength1 = findViewById(R.id.etLength1);
                    etLength2 = findViewById(R.id.etLength2);
                    etLength3 = findViewById(R.id.etLength3);
                    etLength4 = findViewById(R.id.etLength4);
                    etLength5 = findViewById(R.id.etLength5);
                    etLength6 = findViewById(R.id.etLength6);
                    String yd = etLength5.getText().toString();
                    etLength1.setText(String.valueOf(Length.YDtoCM(Double.parseDouble(yd))));
                    etLength2.setText(String.valueOf(Length.YDtoM(Double.parseDouble(yd))));
                    etLength3.setText(String.valueOf(Length.YDtoIN(Double.parseDouble(yd))));
                    etLength4.setText(String.valueOf(Length.YDtoFT(Double.parseDouble(yd))));
                    etLength6.setText(String.valueOf(Length.YDtoMI(Double.parseDouble(yd))));
                }catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(), "Please enter a number.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        BTNConvertL6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    etLength1 = findViewById(R.id.etLength1);
                    etLength2 = findViewById(R.id.etLength2);
                    etLength3 = findViewById(R.id.etLength3);
                    etLength4 = findViewById(R.id.etLength4);
                    etLength5 = findViewById(R.id.etLength5);
                    etLength6 = findViewById(R.id.etLength6);
                    String mi = etLength6.getText().toString();
                    etLength1.setText(String.valueOf(Length.MItoCM(Double.parseDouble(mi))));
                    etLength2.setText(String.valueOf(Length.MItoM(Double.parseDouble(mi))));
                    etLength3.setText(String.valueOf(Length.MItoIN(Double.parseDouble(mi))));
                    etLength4.setText(String.valueOf(Length.MItoFT(Double.parseDouble(mi))));
                    etLength5.setText(String.valueOf(Length.MItoYD(Double.parseDouble(mi))));
                }catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(), "Please enter a number.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void OnClickConvertWeight(View view) {
        BTNConvertW1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    etWeight1 = findViewById(R.id.etWeight1);
                    etWeight2 = findViewById(R.id.etWeight2);
                    etWeight3 = findViewById(R.id.etWeight3);
                    etWeight4 = findViewById(R.id.etWeight4);
                    String mg = etWeight1.getText().toString();
                    etWeight2.setText(String.valueOf(Weight.MGtoG(Double.parseDouble(mg))));
                    etWeight3.setText(String.valueOf(Weight.MGtoKG(Double.parseDouble(mg))));
                    etWeight4.setText(String.valueOf(Weight.MGtoT(Double.parseDouble(mg))));

                }catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(), "Please enter a number.",Toast.LENGTH_SHORT).show();
                }
            }
        });

        BTNConvertW2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    etWeight1 = findViewById(R.id.etWeight1);
                    etWeight2 = findViewById(R.id.etWeight2);
                    etWeight3 = findViewById(R.id.etWeight3);
                    etWeight4 = findViewById(R.id.etWeight4);
                    String g = etWeight2.getText().toString();
                    etWeight1.setText(String.valueOf(Weight.GtoMG(Double.parseDouble(g))));
                    etWeight3.setText(String.valueOf(Weight.GtoKG(Double.parseDouble(g))));
                    etWeight4.setText(String.valueOf(Weight.GtoT(Double.parseDouble(g))));
                }catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(), "Please enter a number.",Toast.LENGTH_SHORT).show();
                }
            }
        });

        BTNConvertW3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    etWeight1 = findViewById(R.id.etWeight1);
                    etWeight2 = findViewById(R.id.etWeight2);
                    etWeight3 = findViewById(R.id.etWeight3);
                    etWeight4 = findViewById(R.id.etWeight4);
                    String kg = etWeight3.getText().toString();
                    etWeight1.setText(String.valueOf(Weight.KGtoMG(Double.parseDouble(kg))));
                    etWeight2.setText(String.valueOf(Weight.KGtoG(Double.parseDouble(kg))));
                    etWeight4.setText(String.valueOf(Weight.KGtoT(Double.parseDouble(kg))));
                }catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(), "Please enter a number.",Toast.LENGTH_SHORT).show();
                }
            }
        });

        BTNConvertW4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    etWeight1 = findViewById(R.id.etWeight1);
                    etWeight2 = findViewById(R.id.etWeight2);
                    etWeight3 = findViewById(R.id.etWeight3);
                    etWeight4 = findViewById(R.id.etWeight4);
                    String t = etWeight4.getText().toString();
                    etWeight1.setText(String.valueOf(Weight.TtoMG(Double.parseDouble(t))));
                    etWeight2.setText(String.valueOf(Weight.TtoG(Double.parseDouble(t))));
                    etWeight3.setText(String.valueOf(Weight.TtoKG(Double.parseDouble(t))));
                }catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(), "Please enter a number.",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void OnInit() {
        this.BTNTemp = findViewById(R.id.BTNTemp);
        this.BTNCurrency = findViewById(R.id.BTNCurrency);
        this.BTNLength = findViewById(R.id.BTNLength);
        this.BTNWeight = findViewById(R.id.BTNWeight);
        this.BTNMainMenu1 = findViewById(R.id.BTNMainMenu1);
        this.BTNMainMenu2 = findViewById(R.id.BTNMainMenu2);
        this.BTNMainMenu3 = findViewById(R.id.BTNMainMenu3);
        this.BTNMainMenu4 = findViewById(R.id.BTNMainMenu4);
    }
}