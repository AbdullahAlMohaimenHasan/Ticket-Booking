package com.example.ticketbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PlaneActivity extends AppCompatActivity implements View.OnClickListener{

    Button planeDoneButton;
    EditText planeFromText,planeToText,planeTotalSit,planeTime,planeDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plane);

        planeDoneButton=(Button)findViewById(R.id.planeDoneButton);

        planeFromText=(EditText)findViewById(R.id.planeFromText);
        planeToText=(EditText)findViewById(R.id.planeToText);
        planeTotalSit=(EditText)findViewById(R.id.planeTotalSit);
        planeTime=(EditText)findViewById(R.id.planeTimeText);
        planeDate=(EditText)findViewById(R.id.planeDateText);

        planeDoneButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String from=planeFromText.getText().toString();
        String to=planeToText.getText().toString();
        String totalSit=planeTotalSit.getText().toString();
        String time=planeTime.getText().toString();
        String date=planeDate.getText().toString();


        Intent finalPLaneIntent=new Intent(PlaneActivity.this,FinalActivity.class);

        finalPLaneIntent.putExtra("from",from);
        finalPLaneIntent.putExtra("to",to);
        finalPLaneIntent.putExtra("totalSit",totalSit);
        finalPLaneIntent.putExtra("time",time);
        finalPLaneIntent.putExtra("date",date);

        startActivity(finalPLaneIntent);

    }
}
