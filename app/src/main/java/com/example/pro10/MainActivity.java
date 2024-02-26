package com.example.pro10;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    int counter=0;
    Button btn1;
    ToggleButton tB;
    Switch switch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tB = (ToggleButton) findViewById(R.id.tb1);
        switch1 = (Switch) findViewById(R.id.switch1);
        btn1 = (Button) findViewById(R.id.btn1);
    }
    public void clicked(View view){
        if (switch1.isChecked()==true && tB.isChecked()==false){
            getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
        }
        if (switch1.isChecked()==false && tB.isChecked()==true){
            getWindow().getDecorView().setBackgroundColor(Color.GREEN);
        }
        if (switch1.isChecked()==true && tB.isChecked()==true) {
            getWindow().getDecorView().setBackgroundColor(Color.RED);
        }
        if (switch1.isChecked()==false && tB.isChecked()==false){
            getWindow().getDecorView().setBackgroundColor(Color.BLUE);
        }

    }
}