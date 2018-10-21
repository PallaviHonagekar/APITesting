package test;

import org.testng.annotations.Test;
import util.UserData;
import service.UserService;
import constants.Constant;
import io.restassured.RestAssured;
import testBase.BaseURL;
import org.hamcrest.Matchers;

public class GetSingleUser extends BaseURL{

	@Test (groups = { Constant.GET_REQUEST })
	public void testSingleUserDetails()
	{   
		
		/* UserService userService = new UserService();
		UserData userData = userService.CreateTestUser();
		int id = userData.getId(); */
		
		RestAssured.given().
						pathParam("id",2).
					when().
						get("/{id}").
					then().
						assertThat().
						statusCode(Constant.SUCCESS_OK).
						contentType(Constant.CONTENT_TYPE_JSON).
						body(Constant.FIRST_NAME, Matchers.equalTo(Constant.EXPECTED_FIRST_NAME));
		
	}
}
