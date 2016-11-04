package de.slashgarbage.example;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ExampleTest {

    @Test
    public void testExample() throws Exception {
        Example example = new Example();
        //noinspection ConstantConditions
        assertTrue(example instanceof Example);
    }
}
