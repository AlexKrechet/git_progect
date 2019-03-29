package com.test;

import org.junit.Test;

import static com.test.ConsoleApplication.sum;
import static junit.framework.TestCase.assertEquals;

public class ConsoleApplicationTest {

    @Test
    public void shouldReturnSum(){
        int actual = sum(1,2);
        int expected = 3;

        assertEquals(expected, actual);
    }
}
