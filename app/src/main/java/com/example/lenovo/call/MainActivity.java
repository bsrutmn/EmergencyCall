package com.example.lenovo.call;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button police=(Button)findViewById(R.id.police);
        Button ambulance=(Button)findViewById(R.id.ambulance);
        Button fire=(Button)findViewById(R.id.fire);
        police.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent arama=new Intent(Intent.ACTION_CALL);
                arama.setData(Uri.parse("tel:"+155));
                startActivity(arama);
            }
        });


       fire.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
                Intent arama=new Intent(Intent.ACTION_CALL);
               arama.setData(Uri.parse("tel:"+110));
               startActivity(arama);
           }
       });
        ambulance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acil=new Intent(Intent.ACTION_CALL);
                acil.setData(Uri.parse("tel:"+112));
                startActivity(acil);

            }
        });
    }
}
