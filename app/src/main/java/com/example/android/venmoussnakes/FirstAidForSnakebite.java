package com.example.android.venmoussnakes;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by Admin on 07-Jun-17.
 */

public class FirstAidForSnakebite extends Activity {

    private TextView firstAid;
    private Context context;

    public FirstAidForSnakebite() {

    }

    public FirstAidForSnakebite(Context context) {
        this.context = context;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_aid_snakebite);

        firstAid = (TextView) findViewById(R.id.snake_identification);

    }
}
