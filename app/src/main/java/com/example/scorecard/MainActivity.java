package com.example.scorecard;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView tvScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvScore = findViewById(R.id.tvScore); // initialize the text view using
    }

    /***
     * show the current count using a toast message
     * @param view
     */
    public void showToast(View view) {
        String message = "The current score is " + tvScore.getText().toString();
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    /***
     * Increment the count by 1
     * @param view
     */
    public void increaseCount(View view) {
        int score = Integer.parseInt(tvScore.getText().toString());
        tvScore.setText(++score + "");
    }

    /***
     * Decrement the count by 1
     * @param view
     */
    public void decrementCount(View view) {
        int score = Integer.parseInt(tvScore.getText().toString());
        if (!(score <= 0)) {
            tvScore.setText(--score + "");
        }
    }


}
