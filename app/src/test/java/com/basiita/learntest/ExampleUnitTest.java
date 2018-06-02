package com.basiita.learntest;

import org.junit.Test;

import static org.junit.Assert.*;
import  com.basiita.*;

import yummy.class1;


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public  void test_yummy_class1()
    {
        class1 myclass =new class1();
        int result=myclass.yummy_method(10,20);
        assertEquals(30,result);
    }

    @Test
    public  void test_yummy_class2()
    {
        class1 myclass =new class1();
        String result=myclass.yummy_method2(10);
        assertEquals("ali",result);
    }
}