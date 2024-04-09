package com.practice.DesignPattern.buttons;

public class MacButton implements Button{
    int height;
    int width;
    String color;

    public MacButton(int height, int width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    @Override
    public void size(int height, int width) {
        System.out.println("MAC button has been created of size: " + (height*width));
    }

    @Override
    public void colour(String color) {
        System.out.println("MAC button has been created of colour: " + color);
    }

}
