package com.practice.DesignPattern.Factory;

import com.practice.DesignPattern.buttons.Button;
import com.practice.DesignPattern.buttons.MacButton;
import com.practice.DesignPattern.checkboxes.MacTextBox;
import com.practice.DesignPattern.checkboxes.TextBox;

public class MacFactory implements Factory{
    @Override
    public Button createButton() {
        return new MacButton(10,10,"Black");
    }

    @Override
    public TextBox createTextBox() {
        return new MacTextBox();
    }
}
