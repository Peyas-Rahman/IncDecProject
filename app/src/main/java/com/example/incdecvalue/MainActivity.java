package com.example.incdecvalue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView showValue;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showValue = (TextView) findViewById(R.id.nameText);

    }

    public  void CounterIn (View view)
    {
        count++;
        showValue.setText(Integer.toString(count));

    }


    public  void CounterDec (View view)
    {
        count--;
        showValue.setText(Integer.toString(count));

    }
}
