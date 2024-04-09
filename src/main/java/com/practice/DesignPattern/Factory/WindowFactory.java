package com.practice.DesignPattern.Factory;

import com.practice.DesignPattern.buttons.Button;
import com.practice.DesignPattern.buttons.WindowsButton;
import com.practice.DesignPattern.checkboxes.TextBox;
import com.practice.DesignPattern.checkboxes.WindowTextBox;

public class WindowFactory implements Factory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextBox createTextBox() {
        return new WindowTextBox();
    }
}
