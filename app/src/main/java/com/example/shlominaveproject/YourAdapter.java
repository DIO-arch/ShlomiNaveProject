package com.example.shlominaveproject;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


    public class YourAdapter extends ArrayAdapter<Task> {
        private Context c;
        private int resource;
        private ArrayList<Task> objects;

        public YourAdapter( Context context, int resource, ArrayList<Task>Objects) {
            super(context, resource, Objects);
            this.c=context;
            this.resource=resource;
            this.objects=Objects;
        }

        public int getCount() {
            return this.objects.size();
        }
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater li=(LayoutInflater)this.c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View v =li.inflate(this.resource, null);
            Task t=this.objects.get(position);
            Button btndone=v.findViewById(R.id.btncomplete);
            TextView description=v.findViewById(R.id.tvdescripition);
            description.setText(String.valueOf(t.getDescription()));
           TextView taskinfo=v.findViewById(R.id.tvtaskinfo);
            taskinfo.setText(t.toString());
            ImageView iv=v.findViewById(R.id.imageView2);



            return v;
        }

    }

