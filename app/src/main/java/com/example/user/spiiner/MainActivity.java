package com.example.user.spiiner;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity {
    Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp=(Spinner)findViewById(R.id.spinner);
        ArrayAdapter aa=ArrayAdapter.createFromResource(this,R.array.citynames,android.R.layout.simple_spinner_item);
        aa.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        sp.setAdapter(aa);
    }
}
