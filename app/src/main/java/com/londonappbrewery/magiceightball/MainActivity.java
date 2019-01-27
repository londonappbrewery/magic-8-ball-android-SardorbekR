package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay = findViewById(R.id.image_eightBall);

        final int[] ballArray={R.drawable.ball1,
                R.drawable.ball3,
                R.drawable.ball5,
                R.drawable.ball7,
                R.drawable.ball9
        };

        Button myButton = findViewById(R.id.button);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumber=new Random();
                int number=randomNumber.nextInt(5);

                int imageResource=ballArray[number];
                ballDisplay.setImageResource(imageResource);
            }
        });
    }
}
