package com.visuotech.matesspot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class Act_Signup extends AppCompatActivity {

    EditText et_name,et_age;
    RadioGroup rd_group;
    RadioButton rb_male,rb_female;
    Button btn_sub;
    String Coin = "5000coins";

    Toolbar toolbar;
    Spinner sp_country;
    Context context;
    String Gender;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_signup);

        toolbar = findViewById(R.id.toolbar);

        et_name = findViewById(R.id.et_name);
        et_age = findViewById(R.id.et_age);
        rd_group = findViewById(R.id.radioGroup);
        rb_female = findViewById(R.id.rb_female);
        rb_male = findViewById(R.id.rb_male);
        btn_sub = findViewById(R.id.btn_submit);

        toolbar = findViewById(R.id.toolbar);
        sp_country = findViewById(R.id.spinner_country);

        context = this;

        ArrayAdapter<String> countryadapater = new ArrayAdapter<String>(context,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.Countryname));
        countryadapater.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_country.setAdapter(countryadapater);






        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor((Color.parseColor("#FFFFFF")));
        getSupportActionBar().setTitle("Registration");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.getNavigationIcon().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);


        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Act_Home.class);
                intent.putExtra("Coin",Coin);
                startActivity(intent);
            }
        });


        rd_group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId != -1) {
                    Gender = ((RadioButton)findViewById(checkedId)).getText().toString();
                }
                else
                {
                    Gender = "";
                }
            }
        });
    }
}
