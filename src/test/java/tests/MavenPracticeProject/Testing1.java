package tests.MavenPracticeProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Testing1 {
  @Test(dataProvider = "dp")				// by adding dataprovider parameter it will get data from @DataProvider
  public void f(Integer n, String s) {
	  System.out.println(n+s);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }

  @DataProvider								//when we want to run the perticular test using provided data call it in @Test. Can be added as many as data wanted.
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass								//
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("AfterSuite");
  }
  @Test (groups ="sanity")
  public void test1() {
	  System.out.println("Test1");
  }
  
  @Test
  public void test2() {
	  System.out.println("Test2");
  }
  
  @Test
  public void test3() {
	  System.out.println("Test3");
  }
}