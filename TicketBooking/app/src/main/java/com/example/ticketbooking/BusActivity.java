package com.example.ticketbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BusActivity extends AppCompatActivity implements View.OnClickListener{

    Button busDoneButton;
    EditText busFromText,busToText,busTotalSit,busTime,busDate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);

        busDoneButton=(Button)findViewById(R.id.busDoneButton);
        busFromText=(EditText)findViewById(R.id.busFromText);
        busToText=(EditText)findViewById(R.id.busToText);
        busTotalSit=(EditText)findViewById(R.id.busTotalSit);
        busTime=(EditText)findViewById(R.id.busTimeText);
        busDate=(EditText)findViewById(R.id.busDateText);




        busDoneButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String from=busFromText.getText().toString();
        String to=busToText.getText().toString();
        String totalSit=busTotalSit.getText().toString();
        String time=busTime.getText().toString();
        String date=busDate.getText().toString();

        Intent finalBusIntent=new Intent(BusActivity.this,FinalActivity.class);

        finalBusIntent.putExtra("from",from);
        finalBusIntent.putExtra("to",to);
        finalBusIntent.putExtra("totalSit",totalSit);
        finalBusIntent.putExtra("time",time);
        finalBusIntent.putExtra("date",date);

        startActivity(finalBusIntent);

    }
}
