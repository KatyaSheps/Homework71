package ru.sheps.android.homework71;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
   Button btnSynchronization;
    private static final int MORNING_START_TIME_HOUR = 6;
    private static final int AFTERNOON_START_TIME_HOUR = 14;
    private static final int EVENING_START_TIME_HOUR = 15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSynchronization = findViewById(R.id.button);
    }

    public void synchronization(View view) {
        Intent intent = new Intent(Intent.ACTION_SYNC);
        // String timeStamp = new SimpleDateFormat("HH:mm").format(Calendar.getInstance().getTime());
        // Toast.makeText(this, timeStamp, Toast.LENGTH_LONG).show();

        int hours = Calendar.getInstance().getTime().getHours();
        if(hours >= MORNING_START_TIME_HOUR && hours < AFTERNOON_START_TIME_HOUR) {
            intent.setData(Uri.parse("http://morning"));
        }
        if(hours >= AFTERNOON_START_TIME_HOUR && hours < EVENING_START_TIME_HOUR) {
            intent.setData(Uri.parse("http://afterboon"));
        }
        if(hours >= EVENING_START_TIME_HOUR || hours < MORNING_START_TIME_HOUR) {
            intent.setData(Uri.parse("http://evening"));
        }

        startActivity(intent);
    }
}
