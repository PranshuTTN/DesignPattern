package com.practice.DesignPattern.Factory;

import com.practice.DesignPattern.buttons.Button;
import com.practice.DesignPattern.checkboxes.TextBox;

public interface Factory {
    Button createButton();
    TextBox createTextBox();
}
