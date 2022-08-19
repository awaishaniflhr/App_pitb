package com.example.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Toolbar;

import java.util.ArrayList;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Product> productList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ProductAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new ProductAdapter(productList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareProductData();
    }

    private void setSupportActionBar(Toolbar toolbar) {
    }

    @SuppressLint("NotifyDataSetChanged")
    private void prepareProductData() {
        Product product = new Product("Mad Max: Fury Road", "Action & Adventure", "2013");
        productList.add(product);

        product = new Product("Inside Out", "Animation, Kids & Family", "2014");
        productList.add(product);

        product = new Product("Star Wars: Episode VII - The Force Awakens", "Action", "2012");
        productList.add(product);

        product = new Product("Shaun the Sheep", "Animation", "2016");
        productList.add(product);

        product = new Product("The Martian", "Science Fiction & Fantasy", "2017");
        productList.add(product);

        product = new Product("Mission: Impossible Rogue Nation", "Action", "2018");
        productList.add(product);

        product = new Product("Up", "Animation", "2019");
        productList.add(product);

        product = new Product("Star Trek", "Science Fiction", "2020");
        productList.add(product);


        mAdapter.notifyDataSetChanged();
    }
}