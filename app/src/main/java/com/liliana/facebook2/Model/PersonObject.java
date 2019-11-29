package com.liliana.facebook2.Model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "t_object")
public class PersonObject {
    @PrimaryKey(autoGenerate = true)
    public int fie_id;
    private String name;

    private int Avatar;
    private int coverImage;
    private String word;
    private String address;
    public PersonObject() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public PersonObject(int iD, String name, int avatar, int coverImage, String word, String address) {
        this.fie_id = iD;
        this.name = name;
        Avatar = avatar;
        this.coverImage = coverImage;
        this.word = word;
        this.address = address;
    }

    public int getFie_iD() {
        return fie_id;
    }

    public void setFie_iD(int iD) {
        this.fie_id = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvatar() {
        return Avatar;
    }

    public void setAvatar(int avatar) {
        Avatar = avatar;
    }

    public int getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(int coverImage) {
        this.coverImage = coverImage;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
