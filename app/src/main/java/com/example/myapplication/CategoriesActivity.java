package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class CategoriesActivity extends AppCompatActivity {
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Categories");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = findViewById(R.id.rv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);
        List<CategoryModel> list = new ArrayList<>();
        list.add(new CategoryModel("","Category 1"));
        list.add(new CategoryModel("","Category 1"));
        list.add(new CategoryModel("","Category 1"));
        list.add(new CategoryModel("","Category 1"));
        list.add(new CategoryModel("","Category 1"));
        list.add(new CategoryModel("","Category 1"));
        list.add(new CategoryModel("","Category 1"));
        list.add(new CategoryModel("","Category 1"));
        list.add(new CategoryModel("","Category 1"));

        CatogoryAdapter adapter = new CatogoryAdapter(list);
        recyclerView.setAdapter(adapter);

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        if (item.getItemId() == android.R.id.home)
        {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}