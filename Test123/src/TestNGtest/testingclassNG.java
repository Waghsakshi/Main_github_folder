package TestNGtest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testingclassNG {
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeCLass -TestClss1");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod-TestClass2");
	}
	@Test
	public void test1() {
		System.out.println("test1-TestClass3");
		String actualUrl ="https://www.facebook.com/";
		String exceptedUrl = "https://www.facebook.com/home";
		
		String actualTitle ="Facebook - log in or sing up ";
		String exceptedTitle = "Facebook - log in or sing up/home";
		
		String actualName= "cancel";
		String exceptedName = "cancel123";
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals( actualUrl,exceptedUrl,"Homepage is not found");
		soft.assertEquals(actualTitle,exceptedTitle,"Home Title is wrong");
        soft.assertEquals(actualName,exceptedName,"Cancel button is wrong");
        soft.assertAll();
       
	}
	@Test(priority =3)
	public void test2() {
		System.out.println("test2-TestClass4");
		
	}
	@Test
	public void test3() {
		System.out.println("test3-TestClass5");
		
	}
	@Test
	public void test4() {
		System.out.println("test4-TestClass6");
		
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod-TestClass7");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass-TestClass8");
		
	}

}
