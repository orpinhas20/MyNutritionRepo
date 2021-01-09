package com.example.mynutritionapp;

public class Component {
    public static final int ContactPosition = 0;
    public static final int DailyStatusPosition = 1;
    public static final int DietDictionaryPosition = 2;
    public static final int FoodTrackingPosition = 3;

    private int viewType;
    private String text = "";

    public Component() {
    }

    // public constructor for the first layout
    public Component(int viewType, String text) {
        this.viewType = viewType;
        this.text = text;
    }

    //TODO: add constructors for evey layout.
    //TODO: add getters & setters for every layout component.

    public int getViewType() { return viewType; }

    public void setViewType(int viewType)
    {
        this.viewType = viewType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
