package com.example.shlominaveproject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.TaskInfo;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;

public class CheckEmployeeTasks_Activity extends AppCompatActivity {
   private ListView ListView1;

   private ArrayList<Task> tasklist ;
   private YourAdapter ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_employee_tasks_);
        ListView1=findViewById(R.id.ReturnedTasksList);
        tasklist =new ArrayList<Task>();
        getdata();
        YourAdapter adapter=new YourAdapter(this,R.layout.task_layout,tasklist);
        ListView1.setAdapter(adapter);
//        ListView1.setOnItemClickListener(Itemlistener);
    }
//    private AdapterView.OnItemClickListener Itemlistener=new AdapterView.OnItemClickListener() {
//        @Override
//        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//            Toast.makeText(CheckEmployeeTasks_Activity.this, tasklist.get(position).toString(), Toast.LENGTH_SHORT).show();
//        }
//    };

    public void SetTaskSettings(View view) {
        Intent i=new Intent(this,TaskSettings_Activity.class);
        startActivity(i);
    }
    public void getdata()
    {

        Task t=new Task("fly to the moon","24/5/2054" );
        tasklist.add(t);
        t=new Task("cure altzheimer","2/5/2047" );
        tasklist.add(t);
        t=new Task("create a new language","2/10/2039" );
        tasklist.add(t);
        t=new Task("IDK","TOMORROW");
        tasklist.add(t);



    }

}