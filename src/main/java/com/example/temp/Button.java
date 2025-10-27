package com.example.temp;

import com.example.toggle.Switchable;

public class Button implements Switchable {
    private final int posX;
    private final int posY;

    private Switch aSwitch;

    public Button(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;

        aSwitch = Switch.OFF;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    @Override
    public Switch getValue() {
        return aSwitch;
    }

    @Override
    public void toggleOn() {
        aSwitch = Switch.ON;
    }

    @Override
    public void toggleOff() {
        aSwitch = Switch.OFF;
    }
}
