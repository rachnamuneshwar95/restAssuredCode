package RestAssured1;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class TestRA_1 {
@Test
void Test_01() {
	Response responce=get("https://reqres.in/api/users?page=2");
	System.out.println(responce.asString());
	System.out.println(responce.getBody());
	System.out.println(responce.getStatusCode());
	System.out.println(responce.getStatusLine());
	System.out.println(responce.getHeader("content-type"));
	System.out.println(responce.getTime());
	
	int statusCode = responce.getStatusCode();
	Assert.assertEquals(statusCode, 200);
}
@Test
void test_02() {
	given().get("https://reqres.in/api/users?page=2").then().statusCode(200);
}
}
