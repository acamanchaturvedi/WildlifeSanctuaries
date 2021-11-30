package com.example.wildlifesanctuaries;

public class State {

    private final String stateName;



    private final int imageResourceId;

    public State( String stateName, int imageResourceId) {
        this.stateName = stateName;

        this.imageResourceId = imageResourceId;
    }

    public String getStateName() {
        return stateName;
    }


    public int getImageResourceId() {
        return imageResourceId;
    }

}

