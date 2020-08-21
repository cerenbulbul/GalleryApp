package com.example.taks1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

public class listPhotos extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_photos);

        gridView = (GridView) findViewById(R.id.gridView);
        TextView header_text = (TextView) findViewById(R.id.header_text);
        gridView.setAdapter(new imageAdapter(this));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), ShowImage.class );
                intent.putExtra("id",i);
                startActivity(intent);
            }
        });

        Intent i = getIntent();
        String text = i.getExtras().getString("text");
        header_text.setText(text);

    }
}
