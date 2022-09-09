package com.example.a571j;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.a571j.Adapters.FeedAdapter;
import com.example.a571j.Adapters.FilterAdapter;
import com.example.a571j.Models.Feed;
import com.example.a571j.Models.Filter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
RecyclerView recyclerView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    void initViews(){
        recyclerView = findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        getAdapter(data());
        recyclerView1 = findViewById(R.id.rv1);
        recyclerView1.setLayoutManager(new GridLayoutManager(this, 1));
        refreshAdapter(getAllFeeds());
    }

    ArrayList<Filter> data(){
        ArrayList<Filter> filters = new ArrayList<>();

        filters.add(new Filter("SpiderMan"));
        filters.add(new Filter("Masha and The Bear"));
        filters.add(new Filter("Technology"));
        filters.add(new Filter("News"));
        filters.add(new Filter("Mix"));
        filters.add(new Filter("Songs"));
        filters.add(new Filter("Trending"));

        return filters;
    }

    void getAdapter(ArrayList<Filter> list){
        FilterAdapter adapter = new FilterAdapter(this, list);
        recyclerView.setAdapter(adapter);
    }

    void refreshAdapter(ArrayList<Feed> feeds){
        FeedAdapter adapter = new FeedAdapter(this, feeds);
        recyclerView1.setAdapter(adapter);
    }

    ArrayList<Feed> getAllFeeds(){
        ArrayList<Feed> feed= new ArrayList<>();

        feed.add(new Feed(R.drawable.mercedes, R.drawable.nat));
        feed.add(new Feed(R.drawable.mbw, R.drawable.london));
        feed.add(new Feed(R.drawable.mercedes, R.drawable.nat));
        feed.add(new Feed(R.drawable.mbw, R.drawable.london));
        feed.add(new Feed(R.drawable.mercedes, R.drawable.nat));
        feed.add(new Feed(R.drawable.mbw, R.drawable.london));
        feed.add(new Feed(R.drawable.mercedes, R.drawable.nat));
        feed.add(new Feed(R.drawable.mbw, R.drawable.london));
        feed.add(new Feed(R.drawable.mercedes, R.drawable.nat));
        feed.add(new Feed(R.drawable.mbw, R.drawable.london));
        feed.add(new Feed(R.drawable.mercedes, R.drawable.nat));
        feed.add(new Feed(R.drawable.mbw, R.drawable.london));


        return feed;
    }
}