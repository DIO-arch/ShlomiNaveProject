package com.example.shlominaveproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class YourTasks_Activity extends AppCompatActivity {
    private ListView ListView;
    private ArrayList<Task> tasklist ;
    private TextView tv;

    private YourAdapter ad;
    private AdapterView.OnItemClickListener YourTaskslistener=new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
            final String[]options={"Update","Delete","cancel"};
            AlertDialog.Builder adb=new AlertDialog.Builder(YourTasks_Activity.this);
            adb.setTitle("I want to:");
            ArrayAdapter<String>aryoptions=new ArrayAdapter<String>(YourTasks_Activity.this, android.R.layout.simple_list_item_1,options);
            adb.setAdapter(aryoptions, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                 if(which==1)
                 {
                     Toast.makeText(YourTasks_Activity.this, "it should work", Toast.LENGTH_SHORT).show();
//                     Dal d=new Dal(YourTasks_Activity.this);
//                     d.deletetask(tasklist.get(position).getDescription(),tasklist.get(position).getDeadline());
                 }

                }
            });
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_tasks_);
        tv=findViewById(R.id.tvYourTasks);
        ListView=findViewById(R.id.mytaskslist);
               ListView.setOnItemClickListener(YourTaskslistener);
        Dal dal=new Dal(this);
        tasklist =dal.getAllTasks();
        tv.append(":You have "+tasklist.size()+ " tasks left" );

        YourAdapter ad=new YourAdapter(this,R.layout.task_layout,tasklist);
        ListView.setAdapter(ad);

    }
//    private ListView.OnItemClickListener YourTaskslistener=new ListView.OnItemClickListener() {
//        @Override
//        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//            Intent i=new Intent();
//            i.putExtra("key1",tasklist.get(position).getDescription());
//            i.putExtra("key")
//        }
//    };

    public void Createnewtask(View view) {
        Intent i=new Intent(this,CreateTask_Activity.class);
        startActivity(i);
    }
    public void getdata()
    {






    }
// public void Homepage(View view) {
    //    Intent i=new Intent(this,MainActivity.class);
    //      startActivity(i);
    // }פעולת מעבר לדף הבית
}