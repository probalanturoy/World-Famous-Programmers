package com.example.antu.worldfamousprogrammers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button dennisButton, bjarneButton, jamesButton, andersButton, timButton, brainButton, kenButton, guidoButton, donaldButton;

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dennisButton = (Button) findViewById(R.id.dennisButtonId);
        bjarneButton = (Button) findViewById(R.id.bjarneButtonId);
        jamesButton = (Button) findViewById(R.id.jamesButtonId);

        andersButton = (Button) findViewById(R.id.andersButtonId);
        timButton = (Button) findViewById(R.id.timButtonId);
        brainButton = (Button) findViewById(R.id.brainButtonId);
        kenButton = (Button) findViewById(R.id.kenButtonId);
        guidoButton = (Button) findViewById(R.id.guidoButtonId);
        donaldButton = (Button) findViewById(R.id.donaldButtonId);

        dennisButton.setOnClickListener(this);
        bjarneButton.setOnClickListener(this);
        jamesButton.setOnClickListener(this);

        andersButton.setOnClickListener(this);
        timButton.setOnClickListener(this);
        brainButton.setOnClickListener(this);
        kenButton.setOnClickListener(this);
        guidoButton.setOnClickListener(this);
        donaldButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.dennisButtonId) {

            intent = new Intent(MainActivity.this, ProfileActivity.class);

            intent.putExtra("name", "dennis");
            startActivity(intent);
        }
        if (v.getId() == R.id.bjarneButtonId) {

            intent = new Intent(MainActivity.this, ProfileActivity.class);

            intent.putExtra("name", "bjarne");
            startActivity(intent);
        }
        if (v.getId() == R.id.jamesButtonId) {

            intent = new Intent(MainActivity.this, ProfileActivity.class);

            intent.putExtra("name", "james");
            startActivity(intent);
        }

        if (v.getId() == R.id.andersButtonId) {

            intent = new Intent(MainActivity.this, ProfileActivity.class);

            intent.putExtra("name", "anders");
            startActivity(intent);
        }
        if (v.getId() == R.id.timButtonId) {

            intent = new Intent(MainActivity.this, ProfileActivity.class);

            intent.putExtra("name", "tim");
            startActivity(intent);
        }
        if (v.getId() == R.id.brainButtonId) {

            intent = new Intent(MainActivity.this, ProfileActivity.class);

            intent.putExtra("name", "brain");
            startActivity(intent);
        }
        if (v.getId() == R.id.kenButtonId) {

            intent = new Intent(MainActivity.this, ProfileActivity.class);

            intent.putExtra("name", "ken");
            startActivity(intent);
        }
        if (v.getId() == R.id.guidoButtonId) {

            intent = new Intent(MainActivity.this, ProfileActivity.class);

            intent.putExtra("name", "guido");
            startActivity(intent);
        }
        if (v.getId() == R.id.donaldButtonId) {

            intent = new Intent(MainActivity.this, ProfileActivity.class);

            intent.putExtra("name", "donald");
            startActivity(intent);
        }
    }
}
