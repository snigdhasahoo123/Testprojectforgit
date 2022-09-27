package actions;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test_GetAPIS {
	
	@Test
	public void getdetails() {
		Response response=given().when().get("https://jobs123.herokuapp.com/Jobs");
		System.out.println(response.prettyPrint());
		int statuscode=response.getStatusCode();
		Assert.assertEquals(statuscode, 200);
		String contenttype=response.contentType();
		System.out.println("content type is"+contenttype);
	}
 /*@Test
	public void getapis() {
		given()
		.when()
		     .get("https://jobs123.herokuapp.com/Jobs")
		.then()
		      .statusCode(200)
		   .and()
		      .contentType("application/json")
		   .and()
		      .log().all();
		
	}*/

}
