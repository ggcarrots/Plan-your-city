package com.example.pinezka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view)
    {
        SharedPreferences userDetails = getSharedPreferences("userdetails", MODE_PRIVATE);

        SharedPreferences.Editor edit = userDetails.edit();
        edit.putString("username", "123");
        edit.putString("password", "aaa");
        edit.apply();
        finish();
    }
}
