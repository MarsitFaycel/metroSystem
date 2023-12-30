package org.example.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    @Test
    void cardBalanceIsEqual100() {
        Card card = new Card();
        assertEquals(card.getBalance(),100);
    }
}