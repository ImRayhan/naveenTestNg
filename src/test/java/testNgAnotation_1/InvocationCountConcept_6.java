package testNgAnotation_1;

import org.testng.annotations.Test;

public class InvocationCountConcept_6 {
	
	
	@Test(invocationCount = 10)
	public void searchProductTest() {
		System.out.println("searchProductTest");
	}
	
	
	

}
