package com.example.autovermitung.Nutzerprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.example.autovermitung.R;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Signup extends AppCompatActivity {
    TextInputLayout regname, regusername, regemail, regphonNo, regpassword;
    Button btn, loginBtn,payBtn;

    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        regname = findViewById(R.id.name);
        regusername = findViewById(R.id.username);
        regemail = findViewById(R.id.email);
        regphonNo = findViewById(R.id.phone);
        regpassword = findViewById(R.id.password);
        btn = findViewById(R.id.regbtn);
        loginBtn = findViewById(R.id.login_btn);
        payBtn=findViewById(R.id.Payment_btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("autovermietung");
                // Get all the values
                String name = regname.getEditText().getText().toString();
                String username = regusername.getEditText().getText().toString();
                String email = regemail.getEditText().getText().toString();
                String phonNo = regphonNo.getEditText().getText().toString();
                String password = regpassword.getEditText().getText().toString();


                UserHelperClass helperClass = new UserHelperClass(name, username, email, phonNo, password);

                reference.child(phonNo).setValue(helperClass);
            }
        });

        payBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }

    public void openActivity2() {
        Intent intent = new Intent(Signup.this, PayPalPaymentLogin.class);
        startActivity(intent);

    }
    }








