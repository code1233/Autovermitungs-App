package com.example.autovermitung.Nutzerprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;


import com.example.autovermitung.R;

public class Login extends AppCompatActivity {
    Button login;
          /*  ,login_btn;
    TextView logoText,sloganText;
    TextInputLayout username,password;*/

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

      // This Line will hide the status bar from the screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


       login=findViewById(R.id.sign_btn);
//        logoText = (Button) findViewById(R.id.logan);
//        sloganText = (Button) findViewById(R.id.sign_screen);
//        username = findViewById(R.id.username);
//        password= findViewById(R.id.password);


       login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }

    public void openActivity2() {
        Intent intent = new Intent(Login.this, Signup.class);
        startActivity(intent);

    }
}
