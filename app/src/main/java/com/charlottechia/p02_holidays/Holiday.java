package com.charlottechia.p02_holidays;

public class Holiday {
    String name;
    int imageName;
    String date;

    public String getDate() {
        return date;
    }

    public Holiday(String name, int imageName, String date) {
        this.name = name;
        this.imageName = imageName;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageName() {
        return imageName;
    }

    public void setImageName(int imageName) {
        this.imageName = imageName;
    }
}
