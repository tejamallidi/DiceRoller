package com.dev.surya.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView1;
    private TextView textView;
    private ImageView imageView2;
    private TextView textView2;
    private Button diceButton;
    private TextView totalTextView;
    private int diceNumber1;
    private int diceNumber2;
    private Random randomNumber = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = findViewById(R.id.imageView1);
        textView = findViewById(R.id.textView);
        imageView2 = findViewById(R.id.imageView2);
        textView2 = findViewById(R.id.textView2);
        diceButton = findViewById(R.id.diceButton);
        totalTextView = findViewById(R.id.totalTextView);

        diceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
                rollDice2();
               int diceNumber =  diceNumber1 + diceNumber2;
               totalTextView.setText("Total: "+diceNumber + "");
            }
        });

    }

    public void rollDice() {
        diceNumber1 = randomNumber.nextInt(6) + 1;
        textView.setText("Dice1 : "+diceNumber1 + "");

        switch (diceNumber1) {
            case 1:
                imageView1.setImageResource(R.drawable.dice1);
             break;
            case 2:
                imageView1.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageView1.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageView1.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageView1.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageView1.setImageResource(R.drawable.dice6);
                break;
        }
    }

    public void rollDice2() {
         diceNumber2 = randomNumber.nextInt(6) + 1;
        textView2.setText("Dice2 : "+diceNumber2 + "");

        switch (diceNumber2) {
            case 1:
                imageView2.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageView2.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageView2.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageView2.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageView2.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageView2.setImageResource(R.drawable.dice6);
                break;
        }
    }




}
