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
        if(hours >= 6 && hours < 14) {
            intent.setData(Uri.parse("http://morning"));
        }
        if(hours >= 14 && hours < 15) {
            intent.setData(Uri.parse("http://afterboon"));
        }
        if(hours >= 15 || hours < 6) {
            intent.setData(Uri.parse("http://evening"));
        }

        startActivity(intent);
    }
}
