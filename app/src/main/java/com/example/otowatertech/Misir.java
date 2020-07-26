package com.example.otowatertech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Misir extends AppCompatActivity {

    EditText enText;
    EditText boyText;
    EditText aralikText;
    EditText fiyatText;
    EditText uzunlukText;
    TextView alanText;
    EditText adetText;

    EditText metreText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_misir);


        enText = findViewById(R.id.enText);
        boyText = findViewById(R.id.boyText);
        alanText = findViewById(R.id.alanText);

        aralikText = findViewById(R.id.aralikText);
        fiyatText = findViewById(R.id.fiyatText);


    }

    public void Hesapla(View view){
        int en = Integer.parseInt(enText.getText().toString());
        int boy = Integer.parseInt(boyText.getText().toString());

        Intent i = new Intent(getBaseContext(), islemMisir.class);

        int sonuc = en*boy;
        String sonuc2 = String.valueOf(sonuc);
        i.putExtra("Alan :",sonuc2);

        int aralik = Integer.parseInt(aralikText.getText().toString());
        int boruUzunluk = ((boy/aralik)-1)*en;
        String sonucUzunluk = String.valueOf(boruUzunluk);
        i.putExtra("Uzunluk :",sonucUzunluk);



        int metreFiyat = Integer.parseInt(fiyatText.getText().toString());
        int boruMaliyet = boruUzunluk * metreFiyat;
        String sonucMaliyet = String.valueOf(boruMaliyet);
        i.putExtra("Maliyet :",sonucMaliyet);


        int tohumAdet = (boy/aralik)*(en/aralik);
        String sonucAdet = String.valueOf(tohumAdet);
        i.putExtra("Adet :",sonucAdet);



        //int uzunluk = Integer.parseInt(uzunlukText.getText().toString());

        //int sonucMaliyet = metreFiyat * uzunluk;
        //String sonucMaliyet2 = String.valueOf(sonucMaliyet);
        //i.putExtra("Maliyet :",sonucMaliyet2);



        startActivity(i);
    }

}
