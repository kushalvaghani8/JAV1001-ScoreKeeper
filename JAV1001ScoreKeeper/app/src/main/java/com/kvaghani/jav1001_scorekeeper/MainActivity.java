package com.kvaghani.jav1001_scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    //declaring text views
    TextView team1Score;
    TextView team2Score;
    TextView ScoreIncrease;
    TextView errorMessage;

    //Declaring Seekbar
    SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        team1Score = findViewById(R.id.team1Score);
        team2Score = findViewById(R.id.team2Score);
        ScoreIncrease = findViewById(R.id.ScoreIncreaseLbl);
        errorMessage = findViewById(R.id.textErrorMessage);

        //setting up the four buttons ±
        Button team1Add = (Button) findViewById(R.id.team1AddButton);
        team1Add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                errorMessage.setText(""); //clearing the error message

                /* ------------------------------------------------
                      CALLING ADD METHOD (PASSING IN TWO VALUES)
                  -------------------------------------------------
                */

                int result = addMethod(Integer.parseInt(team1Score.getText().toString()), Integer.parseInt(ScoreIncrease.getText().toString()));
                team1Score.setText(String.valueOf(result));

            }
        });

        Button team2Add = (Button) findViewById(R.id.team2addbutton);
        team2Add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                errorMessage.setText("");
               /* --------------------------------------------------
                      CALLING ADD METHOD (PASSING IN TWO VALUES)
                  --------------------------------------------------
                */
                int result = addMethod(Integer.parseInt(team2Score.getText().toString()), Integer.parseInt(ScoreIncrease.getText().toString()));
                team2Score.setText(String.valueOf(result));
            }
        });

        Button team1Subtract = (Button) findViewById(R.id.team1SubtractButton);
        team1Subtract.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                /* -------------------------------------------------
                    CALLING SUBTRACT METHOD (PASSING IN TWO VALUES)
                  --------------------------------------------------
                */
                int result = subtractMethod( Integer.parseInt(team1Score.getText().toString()), Integer.parseInt(ScoreIncrease.getText().toString()));

                /* -----------------------------------------------------------------
                    CHECKING IF RESULT IS LESS THAN 0, ERROR MESSAGE WILL BE SHOWN
                  ------------------------------------------------------------------
                */

                if (result < 0) {
                    errorMessage.setText("Value cannot be negative");
                }
                else if (result >= 0) {
                    errorMessage.setText("");//clearing the error message when not needed
                    team1Score.setText(String.valueOf(result));
                }

            }
        });

        Button team2SubtractButton = (Button) findViewById(R.id.team2SubtractButton);
        team2SubtractButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                    /* ------------------------------------------------
                       CALLING SUBTRACT METHOD (PASSING IN TWO VALUES)
                     --------------------------------------------------
                    */
                int result = subtractMethod( Integer.parseInt(team2Score.getText().toString()), Integer.parseInt(ScoreIncrease.getText().toString()));

                /* -----------------------------------------------------------------
                    CHECKING IF RESULT IS LESS THAN 0, ERROR MESSAGE WILL BE SHOWN
                  ------------------------------------------------------------------
                */
                if (result < 0) {
                    errorMessage.setText("Value cannot be negative");
                }
                else if (result >= 0) {
                    errorMessage.setText(""); //clearing the error message when not needed
                    team2Score.setText(String.valueOf(result));
                }
            }
        });


                /* -------------------------------------------------------------------
                   SEEKBAR WITH A MAX VALUE OF 5 (5 IS SET IN XML - android:max="5")
                  --------------------------------------------------------------------
                */

        seekBar = (SeekBar)findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                ScoreIncrease.setText(String.valueOf(i));
                System.out.println(i);
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

    }
    //subtract method that takes two numbers and returns result
    private int subtractMethod(int oldNumber, int newNumber){
        int result = oldNumber - newNumber;
        return result;
    }
    //add method that takes two numbers and returns result
    private int addMethod(int oldNumber, int newNumber){
        int result = oldNumber + newNumber;
        return result;
    }
}