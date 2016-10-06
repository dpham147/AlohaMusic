package edu.orangecoastcollege.cs273.dpham147.alohamusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Creates task to run
        TimerTask mediaTask = new TimerTask() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(SplashActivity.this, MediaActivity.class));
            }
        };

        // Runs mediaTask after 3000ms delay
        Timer timer = new Timer();
        timer.schedule(mediaTask, 3000);
    }
}
