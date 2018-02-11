package com.example.android.quidditch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * The following Java code keeps the score for two teams, Gryffindor and Syltherin
 */

public class MainActivity extends AppCompatActivity {

    int gryffindorScore= 0;
    int slytherinScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *     The two methods below will change the score for Gryffindor when either button is pressed.

     */

    public void tenPointsG(View view) {
        gryffindorScore = gryffindorScore + 10;
        displayForGryffindor(gryffindorScore);
    }

    public void thirtyPointsG(View view) {
        gryffindorScore = gryffindorScore + 30;
        displayForGryffindor(gryffindorScore);
    }

    /**
     * Displays score for Gryffindor
     */
    public void displayForGryffindor(int score) {
        TextView scoreView = (TextView) findViewById(R.id.gryscore);
        scoreView.setText(String.valueOf(gryffindorScore));
    }

    /**
     * The two methods below will change the score for Slytherin when either button is pressed.
     */

    public void tenPointsS(View view) {
        slytherinScore = slytherinScore + 10;
        displayForSlytherin(slytherinScore);
    }

    public void thirtyPointsS(View view) {
        slytherinScore= slytherinScore + 30;
        displayForSlytherin(slytherinScore);
    }

    /**
     * Displays score for Slytherin
     */
    public void displayForSlytherin(int score) {
        TextView scoreView = (TextView) findViewById(R.id.sylscore);
        scoreView.setText(String.valueOf(slytherinScore));

    }

    /**
     * new match below will reset the score for both teams
     */
    public void newMatch (View view){
        gryffindorScore = 0;
        displayForGryffindor(gryffindorScore);
        slytherinScore = 0;
        displayForSlytherin(slytherinScore);
}


}
