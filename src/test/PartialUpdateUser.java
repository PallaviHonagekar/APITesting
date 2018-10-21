package test;

import org.testng.annotations.Test;
import org.hamcrest.Matchers;
import util.UserData;
import service.UserService;
import constants.Constant;
import io.restassured.RestAssured;
import testBase.BaseURL;

public class PartialUpdateUser extends BaseURL {
	
	@Test(groups = { Constant.PATCH_REQUEST })
	public void testPartialUpdate()
	{   
		UserService userService = new UserService();
		UserData newUser = userService.CreateTestUser();
		int id = newUser.getId();
		newUser.setFirst_name("madhavi");
		RestAssured.given().
						pathParam("id", id).
						contentType(Constant.CONTENT_TYPE_JSON).
						body(newUser).
					when().
						patch("/{id}").
					then().
						assertThat().
						statusCode(Constant.SUCCESS_OK).body(Constant.NEW_USER_FIRST_NAME, Matchers.equalTo(newUser.getFirst_name()));
	}
}
