package com.incubyte.tdd;

import org.junit.Assert;
import org.junit.Test;

public class Exercise3Test {
	
	@Test
	public void addWithDiffDelimiter()
	{
		Exercise3 e=new Exercise3();
		Assert.assertEquals(6, e.add("1\n2,3"));
	}
	@Test(expected = RuntimeException.class )
	public void addWithWrongInput() {
		Exercise3 e=new Exercise3();
		e.add("1\n,");
	}

}
