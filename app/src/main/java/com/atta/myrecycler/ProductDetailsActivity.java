package com.atta.myrecycler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class ProductDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        Product product = (Product) getIntent().getSerializableExtra("product");

        Toast.makeText(this, product.getName(), Toast.LENGTH_SHORT).show();
    }
}