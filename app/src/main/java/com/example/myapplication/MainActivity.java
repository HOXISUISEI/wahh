package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText pass;
    @Override
     protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
               name=(EditText) findViewById(R.id.name);
               pass=(EditText) findViewById(R.id.pass);

            }

             public void  Check(View v) {
                String mname = "hello";
                String mpass = "1234";
                String user = name.getText().toString().trim();
        String pwd = pass.getText().toString().trim();
                if (user.equals(mname) && pwd.equals(mpass)) {
            Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "好像输错了呢", Toast.LENGTH_SHORT).show();
        }
}

     }