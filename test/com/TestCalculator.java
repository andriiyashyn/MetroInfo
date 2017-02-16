package com;

import org.junit.Test;

public class TestCalculator{
    
    @Test
    public void testSum{
        Calculator cal = new Calculator();
        Test.assertEquals(2,cal.add(1,1));
    }
}
