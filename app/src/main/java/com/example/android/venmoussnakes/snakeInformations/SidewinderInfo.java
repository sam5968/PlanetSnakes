package com.example.android.venmoussnakes.snakeInformations;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;

import com.example.android.venmoussnakes.MyAdapter;
import com.example.android.venmoussnakes.R;

/**
 * Created by Admin on 19-May-17.
 */

public class SidewinderInfo extends Activity {

    private ImageView imageView;
    private Context context;
    private RatingBar ratingBar;
    private ImageView imageViewHd;
    boolean isImageFitToScreen;

    public SidewinderInfo() {

    }

    public SidewinderInfo(Context context) {
        this.context = context;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sidewinder);

        // Get Intent data
        Intent mIntent = getIntent();
        int position = mIntent.getExtras().getInt("id");
        MyAdapter myAdapter = new MyAdapter(this);

        imageView = (ImageView) findViewById(R.id.sidewinder);
        ratingBar = (RatingBar) findViewById(R.id.sidewinder_rating);

        imageView.setImageResource(R.drawable.sidewinder);
        ratingBar.setRating(2);

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
                    imageViewHd = (ImageView) findViewById(R.id.sidewinder);
                    imageViewHd.setImageResource(R.drawable.sidewinder);
                }
            }
        });
    }
}
