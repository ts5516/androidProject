package com.ts5.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageinfoActivity extends AppCompatActivity {

    TextView imageName, artist, createTime, tag;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageinfo);

        imageView = findViewById(R.id.imageInfo);
        imageName = findViewById(R.id.imageName);
        artist = findViewById(R.id.artist);
        createTime = findViewById(R.id.createTime);
        tag = findViewById(R.id.tag);

        Intent intent = getIntent();
        Post post = (Post)intent.getSerializableExtra("post");

        imageView.setImageResource(post.getId());
        imageName.setText(post.getName());
        artist.setText(post.getArtist());
        createTime.setText(post.getCreateTime());
        tag.setText(post.getTag());
    }
}