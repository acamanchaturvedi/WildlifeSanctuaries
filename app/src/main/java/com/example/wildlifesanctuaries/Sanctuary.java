package com.example.wildlifesanctuaries;

public class Sanctuary {

    private String sanctuaryName;

    private String sanctuaryAddress;

    private int imageResourceId;

    public Sanctuary(String sanctuaryName, String sanctuaryAddress, int imageResourceId) {
        this.sanctuaryName = sanctuaryName;
        this.sanctuaryAddress = sanctuaryAddress;
        this.imageResourceId = imageResourceId;
    }

    public String getSanctuaryName() {
        return sanctuaryName;
    }

    public String getSanctuaryAddress() {
        return sanctuaryAddress;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

}
