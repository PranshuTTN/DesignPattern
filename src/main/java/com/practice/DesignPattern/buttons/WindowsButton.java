package com.practice.DesignPattern.buttons;

public class WindowsButton implements Button{
    @Override
    public void size(int height, int width) {
        System.out.println("Windows button has been created of size: " + (height*width));
    }

    @Override
    public void colour(String color) {
        System.out.println("Windows button has been created of colour: " + color);
    }
}
