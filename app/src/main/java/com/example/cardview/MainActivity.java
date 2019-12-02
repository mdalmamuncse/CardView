package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView schoolcardView,resturantcardView,hospitalcardView,airportcardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        schoolcardView = findViewById(R.id.schoolCardId);
        resturantcardView = findViewById(R.id.restaurantsCardId);
        hospitalcardView = findViewById(R.id.hospitalCardId);
        airportcardView = findViewById(R.id.airportCardId);

        schoolcardView.setOnClickListener(this);
        resturantcardView.setOnClickListener(this);
        hospitalcardView.setOnClickListener(this);
        airportcardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.schoolCardId){
            //Toast.makeText(this, "School", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this,SchoolActivity.class);
            startActivity(intent);


        }else if (v.getId() == R.id.restaurantsCardId){
            Toast.makeText(this, "Restaurant", Toast.LENGTH_SHORT).show();

        }else if (v.getId() == R.id.hospitalCardId){
            Toast.makeText(this, "Hospital", Toast.LENGTH_SHORT).show();

        }else if (v.getId() == R.id.airportCardId){
            Toast.makeText(this, "Airport", Toast.LENGTH_SHORT).show();

        }

    }
}
