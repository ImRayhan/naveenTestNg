package myTest_2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest_10 extends BaseTest_7 {

	@Test(priority = 1)
	public void googleTitleTest() {
		String actutalTitle = driver.getTitle();
		System.out.println(actutalTitle);
		Assert.assertEquals(actutalTitle, "Google");
	}

	@Test(priority = 2)
	public void googleURLTest() {
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		Assert.assertTrue(actualURL.contains("google"));
	}

}

