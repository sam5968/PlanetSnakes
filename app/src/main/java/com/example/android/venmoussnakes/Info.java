package com.example.android.venmoussnakes;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;

/**
 * Created by Admin on 04-Dec-16.
 */

public class Info extends Activity {

    private ImageView imageView;
    private RatingBar ratingBar;
    private Context context;
    private ImageView imageViewHd;
    boolean isImageFitToScreen;

    public Info() {

    }

    public Info(Context context) {
        this.context = context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.black_mamba_info);

        // Get Intent data
        Intent mIntent = getIntent();
        int position = mIntent.getExtras().getInt("id"); //getIntExtra("position", 0);
        MyAdapter myAdapter = new MyAdapter(this);


        imageView = (ImageView) findViewById(R.id.black_mamba);
        ratingBar = (RatingBar) findViewById(R.id.black_mamba_rating);

        imageView.setImageResource(R.drawable.black_mamba);
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

                /*if (view == imageView) {
                    imageViewHd = (ImageView) findViewById(R.id.black_mamba);
                    imageViewHd.setImageResource(R.drawable.black_mamba);
                }*/
            }
        });
    }
}


//////////////////////// Redundant Codes ////////////////////////

        /*Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.black_mamba);
        Bitmap reSized = Bitmap.createScaledBitmap(bitmap, 100, 100, true);
        Bitmap rect = getRoundedRectBitmap(reSized, 100);
        imageView.setImageBitmap(rect);*/


    /*public static Bitmap getRoundedRectBitmap(Bitmap bitmap, int pixels) {
        Bitmap result = null;

        try {
            result = Bitmap.createBitmap(200, 200, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(result);

            int color = 0xff424242;
            Paint paint = new Paint();
            Rect rect = new Rect(0, 0, 200, 200);

            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(color);
            canvas.drawCircle(50, 50, 50, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, rect, rect, paint);

        } catch (NullPointerException | OutOfMemoryError e) {
            Log.e("Null object", "Can't proceed");
        }
        return result;
    }
*/

    // Selected image id
    /*int position = i.getExtras().getInt("id");
    MyAdapter imageAdapter = new MyAdapter(this);*/


