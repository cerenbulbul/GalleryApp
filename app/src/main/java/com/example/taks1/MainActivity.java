package com.example.taks1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    String[] imagesName1 = {"Camera", "Whatsap", "Screenshots" , "Telegram",
                            "Whatsapp", "Download", "WhatsApp", "Reddit" , "O",
                            "OpenCamera" , "Whatsapp"};
    String[] imagesName2 = {"181 Media", "10828 Media", "66 Media", "39 Media",
                            "497 Media", "5 Media", "112 Media", "3 Media", "1 Media",
                            "1 Media", "1 Media"};
    int[] images = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4,
                    R.drawable.image5, R.drawable.image6, R.drawable.image7,R.drawable.image8,
                    R.drawable.image9, R.drawable.image10, R.drawable.image11};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);

    }
}
