package constants;

public class Constant {
	
	//Base URL
	public final static String BASE_URL = "https://reqres.in/api/users";
	//Status code constants
	 public final static int SUCCESS_OK = 200;
	 public final static int NO_CONTENT = 204;
	 public final static int CREATED = 201;
	 
	 //content type constants
	 public final static String CONTENT_TYPE_JSON = "application/json";
	 
	 //group names constants
	 public final static String POST_REQUEST = "PostRequest";
	 public final static String GET_REQUEST = "GetRequest";
	 public final static String DELETE_REQUEST = "DeleteRequest";
	 public final static String PUT_REQUEST = "PutRequest";
	 public final static String PATCH_REQUEST = "PatchRequest";
	 
	 //Data provider constants
	 public final static String USER_DATA_PROVIDER = "UserData";
	 
	 //path to files
	 public final static String JSON_OBJECT_FILE = "E:\\JAVA\\APITesting\\JsonObjects\\user.json";
	 public final static String JSON_SCHEMA_FILE ="test\\resources\\usersListSchema.json";
	 
	 //path parameters
	 public final static String PATH_PARAM_ID = "id";
	 public final static String USER_ENDPOINT = "/%s";
	 
	 //Key Constants
	 public final static String NEW_USER_FIRST_NAME = "first_name";
	 public final static String FIRST_NAME = "data.first_name";
	 
	 //Expected values
	 public final static String EXPECTED_FIRST_NAME = "Janet";
}
