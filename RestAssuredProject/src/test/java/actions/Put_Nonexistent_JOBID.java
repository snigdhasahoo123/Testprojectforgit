package actions;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Put_Nonexistent_JOBID {
	
	@Test
	public void update() {
		
		JSONObject request=new JSONObject();	
		request.put("Job Id", "1099");
		request.put("Job Title", "SDETSR2");
		
		given()
		.header("Content-Type","application/json")
		.contentType(ContentType.JSON).accept(ContentType.JSON)
		.body(request.toJSONString()).when()
		.put("https://jobs123.herokuapp.com/Jobs?Job Id=1004&Job Title=SDETSR2")
		.then()
		.statusCode(404).log().all();
	}

}
