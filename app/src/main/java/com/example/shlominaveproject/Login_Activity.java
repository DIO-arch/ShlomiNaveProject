package com.example.shlominaveproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {
    private EditText username;
    private EditText email;
    private EditText pass;
    EditText code;
    Switch s1;
    Switch s2;
    Switch s3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);
        username = findViewById(R.id.tvusername);
        email = findViewById(R.id.tvemail);
        pass = findViewById(R.id.editTextTextPassword);
        code = findViewById(R.id.etcode);
        s1=findViewById(R.id.switchIND);
        s2=findViewById(R.id.switchEMPLOYEE);
        s3=findViewById(R.id.switchMANAGER);


    }
    public void switchchange(View V) {
        if (V == s3) {
            s1.setChecked(false);
            s2.setChecked(false);
        } else if(V==s2)
        {
           s1.setChecked(false);
           s3.setChecked(false);
        }
        else {
            s2.setChecked(false);
            s3.setChecked(false);
        }
    }
    public void infobtn(View v)
    {
        Toast.makeText(this,"Enter the code given to you, not relevant to independent users",Toast.LENGTH_LONG).show();
    }
    public void LoginToast(View v) {
        if (username.getText().length() == 0 || email.getText().length() == 0 || pass.getText().length() < 8 ||(s1.isChecked()==false&& s2.isChecked()==false&& s3.isChecked()==false))
            Toast.makeText(this, "enter values to all areas(including choosing a user type,password must have at least 8 chars", Toast.LENGTH_SHORT).show();
        else {
            Toast.makeText(this, "Login complete! "+"username:" + String.valueOf(username.getText()) + ",email:" + String.valueOf(email.getText()) + ",password:" + String.valueOf(pass.getText()), Toast.LENGTH_SHORT).show();
            if (s1.isChecked()) {
                Intent i = new Intent(this, CreateTask_Activity.class);
                startActivity(i);
            }else if(s3.isChecked()) {
                Intent i = new Intent(this, CheckEmployeeTasks_Activity.class);
                startActivity(i);
            }
            else {
                Intent i = new Intent(this, YourTasks_Activity.class);
                startActivity(i);
            }
            }
        }
        public void reset(View v)
    {
        username.setText("");
        email.setText("");
        pass.setText("");
        s1.setChecked(false);
        s2.setChecked(false);
        s3.setChecked(false);
        code.setText("");
    }
    }

