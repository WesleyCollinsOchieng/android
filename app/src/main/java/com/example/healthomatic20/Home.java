package com.example.healthomatic20;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends Activity {
    private Button unwell,fine,notsure,aattack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        unwell=(Button)findViewById(R.id.bt_unwell);
        fine=(Button)findViewById(R.id.bt_fine);
        notsure=(Button)findViewById(R.id.bt_notsure);
        aattack=(Button)findViewById(R.id.bt_animalatk);

        unwell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this,Unwell.class);
                startActivity(intent);
            }
        });
        fine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this,Fine.class);
                startActivity(intent);
            }
        });
        notsure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this,Notsure.class);
                startActivity(intent);
            }
        });
        aattack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this,Animalattack.class);
                startActivity(intent);

            }
        });

    }
}
