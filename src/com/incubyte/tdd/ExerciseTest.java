package com.incubyte.tdd;

import org.junit.Assert;
import org.junit.Test;

public class ExerciseTest {

	@Test(expected = RuntimeException.class)
    public final void moreThan2numbers() {
		Exercise c=new Exercise();
		c.add("1,2,3");
    }
    @Test
    public final void addwith2numbers() {
    	Exercise c=new Exercise();
		c.add("1,2");
        Assert.assertTrue(true);
    }
    @Test(expected = RuntimeException.class)
    public final void addwithchar() {
    	Exercise c=new Exercise();
		c.add("1,X");
    }
}
