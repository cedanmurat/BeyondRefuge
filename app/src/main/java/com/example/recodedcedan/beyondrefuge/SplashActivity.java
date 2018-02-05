package com.example.recodedcedan.beyondrefuge;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class SplashActivity extends AppCompatActivity {
    String[] splashText={"Education","Information","News"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                finish();
            }
        }, 3000);
    }
    @Override
    protected void onResume() {
        super.onResume();
        updateTextView();
    }

    private void updateTextView() {
        TextView textView = (TextView)findViewById(R.id.splashText);
        Random random = new Random();

        int maxIndex = splashText.length;
        int generatedIndex = random.nextInt(maxIndex);

        textView.setText(splashText[generatedIndex]);
    }
}
