package com.example.androidretrofit.model;

//Remember to import this stuff cause otherwise I get stuck for like an hour lol
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VolumeImageLinks {
    @SerializedName("smallThumbnail")
    @Expose
    private String smallThumbnail;

    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;

    public String getSmallThumbnail() {
        return smallThumbnail;
    }

    public String getThumbnail() {
        return thumbnail;
    }
}