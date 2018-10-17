package test;

import org.testng.annotations.Test;
import testBase.BaseURL;
import util.UserData;
import constants.Constant;
import dataProvider.UserDataProvider;
import io.restassured.RestAssured;
import static org.hamcrest.Matchers.equalTo;

public class CreateUser extends BaseURL{
	
	@Test(dataProvider = Constant.USER_DATA_PROVIDER , dataProviderClass = UserDataProvider.class, groups = { Constant.POST_REQUEST })
	public void testAddUser(UserData userData)
	{    
	    RestAssured.given().
						contentType(Constant.CONTENT_TYPE_JSON).
						body(userData).
					when().
						post().
					then().
						assertThat().
						statusCode(Constant.CREATED).body(Constant.NEW_USER_FIRST_NAME, equalTo(userData.getFirst_name()));
	    			
	}
}
