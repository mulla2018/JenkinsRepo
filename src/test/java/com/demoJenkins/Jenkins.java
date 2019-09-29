package com.demoJenkins;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Jenkins {
	
	@Test(priority=0)
	public void Test_One(){
		Assert.assertFalse(true, "Assertion Failed");
	}

}
