package com.example.wuxif_000.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
       // assertEquals(4, 2 + 2);
        test();
    }
    public void test(){
        for (int i = 0; i < 10; i++) {
            System.out.println("hello"+i);
        }
    }
}