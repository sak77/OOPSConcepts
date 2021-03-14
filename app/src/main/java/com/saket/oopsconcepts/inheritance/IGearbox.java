package com.saket.oopsconcepts.inheritance;

/**
 *
 */
public interface IGearbox {
    enum GEARBOX_TYPE {
        MANUAL, AUTOMATIC
    }

    enum GEARBOX_PLACEMENT {
        STICK, PADDLE_SHIFT
    }

    GEARBOX_TYPE getGearBoxType();

    GEARBOX_PLACEMENT getGearBoxPlacement();
}
