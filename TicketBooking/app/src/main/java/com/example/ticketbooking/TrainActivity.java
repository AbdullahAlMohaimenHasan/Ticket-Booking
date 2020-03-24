package com.example.ticketbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TrainActivity extends AppCompatActivity implements View.OnClickListener{

    Button trainDoneButton;
    EditText trainFromText,trainToText,trainTotalSit,trainTime,trainDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train);

        trainDoneButton=(Button)findViewById(R.id.busDoneButton);

        trainFromText=(EditText)findViewById(R.id.trainFromText);
        trainToText=(EditText)findViewById(R.id.trainToText);
        trainTotalSit=(EditText)findViewById(R.id.trainTotalSit);
        trainTime=(EditText)findViewById(R.id.trainTimeText);
        trainDate=(EditText)findViewById(R.id.trainDateText);

        trainDoneButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String from=trainFromText.getText().toString();
        String to=trainToText.getText().toString();
        String totalSit=trainTotalSit.getText().toString();
        String time=trainTime.getText().toString();
        String date=trainDate.getText().toString();


        Intent finalTrainIntent=new Intent(TrainActivity.this,FinalActivity.class);

        finalTrainIntent.putExtra("from",from);
        finalTrainIntent.putExtra("to",to);
        finalTrainIntent.putExtra("totalSit",totalSit);
        finalTrainIntent.putExtra("time",time);
        finalTrainIntent.putExtra("date",date);

        startActivity(finalTrainIntent);

    }
}
