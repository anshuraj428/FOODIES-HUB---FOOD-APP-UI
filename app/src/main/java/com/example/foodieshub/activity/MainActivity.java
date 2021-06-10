package com.example.foodieshub.activity;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;

import com.example.foodieshub.Product;
import com.example.foodieshub.adapter.ProductAdapter;
import com.example.foodieshub.R;
import com.example.foodieshub.Utils;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Product> productList = new ArrayList<>();
    private LinearLayoutManager manager;
    private ProductAdapter productAdapter;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Utils.changeStatusBarAndNavigationBarColor( MainActivity.this, R.color.mirage,R.color.mirage_dark);

        recyclerView = findViewById(R.id.recyclerView);

        setProductAdapter();

    }

    private void setProductAdapter()
    {

        productList.add(new Product( "Pizza", "Large variety of pizzas from cheese burst to heavily veggies loaded", "Rs.95-300", "https://image.flaticon.com/icons/png/512/1384/1384676.png"));
        productList.add(new Product( "Samosa", "Paneer filled Samosas", "Rs.15/pc.", "https://image.flaticon.com/icons/png/512/2160/2160222.png"));
        productList.add(new Product( "Burger", "Crispy chicken/egg/veg burger", "Rs.49-150", "https://image.flaticon.com/icons/png/512/2674/2674087.png"));
        productList.add(new Product( "HotDog", "Veg/Non-Veg HotDogs", "Rs.200", "https://image.flaticon.com/icons/png/512/2674/2674083.png"));
        productList.add(new Product( "Fried Eggs", "Two Half-Fried Eggs", "Rs.50", "https://image.flaticon.com/icons/png/512/2674/2674088.png"));
        productList.add(new Product( "French Fries", "Large Medium and Small Fries available", "Rs.50-150", "https://image.flaticon.com/icons/png/512/2674/2674067.png"));
        productList.add(new Product( "Pan Cake", "Delicious Pan Cakes", "Rs.295", "https://image.flaticon.com/icons/png/512/2674/2674059.png"));
        productList.add(new Product( "Indian Thali", "Indian thali with variety of taste", "Rs.135", "https://image.flaticon.com/icons/png/512/4287/4287069.png"));
        productList.add(new Product( "Ladoo", "Besan Ladoo", "Rs.300/Kg", "https://image.flaticon.com/icons/png/512/3449/3449565.png"));
        productList.add(new Product( "Noodles", "Spicy Haka noodles", "Rs.105", "https://image.flaticon.com/icons/png/512/1256/1256462.png"));

        productAdapter = new ProductAdapter(MainActivity.this, productList);
        recyclerView.setAdapter(productAdapter);
        manager = new LinearLayoutManager(MainActivity.this);
        manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(manager);


    }
}