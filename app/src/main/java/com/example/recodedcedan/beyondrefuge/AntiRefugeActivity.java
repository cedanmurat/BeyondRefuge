package com.example.recodedcedan.beyondrefuge;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;

import com.example.recodedcedan.beyondrefuge.Adapter.RecycleAdapter;
import com.example.recodedcedan.beyondrefuge.Model.News;

import java.util.ArrayList;


public class AntiRefugeActivity extends AppCompatActivity {
    private ArrayList<News> newsList;
    private RecyclerView recyclerView;
    private RecycleAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anti_refuge);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        newsList=new ArrayList<>();
        newsList.add(new News("Adam Sand", "Help Refugee", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image1));
        newsList.add(new News("Adam Sand", "Help Refugee", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image2));
        newsList.add(new News("Adam Sand", "Help Refugee", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image3));
        newsList.add(new News("Adam Sand", "Help Refugee", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image4));
        newsList.add(new News("Adam Sand", "Help Refugee", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image5));
        newsList.add(new News("Adam Sand", "Help Refugee", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image1));
        newsList.add(new News("Adam Sand", "Help Refugee", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image2));
        newsList.add(new News("Adam Sand", "Help Refugee", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image3));
        newsList.add(new News("Adam Sand", "Help Refugee", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image4));
        newsList.add(new News("Adam Sand", "Help Refugee", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image5));

        mAdapter = new RecycleAdapter(newsList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);


    }


}
