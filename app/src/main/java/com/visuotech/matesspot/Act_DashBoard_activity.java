package com.visuotech.matesspot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Act_DashBoard_activity extends AppCompatActivity {

    TextView tv_coin;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act__dash_board_activity);

        tv_coin = findViewById(R.id.tv_coin);

        Intent intent = getIntent();
        String COIN = intent.getStringExtra("Coin");
        tv_coin.setText(COIN);
    }
}
