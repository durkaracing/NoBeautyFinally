package com.example.nobeautyfinally;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Good_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_good_page);

        ImageView icon_good = findViewById(R.id.icon_good);
        TextView Name_of_good = findViewById(R.id.name_of_good);
        TextView description_of_good = findViewById(R.id.description_good);
        TextView total_description_of_good = findViewById(R.id.total_description_of_good);

        icon_good.setImageResource(getIntent().getIntExtra("icon_good", 0));
        Name_of_good.setText(getIntent().getStringExtra("Name_of_good"));
        description_of_good.setText(getIntent().getStringExtra("description_of_good"));
        total_description_of_good.setText(getIntent().getStringExtra("total_description_of_good"));
    }
    public void rating(View v){
        Toast toast = Toast.makeText(this,
                "Скоро", Toast.LENGTH_SHORT);
        toast.show();
    }
}