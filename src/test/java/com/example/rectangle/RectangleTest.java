package com.example.rectangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    public void testGetPerimeter() {
        int w = 10;
        int h = 20;
        Rectangle r = new Rectangle(w, h);
        assertEquals(r.getPerimeter(), w*2+h*2);
    }

    @Test
    public void testGetSquare() {
        int w = 5;
        int h = 6;
        Rectangle r = new Rectangle(w, h);
        assertEquals(r.getSquare(), w*h);
    }

    @Test
    public void testGetHeight() {
        int w = 4;
        int h = 40;
        Rectangle r = new Rectangle(w, h);
        assertEquals(r.getHeight(), h);
    }

    @Test
    public void testGetWidth() {
        int w = 4;
        int h = 40;
        Rectangle r = new Rectangle(w, h);
        assertEquals(r.getWidth(), w);
    }

    @Test
    public void testSetHeight_arbitrary() {
        int w = 4;
        int h = 40;
        Rectangle r = new Rectangle(w, h);
        r.setHeight(60);
        assertEquals(r.getHeight(), 60);
    }

    @Test
    public void testSetWidth_arbitrary() {
        int w = 4;
        int h = 40;
        Rectangle r = new Rectangle(w, h);
        r.setWidth(30);
        assertEquals(r.getWidth(), 30);
    }

    @Test
    public void testSetWidth_0_throw() {
        Rectangle r = new Rectangle(2, 3);
        try {
            r.setWidth(0);
            fail("Удалось установить ширину равной нулю");
        }
        catch (Exception e) {
            assertNotEquals(r.getWidth(), 0);
        }
    }

    @Test
    public void testSetHeight_0_throw() {
        Rectangle r = new Rectangle(2, 3);
        try {
            r.setHeight(0);
            fail("Удалось установить высоту равной нулю");
        }
        catch (Exception e) {
            assertNotEquals(r.getHeight(), 0);
        }
    }
}