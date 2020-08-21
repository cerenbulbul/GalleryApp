package com.example.taks1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;
import android.widget.Toolbar.OnMenuItemClickListener;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    GridView gridView;
    LinearLayout line1, line2, line3, line4, line5,line6,line7,line8,line9,line10,line11,line12,line13,line14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        line1 = findViewById(R.id.line1);
        line2 = findViewById(R.id.line2);
        line3 = findViewById(R.id.line3);
        line4 = findViewById(R.id.line4);
        line5 = findViewById(R.id.line5);
        line6 = findViewById(R.id.line6);
        line7 = findViewById(R.id.line7);
        line8 = findViewById(R.id.line8);
        line9 = findViewById(R.id.line9);
        line10 = findViewById(R.id.line10);
        line11 = findViewById(R.id.line11);
        line12 = findViewById(R.id.line12);
        line13 = findViewById(R.id.line13);
        line14 = findViewById(R.id.line14);

        line1.setOnClickListener(MainActivity.this);
        line2.setOnClickListener(MainActivity.this);
        line3.setOnClickListener(MainActivity.this);
        line4.setOnClickListener(MainActivity.this);
        line5.setOnClickListener(MainActivity.this);
        line6.setOnClickListener(MainActivity.this);
        line7.setOnClickListener(MainActivity.this);
        line8.setOnClickListener(MainActivity.this);
        line9.setOnClickListener(MainActivity.this);
        line10.setOnClickListener(MainActivity.this);
        line11.setOnClickListener(MainActivity.this);
        line12.setOnClickListener(MainActivity.this);
        line13.setOnClickListener(MainActivity.this);
        line14.setOnClickListener(MainActivity.this);


        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.inflateMenu(R.menu.toolbar_menu);
        toolbar.setOnMenuItemClickListener(new androidx.appcompat.widget.Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.item1:
                        Toast.makeText(getApplicationContext(), "You clicked Select Photo", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.item2:
                        Toast.makeText(getApplicationContext(), "You clicked Delete Photo", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.item3:
                        Toast.makeText(getApplicationContext(), "You clicked Share Photo", Toast.LENGTH_LONG).show();
                        break;
                }
                return false;
            }
        });
    }


    public void openActivity(String text) {
        Intent intent = new Intent(this, listPhotos.class);
        intent.putExtra("text", text);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.line1:
                openActivity("Camera");
                break;
            case R.id.line2:
                openActivity("Whatsapp");
                break;
            case R.id.line3:
                openActivity("Screenshots");
                break;
            case R.id.line4:
                openActivity("Telegram");
                break;
            case R.id.line5:
                openActivity("Whatsapp");
                break;
            case R.id.line6:
                openActivity("Download");
                break;
            case R.id.line7:
                openActivity("Whatsapp");
                break;
            case R.id.line8:
                openActivity("Reddit");
                break;
            case R.id.line9:
                openActivity("O");
                break;
            case R.id.line10:
                openActivity("OpenCamera");
                break;
            case R.id.line11:
                openActivity("Wallpaper");
                break;
            case R.id.line12:
                openActivity("Instagram");
                break;
            case R.id.line13:
                openActivity("Snapchat");
                break;
            case R.id.line14:
                openActivity("Background");
                break;
        }
    }
}

