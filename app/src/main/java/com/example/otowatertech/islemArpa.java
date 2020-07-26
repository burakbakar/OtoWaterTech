package com.example.otowatertech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class islemArpa extends AppCompatActivity {

    TextView urunSonucText;
    TextView alanText;
    TextView uzunlukText;
    TextView maliyetText;
    TextView adetText;
    TextView sicaklikText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_islem_arpa);

        alanText = findViewById(R.id.alanText);
        uzunlukText = findViewById(R.id.uzunlukText);
        maliyetText = findViewById(R.id.maliyetText);
        adetText = findViewById(R.id.adetText);
        sicaklikText = findViewById(R.id.sicaklikText);

        Intent i = getIntent();
        String sonuc2 = i.getStringExtra("Alan :");
        //int sonuc2 = Integer.parseInt(alanText.getText().toString());
        alanText.setText(sonuc2);

        Intent i2 = getIntent();
        String sonucUzunluk = i2.getStringExtra("Uzunluk :");
        uzunlukText.setText(sonucUzunluk);

        Intent i3 = getIntent();
        String sonucMaliyet = i3.getStringExtra("Maliyet :");
        maliyetText.setText(sonucMaliyet);

        Intent i4 = getIntent();
        String sonucAdet = i4.getStringExtra("Adet :");
        adetText.setText(sonucAdet);

        //Intent i5 = getIntent();
        //String sonucSicaklik = i5.getStringExtra("Sicaklik :");
        //sicaklikText.setText(sonucSicaklik);






        //maliyetText = findViewById(R.id.maliyetText);
        //urunSonucText = findViewById(R.id.urunSonucText);

        //Intent i = getIntent();
        //String UrunText = i.getStringExtra("Urun :");
        //urunSonucText.setText(UrunText);


        //String sonuc = i.getStringExtra("Alan :");
        //alanText.setText(sonuc);

        //Intent inn = getIntent();
        //String sonucMaliyet2 = inn.getStringExtra("Maliyet :");
        //maliyetText.setText(sonucMaliyet2);


    }

    public void havaDurumu(View view) {
        Intent i = new Intent(getBaseContext(), HavaDurumu.class);
        startActivity(i);
    }

    public void sonucHesapArpa(View view){
        Intent i = new Intent(getBaseContext(), sonucArpa.class);


        i.putExtra("Sicaklik :",sicaklikText.getText().toString());

        startActivity(i);
    }

}
