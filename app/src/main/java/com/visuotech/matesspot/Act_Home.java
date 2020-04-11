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
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class Act_Home extends AppCompatActivity {

    TextView tv_coin;
    Toolbar toolbar;
    Spinner sp_country,sp_gender,sp_age_range;
    Context context;
   ImageView iv_addplayer;
   Button btn_dashboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_home);

        tv_coin = findViewById(R.id.tv_coin);
        toolbar = findViewById(R.id.toolbar);
        sp_country = findViewById(R.id.sp_country);
        sp_gender  = findViewById(R.id.sp_gender);
        sp_age_range = findViewById(R.id.sp_age_range);
        btn_dashboard = findViewById(R.id.btn_dashboard);

        context = this;


        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor((Color.parseColor("#FFFFFF")));
        getSupportActionBar().setTitle("Home");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.getNavigationIcon().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);


        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Act_Home.class);
                startActivity(intent);
            }
        });




         btn_dashboard.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(getApplicationContext(),Act_DashBoard.class);
                 startActivity(intent);
             }
         });

        ArrayAdapter<String> countryadapater = new ArrayAdapter<String>(context,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.Countryname));
        countryadapater.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_country.setAdapter(countryadapater);

        ArrayAdapter<String> ageadapter = new ArrayAdapter<String>(context,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.Age_Range));
        countryadapater.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_age_range.setAdapter(ageadapter);

        ArrayAdapter<String> genderadapter = new ArrayAdapter<String>(context,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.Gender));
        countryadapater.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_gender.setAdapter(genderadapter);





        Intent intent = getIntent();
        String COIN = intent.getStringExtra("Coin");
        tv_coin.setText(COIN);


    }
}
