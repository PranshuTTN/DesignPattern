package com.practice.DesignPattern.checkboxes;

public class WindowTextBox implements TextBox {

    @Override
    public void type() {
        System.out.println("Windows Type text box has been created");
    }

    @Override
    public void size() {
        System.out.println("Windows Size text box has been created");
    }
}
