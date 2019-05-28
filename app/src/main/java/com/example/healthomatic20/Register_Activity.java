package com.example.healthomatic20;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register_Activity extends Activity {

    private Button Loginagn,Register;
    private EditText Name,Password,C_password,E_mail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_);

        Loginagn=(Button)findViewById(R.id.bt_logagn);
        Register=(Button)findViewById(R.id.bt_Register);
        Name=(EditText)findViewById(R.id.edit_name);
        Password=(EditText)findViewById(R.id.edit_pass);
        C_password=(EditText)findViewById(R.id.edit_c_pass);
        E_mail=(EditText)findViewById(R.id.edit_email);

        Loginagn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Register_Activity.this,Loginscreen.class);
                startActivity(intent);
            }
        });
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(),Password.getText().toString(),C_password.getText().toString(),E_mail.getText().toString());

            }

        });
    }
    private void validate(String Name,String Password,String C_password,String E_mail){
        if(Name.isEmpty()&&Password.isEmpty()&&C_password.isEmpty()&&E_mail.isEmpty()){
            Toast.makeText(this, "Fill details first", Toast.LENGTH_SHORT).show();
        }else {
            Intent intent=new Intent(Register_Activity.this,On_register.class);
            Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }
    }

}
