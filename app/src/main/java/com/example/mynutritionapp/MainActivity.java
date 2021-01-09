package com.example.mynutritionapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private LinearLayoutManager layoutManager;
    private RecyclerViewAdapter adapter;
    private RecyclerView recyclerView;
    private TextView main_LBL_hello;
    ArrayList<Component> components;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        components = new ArrayList<>();
        components.add(new Component(Component.ContactPosition, "this is contact"));
        components.add(new Component(Component.DailyStatusPosition, "this is daily status"));
        components.add(new Component(Component.DietDictionaryPosition, "this is diet dictionary"));
        components.add(new Component(Component.FoodTrackingPosition, "this is food tracking"));
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerViewAdapter(components);
        recyclerView.setAdapter(adapter);
    }

    private void findViews() {
        recyclerView = findViewById(R.id.recyclerView);
        main_LBL_hello = findViewById(R.id.main_LBL_hello);
    }
}