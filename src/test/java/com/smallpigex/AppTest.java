package com.smallpigex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void testApp() {
        assertTrue(true);
    }

    @Test
    public void testApp2() {
        App app = new App();
        assertEquals("hello", app.sayHell());
    }


}
