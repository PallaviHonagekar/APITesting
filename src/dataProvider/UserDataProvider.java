package dataProvider;

import java.io.File;
import java.io.IOException;
import org.testng.annotations.DataProvider;
import com.fasterxml.jackson.databind.ObjectMapper;

import constants.Constant;
import util.UserData;

public class UserDataProvider {
	@DataProvider(name = Constant.USER_DATA_PROVIDER)
	 public static Object[][] userDetails() {
		 	ObjectMapper userDataMapper = new ObjectMapper();
	 		File userDataFile = new File(Constant.JSON_OBJECT_FILE);
		 	UserData userData = null;
			try {
				userData = userDataMapper.readValue(userDataFile, UserData.class);
			} catch (IOException e) {
				e.printStackTrace();
			}
	        return new Object[][] { { userData } };
	}
}
