package com.example.shlominaveproject;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import java.util.ArrayList;

public class Dal extends SQLiteAssetHelper {
    public Dal(Context context) {

        super(context, "shlomiprojects_DB.db", null, 1);
    }
    public void deletetask(String description, String deadline) {
//String st="UPDATE tasks WHERE description=="+description+ " AND deadline==" +deadline+"'";
//        String s="select * from tasks";
//        SQLiteDatabase db = getWritableDatabase();
        String sql_delete="DELETE from tasks WHERE description=="+description+ " AND deadline==" +deadline+"'";
    }
    public void addtask(String description, String deadline) {
//String st="SELECT * FROM tasks WHERE description=="+description+ " AND deadline==" +deadline+"'";
String s="select * from tasks";
        SQLiteDatabase db = getWritableDatabase();
        String sql_INSERT = "INSERT INTO tasks (description,deadline) values(?,?)";
        SQLiteStatement statement = db.compileStatement(sql_INSERT);

        statement.bindString(1, description);
        statement.bindString(2, deadline);
        statement.execute();
    }
    public void adduser(String username,String email, String password, Boolean b1,boolean b2, boolean b3, String code) {
//String st="SELECT * FROM tasks WHERE description=="+description+ " AND deadline==" +deadline+"'";
        String s="select * from users";
        SQLiteDatabase db = getWritableDatabase();
        String usertype;
        if(b1){
            usertype="independent";
        }
        else if(b2)
        {
            usertype="employee";
        }
        else usertype="manager";
        String sql_INSERT = "INSERT INTO users (username,email,password,usertype,code) values(?,?,?,?,?)";
        SQLiteStatement statement = db.compileStatement(sql_INSERT);

        statement.bindString(1, username);
        statement.bindString(2,email);
        statement.bindString(3,password);
        statement.bindString(4,usertype);
        statement.bindString(5,code);
        statement.execute();
    }
    public ArrayList<Task> getAllTasks() {
        ArrayList<Task> ary = new ArrayList<>();
        String st = "SELECT * from tasks";
        SQLiteDatabase db = getWritableDatabase();
        Cursor cursor = db.rawQuery(st,null);
        while (cursor.moveToNext()) {
            Task t =new Task();
            t.setDescription(cursor.getString(cursor.getColumnIndex("description")));
            t.setDeadline(cursor.getString(cursor.getColumnIndex("deadline")));
            ary.add(t);
        }

          return ary;

        }


    }

