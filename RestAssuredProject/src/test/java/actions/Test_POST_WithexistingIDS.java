package actions;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test_POST_WithexistingIDS {
	@Test
	public void createreccord() {
		JSONObject request = new JSONObject();
		request.put("Job Id", "1039");
		request.put("Job Company Name ", "Shakthi");
		request.put("Job Title", "SDET71");
		request.put("Job Type", "PERMANENT");
		request.put("Job Posted time", "15minutes");
		request.put("Job Description", "ajdhiyfof ofrfo87ryfhfuhfoiurey123");
		request.put("Job Location", "Odisha");

		System.out.println(request);
		System.out.println(request.toJSONString());

		given().header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
				.body(request.toJSONString()).when()
				.post("https://jobs123.herokuapp.com/Jobs?Job Id=1039&Job Company Name=Shakthi&Job Title=SDET71&Job Type=PERMANENT&Job Posted time=15minutes&Job Description=\"ajdhiyfof ofrfo87ryfhfuhfoiurey123\"&Job Location=odisha")
				.then().statusCode(409).log().all();
	}

}
