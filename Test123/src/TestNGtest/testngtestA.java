package TestNGtest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testngtestA {
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeCLass");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}
	@Test
	public void testA() {
		System.out.println("testA");
		
	}
	@Test
	public void testB() {
		System.out.println("testB");
		
		String actualUrl ="https://www.facebook.com/";
		String exceptedUrl = "https://www.facebook.com/home";
		SoftAssert soft = new SoftAssert();
		
		//1)to compare the data
		//2)create the result
		//3)if actual data is Equale to excepted data then test case is passed
		//4)if actual data is NotEquale to excepted data then test case is Failed
		
		soft.assertEquals(actualUrl,exceptedUrl,"Homepage Url is not found");
		
		//4)if actual data is NotEquale to excepted data then test case is Failed
		soft.assertNotEquals(actualUrl,exceptedUrl,"Homepage Url is not found");
		
		Boolean result =(actualUrl.equals(exceptedUrl));
		
		//if result == true then test case passed
        //if result == false then test case Failed
		soft.assertTrue(result,"Homepage Url is not found");
		
		// if result == true then test case failed
		//if result == false then test case passed
		soft.assertFalse(result,"Homepage Url is not found");
		
		//forcefully  failed the test method
		soft.fail();
		//to apply the result of soft assert on test method
		soft.assertAll();
		
		
	}
	@Test
	public void testC() {
		System.out.println("testC");
		
	}
	@Test
	public void testD() {
		System.out.println("testD");
		
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
		
	}

}



