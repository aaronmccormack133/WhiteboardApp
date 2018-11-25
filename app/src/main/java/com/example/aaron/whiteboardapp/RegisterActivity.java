package com.example.aaron.whiteboardapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText emailEditText;
    private EditText passwordEditText;
    private Button registerButton;
    private EditText screenNameText;
    private LinearLayout linearOne, linearTwo;
    private Animation uptodown;
    private Animation downtoup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button registerButton = (Button) findViewById(R.id.registerBtn);

        emailEditText = (EditText) findViewById(R.id.registerEmail);
        passwordEditText = (EditText) findViewById(R.id.registerPassword);
        screenNameText = (EditText) findViewById(R.id.screenNameInput);
        linearOne = (LinearLayout) findViewById(R.id.linearOne);
        linearTwo = (LinearLayout) findViewById(R.id.linearTwo);
        uptodown = AnimationUtils.loadAnimation(this, R.anim.up_to_down);
        downtoup = AnimationUtils.loadAnimation(this, R.anim.down_to_up);

        linearOne.setAnimation(uptodown);
        linearTwo.setAnimation(downtoup);

        registerButton.setOnClickListener(this);

        Intent i = new Intent();
    }

    public void register(){
        String screenName = screenNameText.getText().toString().trim();
        String email = emailEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();

        if(TextUtils.isEmpty(screenName)){
            Toast.makeText(this, "Please enter a screen name", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(email)){
            Toast.makeText(this, "Please enter your email", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(password)){
            Toast.makeText(this, "Please enter your Password", Toast.LENGTH_SHORT).show();
            return;
        }
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }

    @Override
    public void onClick(View v){
        register();
    }
}
