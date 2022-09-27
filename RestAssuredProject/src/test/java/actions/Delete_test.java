package actions;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Delete_test {
	@Test
	public void delete() {
		
		JSONObject request=new JSONObject();	
		request.put("Job Id", "1007");
		
		given()
		.header("Content-Type","application/json")
		.contentType(ContentType.JSON).accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.delete("https://jobs123.herokuapp.com/Jobs?Job Id=1007")
		.then()
		.statusCode(200).log().all();
	}

}
