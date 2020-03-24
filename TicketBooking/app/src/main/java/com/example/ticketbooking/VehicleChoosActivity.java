package com.example.ticketbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class VehicleChoosActivity extends AppCompatActivity implements View.OnClickListener{


    Button busButton,trainButton,planeButton;
    TextView collectName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_choos);

        busButton=(Button)findViewById(R.id.buttonBus);
        trainButton=(Button)findViewById(R.id.buttonTrain);
        planeButton=(Button)findViewById(R.id.buttonPlane);
        collectName=(TextView)findViewById(R.id.name);


        busButton.setOnClickListener(this);
        trainButton.setOnClickListener(this);
        planeButton.setOnClickListener(this);


        Bundle bundle = getIntent().getExtras();

        if(bundle!=null){

            String name = bundle.getString("name");
            collectName.setText(name);
        }
    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.buttonBus)
        {
            Intent busButtonIntent=new Intent(VehicleChoosActivity.this, BusActivity.class);
            startActivity(busButtonIntent);
        }

        if(v.getId()==R.id.buttonTrain)
        {
            Intent trainButtonIntent=new Intent(VehicleChoosActivity.this, TrainActivity.class);
            startActivity(trainButtonIntent);
        }

        if(v.getId()==R.id.buttonPlane)
        {
            Intent planeButtonIntent=new Intent(VehicleChoosActivity.this, PlaneActivity.class);
            startActivity(planeButtonIntent);
        }

    }
}
