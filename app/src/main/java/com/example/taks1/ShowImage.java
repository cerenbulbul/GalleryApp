package com.example.taks1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class ShowImage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        ImageView imageView = (ImageView) findViewById(R.id.image_view);

        Intent i = getIntent();
        int position = i.getExtras().getInt("id");

        imageAdapter imageAdapter = new imageAdapter(this);
        imageView.setImageResource(imageAdapter.imageArray[position]);

    }
}
