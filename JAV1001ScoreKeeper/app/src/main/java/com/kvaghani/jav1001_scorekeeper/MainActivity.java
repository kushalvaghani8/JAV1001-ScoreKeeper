package com.kvaghani.jav1001_scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {


    TextView team1Score;
    TextView team2Score;

    //Button team1AddButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        team1Score = findViewById(R.id.team1Score);
        team2Score = findViewById(R.id.team2Score);

        //setting up the four buttons ± 
        Button team1Add = (Button) findViewById(R.id.team1AddButton);
        team1Add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                team1Score.setText("button + was pressed");  // Do something in response to button click
            }
        });

        Button team2Add = (Button) findViewById(R.id.team2addbutton);
        team2Add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                team2Score.setText("button + was pressed");  // Do something in response to button click
            }
        });

        Button team1Subtract = (Button) findViewById(R.id.team1SubtractButton);
        team1Subtract.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                team1Score.setText("button - was pressed");  // Do something in response to button click
            }
        });

        Button team2SubtractButton = (Button) findViewById(R.id.team2SubtractButton);
        team2SubtractButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                team2Score.setText("button - was pressed");  // Do something in response to button click
            }
        });



    }
}