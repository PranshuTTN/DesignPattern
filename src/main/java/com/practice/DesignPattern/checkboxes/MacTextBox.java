package com.practice.DesignPattern.checkboxes;

public class MacTextBox implements TextBox{
    @Override
    public void type() {
        System.out.println("MAC type text box has been created");
    }

    @Override
    public void size() {
        System.out.println("MAC size text box has been created");
    }
}
