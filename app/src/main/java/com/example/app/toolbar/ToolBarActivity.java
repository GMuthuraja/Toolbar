package com.example.app.toolbar;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class ToolBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tool_bar);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //toolbar.setTitle("Custom Bar");
        //toolbar.setLogo(android.R.drawable.ic_menu_add);
        //toolbar.setTitleTextColor(Color.parseColor("#fff000"));
    }
}
