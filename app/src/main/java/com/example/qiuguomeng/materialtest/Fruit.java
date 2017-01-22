package com.example.qiuguomeng.materialtest;

/**
 * Created by qiuguomeng on 2017/1/21.
 */

public class Fruit {
    private  String name;
    private int imageId;

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }

    public Fruit(String name, int imageId) {

        this.name = name;
        this.imageId = imageId;
    }
}
