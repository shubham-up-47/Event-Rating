package com.example.myrecyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Spider Week","Coding Event     Rating:5",R.drawable.a));
        items.add(new Item("Festember","Dance Event     Rating:3",R.drawable.b));
        items.add(new Item("Pragyan","Social Event     Rating:5",R.drawable.c));
        items.add(new Item("Spider Inductions","Nice Event     Rating:5",R.drawable.d));
        items.add(new Item("NITT Fest","Song Event     Rating:2",R.drawable.e));
        items.add(new Item("Spider Cup","Best Event     Rating:5",R.drawable.f));
        items.add(new Item("SportsFete","Sports Event     Rating:3",R.drawable.g));




        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));

    }
}