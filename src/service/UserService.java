package service;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import constants.Constant;
import io.restassured.RestAssured;
import testBase.BaseURL;
import util.UserData;

public class UserService extends BaseURL {
	
		public UserData CreateTestUser() {		
			ObjectMapper userDataMapper = new ObjectMapper();
	 		File userDataFile = new File(Constant.JSON_OBJECT_FILE);
		 	UserData userData = null;
			try {
				userData = userDataMapper.readValue(userDataFile, UserData.class);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			RestAssured.given().
							contentType(Constant.CONTENT_TYPE_JSON).
							body(userData).
						when().
							post().
						then().
							assertThat().
							statusCode(Constant.CREATED);
			return userData;
		}
}
