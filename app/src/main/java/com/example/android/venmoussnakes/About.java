package com.example.android.venmoussnakes;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.RatingBar;
import android.widget.TextView;

/**
 * Created by Admin on 22-May-17.
 */

public class About extends Activity {

    private RatingBar fiveRatingbar;
    private RatingBar fourRatingbar;
    private RatingBar threeRatingbar;
    private RatingBar twoRatingbar;
    private Context context;

    public About() {

    }

    public About(Context context) {
        this.context = context;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        TextView about = (TextView) findViewById(R.id.about);
        fiveRatingbar = (RatingBar) findViewById(R.id.five_rating);
        fourRatingbar = (RatingBar) findViewById(R.id.four_rating);
        threeRatingbar = (RatingBar) findViewById(R.id.three_rating);
        twoRatingbar = (RatingBar) findViewById(R.id.two_rating);

        fiveRatingbar.setRating(5);
        fourRatingbar.setRating(4);
        threeRatingbar.setRating(3);
        twoRatingbar.setRating(2);;
    }
}
