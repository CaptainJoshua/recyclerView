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
        countryNameList.add("Sweden");
        countryNameList.add("New Zealand");
        countryNameList.add("Hawaii");
        countryNameList.add("France");
        countryNameList.add("Italy");

        detailList.add("Total Population: 123,951,692");
        detailList.add("Total Population: 38,454,327");
        detailList.add("Total Population: 5,943,546");
        detailList.add("Total Population: 47,558,630");
        detailList.add("Total Population: 52,268,636");
        detailList.add("Total Population: 10,248,667");
        detailList.add("Total Population: 4,915,166");
        detailList.add("Total Population: 1,360,301");
        detailList.add("Total Population: 65,615,692");
        detailList.add("Total Population: 60,251,020");

        imageList.add(R.drawable.japan1);
        imageList.add(R.drawable.canada3);
        imageList.add(R.drawable.singapore1);
        imageList.add(R.drawable.spain1);
        imageList.add(R.drawable.sokor1);
        imageList.add(R.drawable.sweden1);
        imageList.add(R.drawable.newzealand1);
        imageList.add(R.drawable.hawaii1);
        imageList.add(R.drawable.france1);
        imageList.add(R.drawable.italy1);

        adapter = new RecyclerAdapter(countryNameList, detailList, imageList, MainActivity.this);
        recyclerView.setAdapter(adapter);
       

    }
}