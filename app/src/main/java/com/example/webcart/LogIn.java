package com.example.webcart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LogIn extends AppCompatActivity {

    EditText uname,pass;
    Button log,reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        uname = findViewById(R.id.uname);
        pass = findViewById(R.id.pass);
        log = findViewById(R.id.log);
        reg = findViewById(R.id.reg);

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (uname.getText().toString().isEmpty() && pass.getText().toString().isEmpty()){
                    uname.setError("Enter Valid Name");
                    pass.setError("Enter Vslid Password");

                }
                else {
                    Intent i = new Intent(LogIn.this, Main_Page.class);
                    startActivity(i);
                }
            }
        });
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LogIn.this,SignUp.class);
                startActivity(i);
            }
        });
    }
}
