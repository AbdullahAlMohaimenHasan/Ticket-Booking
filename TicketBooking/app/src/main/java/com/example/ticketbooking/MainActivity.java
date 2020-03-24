package com.example.ticketbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button submitButton;
    EditText sendName,sendAge,sendGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        submitButton=(Button)findViewById(R.id.submitButton);
        submitButton.setOnClickListener(this);

        sendName=(EditText) findViewById(R.id.nameText);
        sendAge=(EditText) findViewById(R.id.ageText);
        sendGender=(EditText) findViewById(R.id.genderText);
    }

    @Override
    public void onClick(View v) {
        String name=sendName.getText().toString();
        String age=sendAge.getText().toString();
        String gender=sendGender.getText().toString();

        Intent submitIntent=new Intent(MainActivity.this, VehicleChoosActivity.class);

        submitIntent.putExtra("name",name);
        startActivity(submitIntent);
    }
}
