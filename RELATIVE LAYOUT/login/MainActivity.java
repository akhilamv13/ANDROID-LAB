package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText text1,text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=(EditText)findViewById(R.id.text1);
        text2=(EditText)findViewById(R.id.pass);
    }
    public void login(View view) {

        String usr = text1.getText().toString().trim();
        String psw = text2.getText().toString().trim();

        if (usr.equals("")) {
            Toast.makeText(this, "Enter phone or mail", Toast.LENGTH_SHORT).show();
        } else if (psw.equals("")) {
            Toast.makeText(this, "Enter Password", Toast.LENGTH_SHORT).show();
        }
    }
    public void create(View view){
        Intent crt=new Intent(this,Activity2.class);
        startActivity(crt);
    }
}