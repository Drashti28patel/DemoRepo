package tests.MavenPracticeProject;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3 {
	
	SoftAssert softAssert = new SoftAssert();					//
	
  @Test (priority = 1,groups ={"sanity","smoke"})	//creating new user test@test.com
  public void createUser() {
	  System.out.println("I'm in a home test");
	  System.out.println("Before assertion");
	  Assert.assertTrue(4>3,"Verifying Element");				//hard assert: this will fail the test right there
	  System.out.println("After assertion");
	  Assert.assertEquals("abc", "abc1");
  }
  
  @Test	(priority = 2,dependsOnMethods = "createUser", groups ={"sanity","smoke"})		//edit user = test@test.com - dependsOnMethod will skip rather than failing the test.
  public void editUser() {
	  System.out.println("Before assertion");
	  softAssert.assertTrue(2>3,"Verifying Element");			// this will fail but continue to run the test and softAssert.assertAll() will collect all errors and display it 
	  System.out.println("After assertion");
	  softAssert.assertAll();									// similar to errorCollector in JUnit
  }
  
  @Test (priority = 3,dependsOnMethods = "editUser")		//delete user - test@test.com
  public void deleteUser() {
	  System.out.println("I'm in end test");
	  System.out.println("Before assertion");
	  softAssert.assertTrue(2>3,"Verifying Element1");
	  System.out.println("After assertion");
	  softAssert.assertEquals("abc","abc1");
	  System.out.println("After second assertion");
	  softAssert.assertAll();
  }
}
