package com.example.nobeautyfinally;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Prfl_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prfl);
    }

    public void ToCatalog(View v){
        Intent intent = new Intent(this, Catalog_Activity.class);
        startActivity(intent);
    }

    public void ToProfile(View v){
        Intent intent = new Intent(this, Prfl_Activity.class);
        startActivity(intent);
    }

    public void ToMain(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    public void ratin(View v){
        Toast toast1 = Toast.makeText(this,
                "Здесь пусто!", Toast.LENGTH_SHORT);
        toast1.show();
    }
    public void history(View v) {
        Toast toast1 = Toast.makeText(this,
                "Скоро!", Toast.LENGTH_SHORT);
        toast1.show();
    }

    public void prfl(View v) {
        Toast toast1 = Toast.makeText(this,
                "Скоро!", Toast.LENGTH_SHORT);
        toast1.show();

    }
}