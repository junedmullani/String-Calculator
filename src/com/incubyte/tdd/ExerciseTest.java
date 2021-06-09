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
        Assert.assertEquals(3, c.add("1,2"));
    }
    @Test(expected = RuntimeException.class)
    public final void addwithchar() {
    	Exercise c=new Exercise();
		c.add("1,X");
    }
    @Test
    public final void emptyString() {
    	Exercise c=new Exercise();
        Assert.assertEquals(0, c.add(""));
    }
}
