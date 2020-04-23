package com.example.webcart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {

    EditText id,name,pass,pass1;
    Button sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        id = findViewById(R.id.mail_id);
        name = findViewById(R.id.uname_sign);
        pass = findViewById(R.id.pass_sign);
        pass1 = findViewById(R.id.pass_sign2);
        sign = findViewById(R.id.sign);


        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (id.getText().toString().isEmpty() && name.getText().toString().isEmpty() && pass.getText().toString().isEmpty() && pass1.getText().toString().isEmpty()) {
                    // editText is empty
                } else {
                    Intent i = new Intent(SignUp.this, Main_Page.class);
                    startActivity(i);

                }
            }
        });
    }
}
