package com.example.healthomatic20;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Fine extends Activity {
    private Button food,workout,clothing,diseases;
    private ImageView img1, img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fine);

        food=(Button)findViewById(R.id.wte);
        workout=(Button)findViewById(R.id.woa);
        clothing=(Button)findViewById(R.id.wtw);
        diseases=(Button)findViewById(R.id.browse_d);
        img1=(ImageView)findViewById(R.id.back);
        img2=(ImageView)findViewById(R.id.menu);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Fine.this, Home.class);
                startActivity(intent);
            }
        });

        diseases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Fine.this,diseases_list.class);
                startActivity(intent);
            }
        });
        clothing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Fine.this,clothing_options.class);
                startActivity(intent);
            }
        });


    }
}
