package com.sdet;

import org.testng.Assert;
import org.testng.annotations.*;

public class AppTest {
	
	@Test
	public void testLogin1() {
		App ap=new App();
		Assert.assertEquals(0, ap.userLogin("charu", "charudinesh"));
	}
	
	@Test
	public void testLogin2() {
		App ap=new App();
		Assert.assertEquals(1, ap.userLogin("charupatil333@gmail.com", "CharuDinesh2710"));
	}

}
