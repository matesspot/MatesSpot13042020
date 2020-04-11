package com.visuotech.matesspot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Act_Signup extends AppCompatActivity {

    EditText et_name,et_age;
    RadioGroup rd;
    RadioButton rb_male,rb_female;
    Button btn_sub;
    String Coin = "5000coins";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_signup);

        et_name = findViewById(R.id.et_name);
        et_age = findViewById(R.id.et_age);
        rd = findViewById(R.id.radioGroup);
        rb_female = findViewById(R.id.rb_female);
        rb_male = findViewById(R.id.rb_male);
        btn_sub = findViewById(R.id.btn_submit);


        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Act_DashBoard_activity.class);
                intent.putExtra("Coin",Coin);
                startActivity(intent);
            }
        });
    }
}
