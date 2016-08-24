package com.example.kaiso.waterlogger;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
//        progressBar.setVisibility(View.VISIBLE);
//        progressBar.setProgress(0);

        final ProgressBar bar = (ProgressBar) findViewById(R.id.progressBar);
       // final TextView progressText = (TextView) findViewById(R.id.progressText_detail);
        //final ImageView btnCancel = (ImageView) findViewById(R.id.imgCancel_detail);
        bar.post(new Runnable() {
            @Override
            public void run() {
                bar.setProgress(10);
            }
        });

    }
}
