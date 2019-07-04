package ru.sheps.android.homework71;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class EveningActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afternoon);
        Toast.makeText(this, "Добрый вечер!", Toast.LENGTH_LONG).show();

    }
}

