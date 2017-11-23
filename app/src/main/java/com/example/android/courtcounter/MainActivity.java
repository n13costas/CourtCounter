package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int team_a_points;

    public void increment_by1(View view) {
        team_a_points++;
        displayForTeamA(team_a_points);
    }

    public void increment_by2(View view) {
        team_a_points = team_a_points + 2;
        displayForTeamA(team_a_points);
    }

    public void increment_by3(View view) {
        team_a_points = team_a_points + 3;
        displayForTeamA(team_a_points);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
}
