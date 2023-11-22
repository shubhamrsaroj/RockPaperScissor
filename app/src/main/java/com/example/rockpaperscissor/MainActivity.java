package com.example.rockpaperscissor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public int randomNumber;
    ImageButton paper,scissor,rock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        paper=findViewById(R.id.imageButton11);
        scissor=findViewById(R.id.imageButton12);
        rock=findViewById(R.id.imageButton13);
        rando();


        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Rockk();

            }
        });

        scissor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Rockk();

            }
        });

        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Rockk();

            }
        });
    }


    private void Rockk(){
        Handler handler = new Handler();

        handler.postDelayed(() -> {
            // Create an Intent to start the NextActivity
            choose();

            // Finish the CurrentActivity to destroy it
            finish();
        }, 10); // Delay in milliseconds (15 seconds)
    }



    public void rando(){

        randomNumber = (int) (Math.random() * 4);



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


            }
            else if (randomNumber == 0) {
                Intent intent = new Intent(getApplicationContext(), Scissor.class);

                startActivity(intent);

            }
            else {
                Toast.makeText(getApplicationContext(), "Rock", Toast.LENGTH_SHORT).show();
             }


        }

    }




