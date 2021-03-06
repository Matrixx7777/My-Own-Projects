package com.my.test.java.first;

import com.my.test.java.task.first.Fibonacci;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FibonacciTest {

    @Test
    public void testInputEqualsZero() {
        //given
        Fibonacci fib = new Fibonacci();

        //when
        int result = fib.fibonacci(0);

        //then
        Assert.assertEquals(0, result);
    }

    @Test
    public void testInputEqualsOne() {
        //given
        Fibonacci fib = new Fibonacci();

        //when
        int result = fib.fibonacci(1);

        //then
        Assert.assertEquals(1, result);
    }

    @Test
    public void testInputEqualsTwo() {
        //given
        Fibonacci fib = new Fibonacci();

        //when
        int result = fib.fibonacci(2);

        //then
        Assert.assertEquals(1, result);
    }

    @Test
    public void testInputEqualsThree() {
        //given
        Fibonacci fib = new Fibonacci();

        //when
        int result = fib.fibonacci(3);

        //then
        Assert.assertEquals(2, result);
    }

    @Test
    public void testInputEqualsNine() {
        //given
        Fibonacci fib = new Fibonacci();

        //when
        int result = fib.fibonacci(9);

        //then
        Assert.assertEquals(34, result);
    }
}