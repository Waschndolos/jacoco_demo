package de.waschndolos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DummyClassTest {

    private final DummyClass sut = new DummyClass();

    @Test
    void testGetB() {
        assertTrue(sut.getB());
    }
}