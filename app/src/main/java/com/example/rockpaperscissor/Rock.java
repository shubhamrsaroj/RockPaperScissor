package com.example.rockpaperscissor;

import static com.example.rockpaperscissor.R.id.imageButton11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Rock extends AppCompatActivity {
    public int randomNumber;
    ImageButton papers,scissors,rocks;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock);
        papers=findViewById(R.id.imageButton);
        scissors=findViewById(R.id.imageButton2);
        rocks=findViewById(R.id.imageButton3);
        rando();

        papers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Rockk();

            }
        });

        scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Rockk();

            }
        });

        rocks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Rockk();

            }
        });
    }







    public void rando(){
        randomNumber = (int) (Math.random() * 4);


    }
    public void Rockk(){
        Handler handler = new Handler();

        handler.postDelayed(() -> {
            // Create an Intent to start the NextActivity
            choose();
            // Finish the CurrentActivity to destroy it
            finish();
        }, 10); // Delay in milliseconds (15 seconds)
    }
    public void choose() {


            if (randomNumber == 1) {
                Intent intent = new Intent(getApplicationContext(), Rock.class);
                startActivity(intent);

            } else if (randomNumber == 2) {
                Intent intent = new Intent(getApplicationContext(), Scissor.class);
                startActivity(intent);

            } else if (randomNumber == 3) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

            } else if (randomNumber == 0) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

            }

            else {
                Toast.makeText(getApplicationContext(), "Rock", Toast.LENGTH_SHORT).show();
            }


        }

    }

