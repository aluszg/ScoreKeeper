package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays ten points for Team A.
     */
    public void addTenForTeamA(View view) {
        scoreTeamA = scoreTeamA + 10;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays nine points for Team A.
     */
    public void addNineForTeamA(View view) {
        scoreTeamA = scoreTeamA + 9;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays minus one points for Team A.
     */
    public void minusOneForTeamA(View view) {
        scoreTeamA = scoreTeamA - 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays ten points for Team B.
     */
    public void addTenForTeamB(View view) {
        scoreTeamB = scoreTeamB + 10;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays nine points for Team B.
     */
    public void addNineForTeamB(View view) {
        scoreTeamB = scoreTeamB + 9;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays minus one points for Team B.
     */
    public void minusOneForTeamB(View view) {
        scoreTeamB = scoreTeamB - 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Reset the score for both teams back to 0.
     */
    public void resetScore(View view) {
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
    }


    /**
     * Displays the given score for Team A.
     */
    private void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    private void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
