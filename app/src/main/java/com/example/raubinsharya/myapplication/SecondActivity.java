package com.example.raubinsharya.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class SecondActivity extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        imageView=findViewById(R.id.imageView1);
       // LoadData();
        Intent intent=this.getIntent();
        Picasso.with(this).load( intent.getExtras().getString("URL")).into(imageView);


    }

    private void LoadData() {

    }
}
