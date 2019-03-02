package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] titleData = {getApplicationContext().getString(R.string.Story_Title_1),
                getApplicationContext().getString(R.string.Story_Title_2),
                getApplicationContext().getString(R.string.Story_Title_3),
                getApplicationContext().getString(R.string.Story_Title_4),
                getApplicationContext().getString(R.string.Story_Title_5)};
        String[] dateData = {getApplicationContext().getString(R.string.Story_1_date),
                getApplicationContext().getString(R.string.Story_2_date),
                getApplicationContext().getString(R.string.Story_3_date),
                getApplicationContext().getString(R.string.Story_4_date),
                getApplicationContext().getString(R.string.Story_5_date)};
        String[] bodyData = {getApplicationContext().getString(R.string.Story_Body_1),
                getApplicationContext().getString(R.string.Story_body_2),
                getApplicationContext().getString(R.string.Story_body_3),
                getApplicationContext().getString(R.string.Story_body_4),
                getApplicationContext().getString(R.string.Story_body_5)};
        setContentView(R.layout.activity_main);
        MyAdapter myAdapter = new MyAdapter(titleData,dateData,bodyData,getApplicationContext());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(myAdapter);
    }
}
