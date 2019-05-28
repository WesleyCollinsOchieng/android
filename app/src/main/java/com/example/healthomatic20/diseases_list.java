package com.example.healthomatic20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class diseases_list extends AppCompatActivity {
    Button Ebola,Aids,Anaplasmosis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diseases_list);

        final Button Ebola=(Button)findViewById(R.id.ebola_bt);
        Aids=(Button)findViewById(R.id.aids_bt);
        Anaplasmosis=(Button)findViewById(R.id.Anaplasmosis_bt);

        Ebola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(diseases_list.this,Ebola.class);
                startActivity(intent);
            }
        });

        Aids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(diseases_list.this, com.example.healthomatic20.Aids.class);
                startActivity(intent);
            }
        });
        Anaplasmosis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(diseases_list.this,anaplasmosis.class);
                startActivity(intent);
            }
        });
    }
}
