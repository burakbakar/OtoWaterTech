package com.example.otowatertech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    EditText enText;
    EditText boyText;
    TextView alanText;
    EditText uzunlukText;
    String UrunText;
    EditText urunText;
    EditText metreText;



    //Spinner spinnerUrunler;
    //ArrayAdapter<String> dataAdapterForUrunler;

    //String[] urunler ={"BUĞDAY","ARPA","PİRİNÇ"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        /*
        //Intent i = new Intent(getBaseContext(), islem.class);
        //startActivity(i);

        enText = findViewById(R.id.enText);
        boyText = findViewById(R.id.boyText);
        alanText = findViewById(R.id.alanText);
        metreText = findViewById(R.id.metreText);
        uzunlukText = findViewById(R.id.uzunlukText);
        button = findViewById(R.id.button);

        //urunText = findViewById(R.id.urunText);
        UrunText ="";

        //xml'de hazırlanan spinnerlerı tanımlıyoruz
        spinnerUrunler = (Spinner) findViewById(R.id.spinner2);

        //spinnerler için adapterleri hazırlıyoruz
        dataAdapterForUrunler = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, urunler);

        //Listelenecek verilerin görünümünü belirliyoruz.
        dataAdapterForUrunler.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //Hazırladğımız Adapter'leri Spinner'lara ekliyoruz.
        spinnerUrunler.setAdapter(dataAdapterForUrunler);

        button.setVisibility(View.INVISIBLE);

        spinnerUrunler.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String Text = spinnerUrunler.getSelectedItem().toString();

                if(Text.equals("ARPA")) {
                    button.setVisibility(View.VISIBLE);

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });



    }
    public void havaDurumu(View view){
        Intent i = new Intent(getBaseContext(), HavaDurumu.class);
        startActivity(i);
    }

    public void Hesapla(View view){


        UrunText = urunText.getText().toString();


        int en = Integer.parseInt(enText.getText().toString());
        int boy = Integer.parseInt(boyText.getText().toString());

        Intent i = new Intent(getBaseContext(), islem.class);

        int sonuc = en*boy;
        String sonuc2 = String.valueOf(sonuc);
        i.putExtra("Alan :",sonuc2);

        i.putExtra("Urun :",UrunText);

        int metreFiyat = Integer.parseInt(metreText.getText().toString());
        int uzunluk = Integer.parseInt(uzunlukText.getText().toString());

        int sonucMaliyet = metreFiyat * uzunluk;
        String sonucMaliyet2 = String.valueOf(sonucMaliyet);
        i.putExtra("Maliyet :",sonucMaliyet2);



        startActivity(i);

        spinnerUrunler.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String Text = spinnerUrunler.getSelectedItem().toString();

                if(Text.equals("ARPA")) {
                    button.setVisibility(View.VISIBLE);

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });




    }
    */







    }

    public void hakkinda(View view){
        Intent i = new Intent(getBaseContext(), hakkinda.class);
        startActivity(i);
    }
    public void arpa(View view){
        Intent i = new Intent(getBaseContext(),Arpa.class);
        startActivity(i);

    }

    public void bugday(View view){
        Intent i = new Intent(getBaseContext(),Bugday.class);
        startActivity(i);
    }

    public void misir(View view){
        Intent i = new Intent(getBaseContext(),Misir.class);
        startActivity(i);
    }

    public void pirinc(View view){
        Intent i = new Intent(getBaseContext(),Pirinc.class);
        startActivity(i);
    }

}
