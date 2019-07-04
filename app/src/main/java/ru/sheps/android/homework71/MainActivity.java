package ru.sheps.android.homework71;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void synchronization(View view) {
        Intent intent = new Intent(Intent.ACTION_SYNC);

//вставьте обработку условий по времени
        if (/*текущее время с 6:00 до 14:00*/)
            intent.setData(Uri.parse("http://morning"));
// следующее условие

        startActivity(intent);
    }
}
