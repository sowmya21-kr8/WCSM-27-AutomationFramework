package vtiger.Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGPracticeTest {
	
	@Test
	public void createUserTest()
	{
		System.out.println("user created"); //executed - fail
	}

	@Test
	public void modifyUserTest()
	{
		System.out.println("user modified"); //should not executed
	}

	
	@Test
	public void deleteUserTest()
	{
		System.out.println("user deleted"); 
	}

}
