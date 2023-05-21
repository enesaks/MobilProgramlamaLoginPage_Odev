package com.example.mobilprogramlamaloginpage_odev;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    Button btnRegister,btnLoginPage;
    EditText edtUsername, edtPassaword,edtEmail;
    String username,passaword,email;
    DatabaseHelper dbHelper;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnLoginPage = findViewById(R.id.btnLogin);
        btnRegister = findViewById(R.id.btnRegister);
        edtPassaword = findViewById(R.id.edtPassaword);
        edtUsername = findViewById(R.id.edtUsername);
        edtEmail = findViewById(R.id.edtEmail);

        dbHelper = new DatabaseHelper(this);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();




        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username = edtUsername.getText().toString();
                email = edtEmail.getText().toString();
                passaword = edtPassaword.getText().toString();
                values.put("username",username);
                values.put("passaword",passaword);
                values.put("email",email);

                long newRowId = db.insert("person",null,values);

                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);
            }
        });


        btnLoginPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

}