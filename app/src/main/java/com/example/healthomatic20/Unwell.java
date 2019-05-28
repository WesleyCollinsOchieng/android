package com.example.healthomatic20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class Unwell extends AppCompatActivity {
    CheckBox radioButton, fever, rash, headache, aploss, fatigue, breathless, sorethroat;
    Button bsubmit, back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unwell);

        final CheckBox radioButton=(CheckBox) findViewById(R.id.nausea);
        final CheckBox fever=(CheckBox)findViewById(R.id.fever);
        final CheckBox rash=(CheckBox)findViewById(R.id.rash);
        final CheckBox headache=(CheckBox)findViewById(R.id.headache);
        final CheckBox aploss=(CheckBox)findViewById(R.id.aploss);
        final CheckBox fatigue=(CheckBox)findViewById(R.id.fatigue);
        final CheckBox breathless=(CheckBox)findViewById(R.id.breathless);
        final CheckBox sorethroat=(CheckBox)findViewById(R.id.sore_throat);
        final Button bsubmit=(Button)findViewById(R.id.bt_submit);
        bsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radioButton.isChecked()){
                    bsubmit.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent=new Intent(Unwell.this, Ebola.class);
                            startActivity(intent);
                            Toast.makeText(Unwell.this, "Warning; Level 5 disease", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
                else if(fever.isChecked())
                {
                    bsubmit.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent2=new Intent(Unwell.this,anaplasmosis.class);
                            startActivity(intent2);
                            Toast.makeText(Unwell.this, "Level 3 disease", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
                else if(rash.isChecked()){
                    bsubmit.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent3=new Intent(Unwell.this, Aids.class);
                            startActivity(intent3);
                            Toast.makeText(Unwell.this, "Warning; Level 5 disease", Toast.LENGTH_SHORT).show();
                        }
                    });

                }
                else if(headache.isChecked()){

                }
                else if(aploss.isChecked()){

                }
                else if(fatigue.isChecked()){

                }
                else if(breathless.isChecked()){

                }
                else if(sorethroat.isChecked()){

                }
                else {
                    Toast.makeText(Unwell.this, "Nothing checked", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
