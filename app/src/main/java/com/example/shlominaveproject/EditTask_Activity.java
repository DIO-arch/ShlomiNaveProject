package com.example.shlominaveproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EditTask_Activity extends AppCompatActivity {
    EditText des;
    EditText deadlinedate;
    EditText deadlinetime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_task_);
        des=findViewById(R.id.ETdescription);
        deadlinedate=findViewById(R.id.ETdeadlinedate);
        deadlinetime=findViewById(R.id.ETdeadlinetime);
    }
    public void changes(View v){
        if(des.getText().length()==0 || deadlinetime.getText().length()==0 || deadlinedate.getText().length()==0  )
        {
            Toast.makeText(this,"enter values to all areas",Toast.LENGTH_SHORT).show();
        }
        else if(deadlinedate.length()>7)
            Toast.makeText(this,"correct date input is: DD/MM/YYYY",Toast.LENGTH_SHORT).show();
        else if(deadlinetime.length()!=5)
            Toast.makeText(this,"correct time input is: XX:XX",Toast.LENGTH_SHORT).show();
        else {

        }
    }

    // public void Homepage(View view) {
    //    Intent i=new Intent(this,MainActivity.class);
    //      startActivity(i);
    // }פעולת מעבר לדף הבית
}