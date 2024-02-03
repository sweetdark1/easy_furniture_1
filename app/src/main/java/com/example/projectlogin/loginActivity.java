package com.example.projectlogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import com.example.easy_furniture_1.R;

public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    // Method to handle Forget Password click
    public void onForgetPasswordClick(View view) {
        Intent intent = new Intent(this, forgetPasswordActivity.class);
        startActivity(intent);
    }
}
