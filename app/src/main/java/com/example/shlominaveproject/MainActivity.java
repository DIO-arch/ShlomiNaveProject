package com.example.shlominaveproject;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
    }
    public void Login(View view) {
        Intent i=new Intent(this,Login_Activity.class);
        startActivity(i);
    }
    public void reg(View view){
        Intent i=new Intent(this,Register.class);
        startActivity(i);
    }
}