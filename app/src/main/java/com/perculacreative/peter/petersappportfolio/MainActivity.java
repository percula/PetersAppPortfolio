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

        Button moviesButton = (Button) findViewById(R.id.movies);
        Button stockButton = (Button) findViewById(R.id.stock);
        Button buildBiggerButton = (Button) findViewById(R.id.buildbigger);
        Button materialButton = (Button) findViewById(R.id.material);
        Button ubiquitousButton = (Button) findViewById(R.id.ubiquitous);
        Button capstoneButton = (Button) findViewById(R.id.capstone);

        moviesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String message = getString(R.string.toast_begin) +
                        ((Button) view).getText() +
                        getString(R.string.toast_end);
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
            }
        });

        stockButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String message = getString(R.string.toast_begin) +
                        ((Button) view).getText() +
                        getString(R.string.toast_end);
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
            }
        });

        buildBiggerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String message = getString(R.string.toast_begin) +
                        ((Button) view).getText() +
                        getString(R.string.toast_end);
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
            }
        });

        materialButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String message = getString(R.string.toast_begin) +
                        ((Button) view).getText() +
                        getString(R.string.toast_end);
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
            }
        });

        ubiquitousButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String message = getString(R.string.toast_begin) +
                        ((Button) view).getText() +
                        getString(R.string.toast_end);
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
            }
        });

        capstoneButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String message = getString(R.string.toast_begin) +
                        ((Button) view).getText() +
                        getString(R.string.toast_end);
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
            }
        });


    }
}
