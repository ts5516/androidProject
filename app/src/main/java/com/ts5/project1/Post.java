package com.ts5.project1;

import java.io.Serializable;

public class Post implements Serializable {
    private int id;
    private String name;
    private String artist;
    private String createTime;
    private String tag;

    public Post(int id, String name, String artist, String createTime, String tag) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.createTime = createTime;
        this.tag = tag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
