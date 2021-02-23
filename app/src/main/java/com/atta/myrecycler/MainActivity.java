package com.atta.myrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        ArrayList<Product> data = new ArrayList();
        data.add(new Product("TV",
                "https://images.samsung.com/is/image/samsung/levant-fhd-t5300-ua43t5300auxtw-frontblack-229857917?$720_576_PNG$",
                1200));
        data.add(new Product("Radio",
                "https://www.sony.com/image/fbb3a7ef7bc1d439a3a7fa4b2855bf3d?fmt=pjpeg&wid=1014&hei=396&bgcolor=F1F5F9&bgc=F1F5F9",
                600));
        data.add(new Product("Phone",
                "https://cf2.s3.souqcdn.com/item/2020/08/09/13/16/25/51/4/item_XL_131625514_122a0d8316f28.jpg",
                1900));


        ProductAdapter productAdapter = new ProductAdapter(data, this);

        recyclerView.setLayoutManager(
                new GridLayoutManager(this, 3));

        recyclerView.setAdapter(productAdapter);

    }
}