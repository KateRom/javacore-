package com.KateRom.app.classwork.Lesson3;

import org.junit.Assert;
import org.junit.Test;

public class MathFuncTest {
    @Test //JUnit framework annotation
    public void multiplyTest() {
        int a = 2, b = 3, expRes = 6;
        Assert.assertEquals(expRes, MathFunc.multiply(a, b));
    }
}

