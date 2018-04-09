package com.example.anamika.cards;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter recyclerview_Adapter;
    RecyclerView.LayoutManager recyclerViewManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       /* ArrayList<String> data = new ArrayList<>();

        data.add("apple");
        data.add("mango");
        data.add("banana");
        data.add("papaya");
*/

        String[] data = {"a","b","c","d","e","f"};

        recyclerView = findViewById(R.id.recycler_view);
        recyclerViewManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(recyclerViewManager);
        recyclerview_Adapter = new MyAdapter(data,this);
        recyclerView.setAdapter(recyclerview_Adapter);

    }
}
