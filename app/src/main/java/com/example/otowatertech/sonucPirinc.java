package com.example.otowatertech;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class sonucPirinc extends AppCompatActivity {

    TextView sonucSicaklikText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonuc_pirinc);

        ImageView iv;
        iv = findViewById(R.id.sulamaView);



        Intent i = getIntent();

        String sicaklik=i.getStringExtra("Sicaklik :");
        sonucSicaklikText = findViewById(R.id.sonucSicaklikText);
        sonucSicaklikText.setText(sicaklik);



        //Integer.parseInt(et.getText().toString());

        Integer sic =Integer.parseInt(sonucSicaklikText.getText().toString());

        if(sic>=20 && sic<25 ){

            iv.setImageResource(R.drawable.pirinc2025);

            Toast.makeText(getApplicationContext(), "Hava Sıcaklığı "+sicaklik+" Derecedir.", Toast.LENGTH_LONG ).show();
        }
        else if(sic>=25 && sic<30){

            iv.setImageResource(R.drawable.pirinc2530);

            Toast.makeText(getApplicationContext(), "Hava Sıcaklığı "+sicaklik+" Derecedir.", Toast.LENGTH_LONG ).show();

        }
        else if(sic>=30 && sic<=35){

            iv.setImageResource(R.drawable.pirinc3035);

            Toast.makeText(getApplicationContext(), "Hava Sıcaklığı "+sicaklik+" Derecedir.", Toast.LENGTH_LONG ).show();

        }


        else {

            iv.setImageResource(R.drawable.urunyetismez);

            Toast.makeText(getApplicationContext(), "Hava Sıcaklığı "+sicaklik+" Derecedir.", Toast.LENGTH_LONG ).show();

        }
    }
}
