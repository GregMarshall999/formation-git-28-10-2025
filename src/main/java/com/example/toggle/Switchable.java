package com.example.toggle;

import com.example.temp.Switch;

public interface Switchable {
    void toggleOn();
    void toggleOff();
    Switch getValue();
}
