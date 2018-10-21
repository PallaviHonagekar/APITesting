package test;

import org.testng.annotations.Test;
import org.hamcrest.Matchers;
import util.UserData;
import service.UserService;
import constants.Constant;
import io.restassured.RestAssured;
import testBase.BaseURL;

public class UpdateUser extends BaseURL {
	
	@Test(groups = { Constant.PUT_REQUEST })
	public void testUpdateUserDetails()
	{   
		UserService userService = new UserService();
		UserData newUser = userService.CreateTestUser();
		int id = newUser.getId();
		newUser.setFirst_name("venkat");
		newUser.setLast_name("R");
		RestAssured.given().
						pathParam("id", id).
						contentType(Constant.CONTENT_TYPE_JSON).
						body(newUser).
					when().
						put("/{id}").
					then().
						assertThat().
						statusCode(Constant.SUCCESS_OK).body(Constant.NEW_USER_FIRST_NAME, Matchers.equalTo(newUser.getFirst_name()));
	}
}
