package com.example.c7_ong.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;
import android.view.View;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private int mScore1;
    private int mScore2;
    private TextView mScoreText1;
    private TextView mScoreText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mScoreText1 = (TextView)findViewById(R.id.score_1);
        mScoreText2 = (TextView)findViewById(R.id.score_2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    public void decreaseScore(View view) {
            int viewID = view.getId();
            switch(viewID)
            {
                case R.id.decreaseTeam1:
                    mScore1--;
                    mScoreText1.setText(String.valueOf(mScore1));
                    break;

                case R.id.decreaseTeam2:
                    mScore2--;
                    mScoreText2.setText(String.valueOf(mScore2));
            }
    }

    public void increaseScore(View view) {
        int viewID = view.getId();
        switch(viewID)
        {
            case R.id.increaseTeam1:
                mScore1++;
                mScoreText1.setText(String.valueOf(mScore1));
                break;

            case R.id.increaseTeam2:
                mScore2++;
                mScoreText2.setText(String.valueOf(mScore2));
        }
    }
}
