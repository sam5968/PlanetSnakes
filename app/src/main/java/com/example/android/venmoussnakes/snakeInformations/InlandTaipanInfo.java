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
 * Created by Admin on 28-Jan-17.
 */

public class InlandTaipanInfo extends Activity {

    private ImageView imageView;
    private RatingBar ratingBar;
    private Context context;
    private ImageView imageViewHd;
    boolean isImageFitToScreen;

    public InlandTaipanInfo () {

    }

    public InlandTaipanInfo (Context context) {
        this.context = context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inland_taipan_info);

        // Get Intent data
        Intent mIntent = getIntent();
        int position = mIntent.getExtras().getInt("id");
        MyAdapter myAdapter = new MyAdapter(this);

        imageView = (ImageView) findViewById(R.id.inland_taipan);
        ratingBar = (RatingBar) findViewById(R.id.inland_taipan_rating);

        imageView.setImageResource(R.drawable.inland_taipan);
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
                    imageViewHd = (ImageView) findViewById(R.id.inland_taipan);
                    imageViewHd.setImageResource(R.drawable.inland_taipan);
                }
            }
        });
    }
}
