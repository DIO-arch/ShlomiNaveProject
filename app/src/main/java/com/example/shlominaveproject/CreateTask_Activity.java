package com.example.shlominaveproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateTask_Activity extends AppCompatActivity {
        EditText des;
        EditText deadlinedate;
        EditText deadlinetime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_task_);
        des=findViewById(R.id.ETdescription);
        deadlinedate=findViewById(R.id.ETdeadlinedate);
        deadlinetime=findViewById(R.id.ETdeadlinetime);

    }
//    public void EditTask(View view) {
//        Intent i=new Intent(this,EditTask_Activity.class);
//        startActivity(i);
//    }
    public void Seetasks(View view) {

       if(des.getText().length()==0 || deadlinetime.getText().length()==0 || deadlinedate.getText().length()==0  )
       {
           Toast.makeText(this,"enter values to all areas",Toast.LENGTH_SHORT).show();
       }
       else if(deadlinedate.length()!=10)
           Toast.makeText(this,"correct date input is: DD/MM/YYYY",Toast.LENGTH_SHORT).show();
       else if(deadlinetime.length()!=5)
           Toast.makeText(this,"correct time input is: XX:XX",Toast.LENGTH_SHORT).show();
       else {
           Dal d=new Dal(this);
           d.addtask(des.getText().toString(),deadlinetime.getText().toString());
           Intent i=new Intent(this,YourTasks_Activity.class);
        startActivity(i);
       }

           }
           public void YOURTASKS(View v){
               Intent i=new Intent(this,YourTasks_Activity.class);
               startActivity(i);
           }
    }

    // public void Homepage(View view) {
    //    Intent i=new Intent(this,MainActivity.class);
    //      startActivity(i);
    // }פעולת מעבר לדף הבית
