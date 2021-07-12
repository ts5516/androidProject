package com.ts5.project1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageViewHolder> {

    List<Post> posts;
    private OnImageListener mOnImageListener;
    public ImageAdapter(List<Post> posts, OnImageListener onImageListener) {
        this.posts = posts;
        this.mOnImageListener = onImageListener;
    }

    @NonNull
    @NotNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_item, parent, false);
        ImageViewHolder imageViewHolder = new ImageViewHolder(view, mOnImageListener);
        return imageViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ImageViewHolder holder, int position) {
        holder.imageView.setImageResource(posts.get(position).getId());
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class ImageViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView imageView;
        OnImageListener onImageListener;
        public ImageViewHolder(@NonNull @NotNull View itemView, OnImageListener onImageListener) {
            super(itemView);
            imageView = itemView.findViewById(R.id.illustration);
            this.onImageListener = onImageListener;

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onImageListener.onImageClick(getAdapterPosition());
        }
    }

    public interface OnImageListener{
        void onImageClick(int position);
    }
}
