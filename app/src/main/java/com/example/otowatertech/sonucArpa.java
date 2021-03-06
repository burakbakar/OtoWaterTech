package com.example.otowatertech;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class sonucArpa extends AppCompatActivity {

    TextView sonucSicaklikText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonuc_arpa);

        ImageView iv;
        iv = findViewById(R.id.sulamaView);



        Intent i = getIntent();

        String sicaklik=i.getStringExtra("Sicaklik :");
        sonucSicaklikText = findViewById(R.id.sonucSicaklikText);
        sonucSicaklikText.setText(sicaklik);



        //Integer.parseInt(et.getText().toString());

        Integer sic =Integer.parseInt(sonucSicaklikText.getText().toString());

        if(sic>=0 && sic<5 ){

            iv.setImageResource(R.drawable.arpa05);

                Toast.makeText(getApplicationContext(), "Hava Sıcaklığı "+sicaklik+" Derecedir.", Toast.LENGTH_LONG ).show();
        }
        else if(sic>=5 && sic<10){

            iv.setImageResource(R.drawable.arpa510);

            Toast.makeText(getApplicationContext(), "Hava Sıcaklığı "+sicaklik+" Derecedir.", Toast.LENGTH_LONG ).show();

        }

        else if(sic>=10 && sic<15){

            iv.setImageResource(R.drawable.arpa1015);

            Toast.makeText(getApplicationContext(), "Hava Sıcaklığı "+sicaklik+" Derecedir.", Toast.LENGTH_LONG ).show();
        }

        else if(sic>=15 && sic<=20){
            iv.setImageResource(R.drawable.arpa1520);

            Toast.makeText(getApplicationContext(), "Hava Sıcaklığı "+sicaklik+" Derecedir.", Toast.LENGTH_LONG ).show();
        }
        else {

            iv.setImageResource(R.drawable.urunyetismez);

            Toast.makeText(getApplicationContext(), "Hava Sıcaklığı "+sicaklik+" Derecedir.", Toast.LENGTH_LONG ).show();

        }





    }
}
