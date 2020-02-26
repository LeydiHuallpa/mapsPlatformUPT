package com.example.mapsplatformupt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irdibujaRuta(View view) {
        startActivity(new Intent(this, RutaEntreDosPuntos.class));

    }

    public void irdibujaRuta2(View view) {
        startActivity(new Intent(this, MiGeocode.class));

    }
}
