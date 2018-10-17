package test;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import testBase.BaseURL;
import constants.Constant;

public class GetUsers extends BaseURL {

	@Test (groups = { Constant.GET_REQUEST })
	public void testAllUserDetails()
	{   
		System.out.println(Constant.JSON_SCHEMA_FILE);
		RestAssured.given().
					when().
						get().
					then().
						assertThat().
						statusCode(Constant.SUCCESS_OK).
						contentType(Constant.CONTENT_TYPE_JSON).
						body(matchesJsonSchemaInClasspath(Constant.JSON_SCHEMA_FILE));
	}
}
