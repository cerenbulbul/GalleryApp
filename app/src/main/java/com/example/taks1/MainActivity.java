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

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout line1 = findViewById(R.id.line1);
        LinearLayout line2 = findViewById(R.id.line2);
        LinearLayout line3 = findViewById(R.id.line3);
        LinearLayout line4 = findViewById(R.id.line4);
        LinearLayout line5 = findViewById(R.id.line5);
        LinearLayout line6 = findViewById(R.id.line6);
        LinearLayout line7 = findViewById(R.id.line7);
        LinearLayout line8 = findViewById(R.id.line8);
        LinearLayout line9 = findViewById(R.id.line9);
        LinearLayout line10 = findViewById(R.id.line10);
        LinearLayout line11 = findViewById(R.id.line11);
        LinearLayout line12 = findViewById(R.id.line12);
        LinearLayout line13 = findViewById(R.id.line13);
        LinearLayout line14 = findViewById(R.id.line14);

        line1.setOnClickListener((View.OnClickListener) this);

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

    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.line1:
                openActivity();
                break;
            case R.id.line2:
                openActivity();
                break;
        }
    }

    public void openActivity(){
        Intent intent = new Intent(this, listPhotos.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}



