package edu.cscc;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareAndCountTest {

    @Test
    public void square() {
        SquareAndCount testerObj = new SquareAndCount();
        int result = testerObj.square(19);
        Assert.assertEquals(result,361);
    }

    @Test
    public void countA() {
        SquareAndCount testerObj = new SquareAndCount();
        int result = testerObj.countA("abaracadabara");
        Assert.assertEquals(result,7);
    }
}