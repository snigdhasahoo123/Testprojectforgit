package actions;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Tests_Post_withallassignedvalues {
	
	@Test
	public void create_record() {
		
		
        JSONObject request=new JSONObject();
		
		  //has to create a new job id 
		given()
		.header("Content-Type","application/json")
		.contentType(ContentType.JSON).accept(ContentType.JSON)
		.body(request.toJSONString()).when()
		.post("https://jobs123.herokuapp.com/Jobs?Job Id=1051&Job Company Name=Shakthi&Job Title=SDET71&Job Type=PERMANENT&Job Posted time=15minutes&Job Description=\"ajdhiyfof ofrfo87ryfhfuhfoiurey123\"&Job Location=odisha")
		.then()
		.statusCode(200).log().all();
		
		
		/*request.put("Job Id", "1048");
		request.put("Job Company Name ", "Shakthi");
		request.put("Job Title", "SDET71");
		request.put("Job Type", "PERMANENT");
		request.put("Job Posted time", "15minutes");
		request.put("Job Description", "ajdhiyfof ofrfo87ryfhfuhfoiurey123");
		request.put("Job Location", "Odisha");
		
		System.out.println(request);
		System.out.println(request.toJSONString());*/
		
		
		
		/*Map<String, Object> map= new HashMap<String, Object>();
		map.put("Job Id", "1039");
		map.put("Job Company Name ", "Shakthi");
		map.put("Job Title", "SDET71");
		map.put("Job Type", "PERMANENT");
		map.put("Job Posted time", "15minutes");
		map.put("Job Description", "ajdhiyfof ofrfo87ryfhfuhfoiurey123");
		map.put("Job Location", "Odisha");
		//System.out.println(map);*/
		
		
	}

}
