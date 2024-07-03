package com.driver.test;

//import static org.junit.Assert.*;

import com.driver.A;
import com.driver.B;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCases {

    @Test
    public void testMethodINA() {
        A a = new A();
        Assertions.assertEquals("Invoking method from class A", a.meth());
    }

    @Test
    public void testMethodINB() {
        B b = new B();
        Assertions.assertEquals("Method is overridden in Extended class B", b.meth());
    }
}
