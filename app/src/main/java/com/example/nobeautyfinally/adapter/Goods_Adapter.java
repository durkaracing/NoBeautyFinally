package com.example.nobeautyfinally.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nobeautyfinally.Good_Page;
import com.example.nobeautyfinally.R;
import com.example.nobeautyfinally.model.Goods_class;

import org.w3c.dom.Text;

import java.util.List;

public class Goods_Adapter extends RecyclerView.Adapter<Goods_Adapter.GoodViewHolder> {
    Context context;
    List<Goods_class> goods;




    public Goods_Adapter(Context context, List<Goods_class> goods) {
        this.context = context;
        this.goods = goods;
    }


    @NonNull
    @Override
    public Goods_Adapter.GoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View goods_item = LayoutInflater.from(context).inflate(R.layout.goods_item, parent, false);
        return new Goods_Adapter.GoodViewHolder(goods_item); ///////

    }

    @Override
    public void onBindViewHolder(@NonNull Goods_Adapter.GoodViewHolder holder, @SuppressLint("RecyclerView") int position) {
        int GoodID = context.getResources().getIdentifier(goods.get(position).getBlock(), "drawable", context.getPackageName());
        int IconID = context.getResources().getIdentifier(goods.get(position).getIcongood(), "drawable", context.getPackageName());
        holder.Name_of_good.setText(goods.get(position).getNameofgood());
        holder.description_of_good.setText(goods.get(position).getDescriptionofgood());
        holder.Good.setImageResource(GoodID);
        holder.icon_good.setImageResource(IconID);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Good_Page.class);

                intent.putExtra("Name_of_good", goods.get(position).getNameofgood());
                intent.putExtra("description_of_good", goods.get(position).getDescriptionofgood());
                intent.putExtra("icon_good", IconID);
                intent.putExtra("total_description_of_good", goods.get(position).getText());
                context.startActivity(intent);

            }
        });
    }



    @Override
    public int getItemCount() {
        return goods.size();
    }

    public static final class GoodViewHolder extends RecyclerView.ViewHolder{
        ImageView Good, icon_good;
        TextView Name_of_good, description_of_good;

        public GoodViewHolder(@NonNull View itemView) {
            super(itemView);
            icon_good = itemView.findViewById(R.id.icon_good);
            Name_of_good = itemView.findViewById(R.id.name_of_good);
            description_of_good = itemView.findViewById(R.id.description_good);
            Good = itemView.findViewById(R.id.imageView21);
        }
    }


}
