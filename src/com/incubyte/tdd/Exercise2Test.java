package com.incubyte.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class Exercise2Test {
	
	@Test
	public void addUnknownAmoutofNumbers()
	{
		Exercise2 e=new Exercise2();
		Assert.assertEquals(10, e.add("1,2,3,4"));
	}

}
