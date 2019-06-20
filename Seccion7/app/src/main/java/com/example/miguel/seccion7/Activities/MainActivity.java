package com.example.miguel.seccion7.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.miguel.seccion7.R;

public class MainActivity extends AppCompatActivity {

    private Toolbar myToolbar;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
        
    }
}
