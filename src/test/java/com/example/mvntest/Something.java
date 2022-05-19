package com.example.mvntest;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */

// this test case is not executed by maven because its name does not follow the form: SomethingTest.java
public class Something {

    @Test
    public void oneDotOneTest()
    {
        assertEquals(1*1, 1);
    }
}
