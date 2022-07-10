package RestAssured1;

import org.testng.annotations.Test;

import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
public class Tests_GET {
@Test
void Test_1() {
	given().header("content-type","Application/JSON").param("key", "value")
	     .get("https://reqres.in/api/users?page=2")
	.then()
	    .statusCode(200).log().all()
	    .body("data.id[0]",equalTo(7) )
	    .body( "data.first_name", hasItems("Lindsay","Byron"));
	
	
	
}


}



