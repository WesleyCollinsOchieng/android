package com.example.healthomatic20;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Loginscreen extends Activity {
    private EditText Username,Password;
    private Button Login,Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginscreen);

        Username=(EditText)findViewById(R.id.username);
        Password=(EditText)findViewById(R.id.password);
        Login=(Button)findViewById(R.id.bt_login);
        Register=(Button)findViewById(R.id.bt_Register);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Username.getText().toString(),Password.getText().toString());
            }
        });
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Loginscreen.this,Register_Activity.class);
                startActivity(intent);
            }
        });

    }
    private void validate(String Username,String Password){
        if(Username.equals("Wesley") && (Password.equals("23456"))){
            Intent intent2=new Intent(Loginscreen.this,popup_notify.class);
            startActivity(intent2);
        }else if(Username.isEmpty()&&(Password.isEmpty())){
            Toast.makeText(this, "Enter details to continue", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "Incorrect details", Toast.LENGTH_SHORT).show();
        }
    }

}
