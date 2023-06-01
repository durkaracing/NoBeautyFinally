 package com.example.nobeautyfinally;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.nobeautyfinally.adapter.Goods_Adapter;
import com.example.nobeautyfinally.model.Goods_class;

import java.util.ArrayList;
import java.util.List;

 public class Catalog_Activity extends AppCompatActivity {

     Goods_Adapter Goods_Adapter;
     RecyclerView Goods_Recycler;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_catalog);
         List<Goods_class> goods = new ArrayList<>();
         goods.add(new Goods_class(0, "good_novisible_rectangle", "Женская", "1400", "whair1", "Женская комплексная стрижка"));
         goods.add(new Goods_class(1, "good_novisible_rectangle", "Женская +\n укладка", "2000", "whair2", "Особенностью укладки волос является то, \nчто мастер, применив весь свой опыт, умение и фантазию, найдёт самый лучший вариант для сочетания Вашей причёски, формы, цвета лица и гардероба."));
         goods.add(new Goods_class(2, "good_novisible_rectangle", "Мужская +", "1200", "mhair1", "Сложная мужская прическа \n - все индвидуально обговаривается \nс мастером"));
         goods.add(new Goods_class(3, "good_novisible_rectangle", "Мужская", "1600", "mhair2", "Мужская стрижка, на выбор дается огромное \nколичество вариантов из каталога"));
         SetGoodRecycler(goods);
     }



     private void SetGoodRecycler(List<Goods_class> goods) {
         RecyclerView.LayoutManager layoutManager = (new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));


         Goods_Recycler = findViewById(R.id.Goods_Recycler);
         Goods_Recycler.setLayoutManager(layoutManager);

         Goods_Adapter = new Goods_Adapter(this, goods);
         Goods_Recycler.setAdapter(Goods_Adapter);
     }

     public void soon(View v){
         Toast toast1 = Toast.makeText(this,
                 "В разработке!", Toast.LENGTH_SHORT);
         toast1.show();
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