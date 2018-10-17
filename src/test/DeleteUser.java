package test;

import org.testng.annotations.Test;
import util.UserData;
import service.UserService;
import constants.Constant;
import io.restassured.RestAssured;
import testBase.BaseURL;

public class DeleteUser extends BaseURL {

	@Test (groups = { Constant.DELETE_REQUEST })
	public void testDeleteUser()
	{   
		/* UserService userService = new UserService();
		UserData userData = userService.CreateTestUser();
		int id = userData.getId(); */
		//String.format("user/%s", "2");
		RestAssured.given().
						pathParam("id", 2).
					when().
						delete("/{id}").
					then().
						assertThat().
						statusCode(Constant.NO_CONTENT);
	}
}
