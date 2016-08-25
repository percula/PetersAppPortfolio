package com.perculacreative.peter.petersappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button moviesButton = (Button) findViewById(R.id.moviesButton);
        Button stockButton = (Button) findViewById(R.id.stockButton);
        Button buildBiggerButton = (Button) findViewById(R.id.buildBiggerButton);
        Button materialButton = (Button) findViewById(R.id.materialButton);
        Button ubiquitousButton = (Button) findViewById(R.id.ubiquitousButton);
        Button capstoneButton = (Button) findViewById(R.id.capstoneButton);

        moviesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String message = String.format(getString(R.string.toast_message), ((Button) view).getText().toString());
                Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
            }
        });

        stockButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String message = String.format(getString(R.string.toast_message), ((Button) view).getText().toString());
                Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
            }
        });

        buildBiggerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String message = String.format(getString(R.string.toast_message), ((Button) view).getText().toString());
                Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
            }
        });

        materialButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String message = String.format(getString(R.string.toast_message), ((Button) view).getText().toString());
                Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
            }
        });

        ubiquitousButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String message = String.format(getString(R.string.toast_message), ((Button) view).getText().toString());
                Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
            }
        });

        capstoneButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String message = String.format(getString(R.string.toast_message), ((Button) view).getText().toString());
                Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
            }
        });


    }
}
