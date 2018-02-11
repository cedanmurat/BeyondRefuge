package com.example.recodedcedan.beyondrefuge;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.recodedcedan.beyondrefuge.Adapter.MRecycleAdpater;
import com.example.recodedcedan.beyondrefuge.Adapter.RecycleAdapter;
import com.example.recodedcedan.beyondrefuge.Model.News;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        mainAntiRefuge();
        mainNationalism();
        mainRacism();
        mainSexism();

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.racismNavMenu) {
            Intent i= new Intent(MainActivity.this,RacismActivity.class);
            startActivity(i);
        } else if (id == R.id.antirefugeNavMenu) {
            Intent i= new Intent(MainActivity.this,AntiRefugeActivity.class);
            startActivity(i);
        } else if (id == R.id.nationalismNavMenu) {
            Intent i= new Intent(MainActivity.this,NationalismActivity.class);
            startActivity(i);
        } else if (id == R.id.sexismNavMenu) {
            Intent i= new Intent(MainActivity.this,SexisimActivity.class);
            startActivity(i);
        } else if (id == R.id.sPLearningNavMenu) {
            Intent i= new Intent(MainActivity.this,SelfPacedLearningActivity.class);
            startActivity(i);
        } else if (id == R.id.aboutusNavMenu) {
            Intent i= new Intent(MainActivity.this,AboutUsActivity.class);
            startActivity(i);
        } else if (id == R.id.contactusNavMenu) {
            Intent i= new Intent(MainActivity.this,ContactUsActivity.class);
            startActivity(i);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public void mainRacism(){
        ArrayList<News> newsList;
        RecyclerView recyclerView;
        MRecycleAdpater mAdapter;
        recyclerView = (RecyclerView) findViewById(R.id.m_recycler_view_r);
        newsList=new ArrayList<>();
        newsList.add(new News("Adam Sand", "Rasicm", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image1));
        newsList.add(new News("Adam Sand", "Rasicm", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image2));
        newsList.add(new News("Adam Sand", "Rasicm", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image3));
        newsList.add(new News("Adam Sand", "Rasicm", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image4));
        newsList.add(new News("Adam Sand", "Rasicm", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image5));
        newsList.add(new News("Adam Sand", "Rasicm", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image1));
        newsList.add(new News("Adam Sand", "Rasicm", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image2));
        newsList.add(new News("Adam Sand", "Rasicm", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image3));
        newsList.add(new News("Adam Sand", "Rasicm", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image4));
        newsList.add(new News("Adam Sand", "Rasicm", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image5));

        mAdapter = new MRecycleAdpater(newsList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.HORIZONTAL));
        recyclerView.setAdapter(mAdapter);

    }
    public void mainAntiRefuge(){
        ArrayList<News> newsList;
        RecyclerView recyclerView;
        MRecycleAdpater mAdapter;
        recyclerView = (RecyclerView) findViewById(R.id.m_recycler_view_ar);
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

        mAdapter = new MRecycleAdpater(newsList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.HORIZONTAL));
        recyclerView.setAdapter(mAdapter);
    }
    public void mainNationalism(){
        ArrayList<News> newsList;
        RecyclerView recyclerView;
        MRecycleAdpater mAdapter;
        recyclerView = (RecyclerView) findViewById(R.id.m_recycler_view_n);
        newsList=new ArrayList<>();
        newsList.add(new News("Adam Sand", "Nationalism", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image1));
        newsList.add(new News("Adam Sand", "Nationalism", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image2));
        newsList.add(new News("Adam Sand", "Nationalism", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image3));
        newsList.add(new News("Adam Sand", "Nationalism", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image4));
        newsList.add(new News("Adam Sand", "Nationalism", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image5));
        newsList.add(new News("Adam Sand", "Nationalism", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image1));
        newsList.add(new News("Adam Sand", "Nationalism", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image2));
        newsList.add(new News("Adam Sand", "Nationalism", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image3));
        newsList.add(new News("Adam Sand", "Nationalism", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image4));
        newsList.add(new News("Adam Sand", "Nationalism", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image5));

        mAdapter = new MRecycleAdpater(newsList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.HORIZONTAL));
        recyclerView.setAdapter(mAdapter);
    }
    public void mainSexism(){
        ArrayList<News> newsList;
        RecyclerView recyclerView;
        MRecycleAdpater mAdapter;
        recyclerView = (RecyclerView) findViewById(R.id.m_recycler_view_s);
        newsList=new ArrayList<>();
        newsList.add(new News("Adam Sand", "Sexism", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image1));
        newsList.add(new News("Adam Sand", "Sexism", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image2));
        newsList.add(new News("Adam Sand", "Sexism", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image3));
        newsList.add(new News("Adam Sand", "Sexism", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image4));
        newsList.add(new News("Adam Sand", "Sexism", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image5));
        newsList.add(new News("Adam Sand", "Sexism", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image1));
        newsList.add(new News("Adam Sand", "Sexism", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image2));
        newsList.add(new News("Adam Sand", "Sexism", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image3));
        newsList.add(new News("Adam Sand", "Sexism", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image4));
        newsList.add(new News("Adam Sand", "Sexism", "01.01.2018", "A quick and simplified answer is that Lorem Ipsum refers to text that the DTP (Desktop Publishing) industry use as replacement text when the real text is not available.", "http://www.loremipsum.de/about_lorem_ipsum.html", R.drawable.image5));

        mAdapter = new MRecycleAdpater(newsList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.HORIZONTAL));
        recyclerView.setAdapter(mAdapter);
    }
}
