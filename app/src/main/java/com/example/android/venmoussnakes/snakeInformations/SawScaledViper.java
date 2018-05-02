package com.example.android.venmoussnakes.snakeInformations;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;

import com.example.android.venmoussnakes.MyAdapter;
import com.example.android.venmoussnakes.R;

/**
 * Created by Admin on 26-Jan-17.
 */

public class SawScaledViper extends Activity {

    ImageView imageView;
    RatingBar ratingBar;
    Context context;
    boolean isImageFitToScreen;
    ImageView imageViewHd;

    public SawScaledViper () {

    }

    public SawScaledViper (Context context) {
        this.context = context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saw_scaled_viper);

        // Get Intent data
        Intent mIntent = getIntent();
        int position = mIntent.getExtras().getInt("id"); //getIntExtra("position", 0);
        MyAdapter myAdapter = new MyAdapter(this);

        imageView = (ImageView) findViewById(R.id.saw_scaled_viper);
        ratingBar = (RatingBar) findViewById(R.id.saw_sacled_viper_rating);

        imageView.setImageResource(R.drawable.saw_scaled_viper);
        ratingBar.setRating(5);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isImageFitToScreen) {
                    isImageFitToScreen=false;
                    imageView.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT));
                    imageView.setAdjustViewBounds(true);
                }else{
                    isImageFitToScreen=true;
                    imageView.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT));
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                }

                if (view == imageView) {
                    imageViewHd = (ImageView) findViewById(R.id.saw_scaled_viper);
                    imageViewHd.setImageResource(R.mipmap.saw_scaled_viper);
                }
            }
        });
    }
}
