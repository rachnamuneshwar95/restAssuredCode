package RestAssured1;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


public class Tests_POST {
// @Test
 public void Test_01_Post() {
	
	Map<String, Object> map= new HashMap<String, Object>();
    //map.put("\"name\"", "Rachna");
	//map.put("job", "automation tester");
	//System.out.println(map);
	
	JSONObject js = new 	JSONObject();
	js.put("name", "rachna");
	js.put("job", "automation tester2");
	System.out.println(js);
	System.out.println(js.toJSONString());
	
	given().
	header("content-type","Application/JSON").
	contentType(ContentType.JSON).
	accept(ContentType.JSON).
	body(js.toJSONString()).
	when().
	post("https://reqres.in/api/users").
	then().
	statusCode(201);
	
	
}
 
	// @Test
	  public void Test_01_PUT() {
	 	
	 	
	 	
	 	JSONObject js = new 	JSONObject();
	 	js.put("name", "rachna");
	 	js.put("job", "automation tester2");
	 	System.out.println(js);
	 	System.out.println(js.toJSONString());
	 	
	 	given().
	 	header("content-type","Application/JSON").
	 	contentType(ContentType.JSON).
	 	accept(ContentType.JSON).
	 	body(js.toJSONString()).
	 	when().
	 	put("https://reqres.in/api/users/2").
	 	then().
	 	statusCode(200).log().all();
	 	
	 	
	 }
	 
 
	// @Test
	  public void Test_01_Patch() {
	 	
	 	
	 	
	 	JSONObject js = new 	JSONObject();
	 	js.put("name", "rachna");
	 	js.put("job", "automation tester2");
	 	System.out.println(js);
	 	System.out.println(js.toJSONString());
	 	
	 	given().
	 	header("content-type","Application/JSON").
	 	contentType(ContentType.JSON).
	 	accept(ContentType.JSON).
	 	body(js.toJSONString()).
	 	when().
	 	patch("https://reqres.in/api/users/2").
	 	then().
	 	statusCode(200).log().all();
	 	
	 	
	 }
	 
		 @Test
		  public void Test_01_delete() {
		 	
		    when().
		 	delete("https://reqres.in/api/users/2").
		 	then().
		 	statusCode(204).log().all();
		 	
		 	
		 }
		 }



