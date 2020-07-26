package com.example.otowatertech;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class sonucMisir extends AppCompatActivity {

    TextView sonucSicaklikText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonuc_misir);

        ImageView iv;
        iv = findViewById(R.id.sulamaView);



        Intent i = getIntent();

        String sicaklik=i.getStringExtra("Sicaklik :");
        sonucSicaklikText = findViewById(R.id.sonucSicaklikText);
        sonucSicaklikText.setText(sicaklik);



        //Integer.parseInt(et.getText().toString());

        Integer sic =Integer.parseInt(sonucSicaklikText.getText().toString());

        if(sic>=24 && sic<28 ){

            iv.setImageResource(R.drawable.misir2428);

            Toast.makeText(getApplicationContext(), "Hava Sıcaklığı "+sicaklik+" Derecedir.", Toast.LENGTH_LONG ).show();
        }
        else if(sic>=28 && sic<=32){

            iv.setImageResource(R.drawable.misir2832);

            Toast.makeText(getApplicationContext(), "Hava Sıcaklığı "+sicaklik+" Derecedir.", Toast.LENGTH_LONG ).show();

        }

        
        else {

            iv.setImageResource(R.drawable.urunyetismez);

            Toast.makeText(getApplicationContext(), "Hava Sıcaklığı "+sicaklik+" Derecedir.", Toast.LENGTH_LONG ).show();

        }
    }
}
