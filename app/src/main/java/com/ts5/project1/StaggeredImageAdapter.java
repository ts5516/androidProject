package com.ts5.project1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class StaggeredImageAdapter extends RecyclerView.Adapter<StaggeredImageAdapter.ImageViewHolder> {

    List<Post> posts;
    private OnImageListener mOnImageListener;
    public StaggeredImageAdapter(List<Post> posts, OnImageListener onImageListener) {
        this.posts = posts;
        this.mOnImageListener = onImageListener;
    }

    @NonNull
    @NotNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.staggered_item, parent, false);
        return new ImageViewHolder(view, mOnImageListener);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull StaggeredImageAdapter.ImageViewHolder holder, int position) {
        holder.imageView.setImageResource(posts.get(position).getId());
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class ImageViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView imageView;
        OnImageListener onImageListener;
        public ImageViewHolder(@NonNull @NotNull View itemView, OnImageListener onImageListener) {
            super(itemView);
            imageView = itemView.findViewById(R.id.staggeredImage);
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
