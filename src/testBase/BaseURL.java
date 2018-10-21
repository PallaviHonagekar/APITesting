package testBase;

import org.testng.annotations.BeforeSuite;
import constants.Constant;
import io.restassured.RestAssured;

public class BaseURL {
	
	@BeforeSuite(alwaysRun = true)
	public void baseURL()
	{
		RestAssured.baseURI = Constant.BASE_URL;
	}
}
