package com.example.nobeautyfinally;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Toast;

import com.example.nobeautyfinally.adapter.PhotosAdapter;

import com.example.nobeautyfinally.model.Photosmain;

import java.util.ArrayList;
import java.util.List;

 public class MainActivity extends AppCompatActivity {

    RecyclerView PhotoRecycler;
    PhotosAdapter PhotosAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Photosmain> PhotosList = new ArrayList<>();
        PhotosList.add(new Photosmain(1, "outsie1" ));
        PhotosList.add(new Photosmain(2, "inside1" ));
        PhotosList.add(new Photosmain(3, "inside2" ));
        PhotosList.add(new Photosmain(4, "insie3" ));
        SetPhotoRecycler(PhotosList);
    }

    private void SetPhotoRecycler(List<Photosmain> PhotosList){
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        PhotoRecycler = findViewById(R.id.PhotoRecycler);
        PhotoRecycler.setLayoutManager(layoutManager);

        PhotosAdapter = new PhotosAdapter(this, PhotosList);
        PhotoRecycler.setAdapter(PhotosAdapter);
     }

     public void rating(View v){
         Toast toast1 = Toast.makeText(this,
                 "Наш рейтинг - неизменно 5", Toast.LENGTH_SHORT);
         toast1.show();

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


}