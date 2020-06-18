package com.example.challengeday1_project1_makeitrainapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MAIN ACTIVITY";
    private int counterAmount = 0;
    private TextView showAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showAmount = findViewById(R.id.text_amount);
    }

    public void makeItRain(View view){
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        counterAmount += 1000;
        showAmount.setText(numberFormat.format(counterAmount));
        switch (counterAmount){
            case 5000:
                showAmount.setTextColor(getResources().getColor(R.color.colorStage1));
                break;

            case 10000:
                showAmount.setTextColor(getResources().getColor(R.color.colorStage2));
                break;
        }

    }

    public void toastMessage(View view){
        Toast.makeText(getApplicationContext(),R.string.text_toastAmountIs,Toast.LENGTH_SHORT).show();
    }

    public void logMessage(View view){
        Log.d(TAG, "logMessage: "+counterAmount);
    }
}
