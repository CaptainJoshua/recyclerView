package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;

    private ArrayList<String> countryNameList = new ArrayList<>();
    private ArrayList<String> detailList = new ArrayList<>();
    private ArrayList<Integer> imageList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        countryNameList.add("Japan");
        countryNameList.add("Canada");
        countryNameList.add("Singapore");
        countryNameList.add("Spain");
        countryNameList.add("South Korea");

        detailList.add("Total Population: 123,951,692");
        detailList.add("Total Population: 38,454,327");
        detailList.add("Total Population: 5,943,546");
        detailList.add("Total Population: 47,558,630");
        detailList.add("Total Population: 52,268,636");

        imageList.add(R.drawable.japan1);
        imageList.add(R.drawable.canada3);
        imageList.add(R.drawable.singapore1);
        imageList.add(R.drawable.spain1);
        imageList.add(R.drawable.sokor1);

        adapter = new RecyclerAdapter(countryNameList, detailList, imageList, MainActivity.this);
        recyclerView.setAdapter(adapter);

    }
}