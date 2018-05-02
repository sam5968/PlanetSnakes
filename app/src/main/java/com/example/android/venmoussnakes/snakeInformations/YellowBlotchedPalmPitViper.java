package com.example.android.venmoussnakes.snakeInformations;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;

import com.example.android.venmoussnakes.MyAdapter;
import com.example.android.venmoussnakes.R;

/**
 * Created by Admin on 09-May-17.
 */

public class YellowBlotchedPalmPitViper extends Activity {

    private ImageView imageView;
    private RatingBar ratingBar;
    private Context context;
    private ImageView imageViewHd;
    boolean isImageFitToScreen;

    public YellowBlotchedPalmPitViper() {

    }

    public YellowBlotchedPalmPitViper(Context context) {
        this.context = context;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yellow_blotched_palm_viper);

        // Get Intent data
        android.content.Intent mIntent = getIntent();
        int position = mIntent.getExtras().getInt("id");
        MyAdapter myAdapter = new MyAdapter(this);

        imageView = (ImageView) findViewById(R.id.blotched_palm_viper);
        ratingBar = (RatingBar) findViewById(R.id.blotched_palm_viper_rating);

        imageView.setImageResource(R.drawable.yellow_blotched_palm_pitviper);
        ratingBar.setRating(3);

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
                    imageViewHd = (ImageView) findViewById(R.id.blotched_palm_viper);
                    imageViewHd.setImageResource(R.drawable.yellow_blotched_palm_pitviper);
                }
            }
        });
    }
}
