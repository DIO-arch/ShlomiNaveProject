package com.example.shlominaveproject;

import java.util.ArrayList;

public class Employee {
    private String Uname;
    public ArrayList<Task> tasks;

    public Employee(String uname, ArrayList<Task> tasks) {
        Uname = uname;
        this.tasks = tasks;
    }

    public String getUname() {
        return Uname;
    }

    public void setUname(String uname) {
        Uname = uname;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Uname='" + Uname + '\'' +
                ", tasks=" + tasks +
                '}';
    }
}
