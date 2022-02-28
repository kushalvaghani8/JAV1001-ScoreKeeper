package com.kvaghani.jav1001_scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {


    TextView team1Score;
    TextView team2Score;
    TextView ScoreIncrease;

    //Button team1AddButton;
    SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        team1Score = findViewById(R.id.team1Score);
        team2Score = findViewById(R.id.team2Score);
        ScoreIncrease = findViewById(R.id.ScoreIncreaseLbl);

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
        //      int tempScore = ScoreIncrease.getText();
//               int oldScore = Integer.parseInt(team1Score.getText());
             //   int updatedScore = (oldScore - tempScore);
              //  team1Score.setText("Score: " + updatedScore);  // Do something in response to button click
            }
        });

        Button team2SubtractButton = (Button) findViewById(R.id.team2SubtractButton);
        team2SubtractButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                team2Score.setText("button - was pressed");  // Do something in response to button click
            }
        });
        seekBar = (SeekBar)findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                ScoreIncrease.setText(String.valueOf(i));
                System.out.println(i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}