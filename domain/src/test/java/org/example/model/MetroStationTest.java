package org.example.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MetroStationTest {

    @Test
    void checkSwipIn() throws NoSuchMethodException {

        Assertions.assertEquals( MetroStation.class.getMethod("swipeIn").getModifiers(), 1);
    }
    @Test
    void checkSwipOut() throws NoSuchMethodException {

        Assertions.assertEquals( MetroStation.class.getMethod("swipeOut").getModifiers(), 1);
    }
}
