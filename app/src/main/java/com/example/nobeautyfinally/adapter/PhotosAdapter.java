package com.example.nobeautyfinally.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nobeautyfinally.R;
import com.example.nobeautyfinally.model.Photosmain;

import java.util.List;

public class PhotosAdapter extends RecyclerView.Adapter<PhotosAdapter.PhotoViewHolder> {

    Context context;
    List<Photosmain> photos;

    public PhotosAdapter(Context context, List<Photosmain> photos) {
        this.context = context;
        this.photos = photos;
    }

    @NonNull
    @Override
    public PhotoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View photosItem = LayoutInflater.from(context).inflate(R.layout.photos_item, parent, false);
        return new PhotosAdapter.PhotoViewHolder(photosItem);

    }

    @Override
    public void onBindViewHolder(@NonNull PhotoViewHolder holder, int position) {
        int ImageID = context.getResources().getIdentifier(photos.get(position).getImg(), "drawable", context.getPackageName());
        holder.Photo.setImageResource(ImageID);

    }

    @Override
    public int getItemCount() {
        return photos.size();
    }

    public static final class PhotoViewHolder extends RecyclerView.ViewHolder{
        ImageView Photo;
        public PhotoViewHolder(@NonNull View itemView) {
            super(itemView);
            Photo = itemView.findViewById(R.id.mainphoto);
        }
    }
}
