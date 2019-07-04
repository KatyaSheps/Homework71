package ru.sheps.android.homework71;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MorningActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morning);
        Toast.makeText(this, "Доброе утро!", Toast.LENGTH_LONG).show();

    }
}
