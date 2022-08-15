import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.json.simple.JSONObject;

import com.utility.BaseProperty;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class test2sample2 extends BaseProperty {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
	
	//ParseRejection
//	RestAssured.baseURI="http://10.50.76.232:8080/";//parmetrize in feature file
//		JSONObject jsonObject=new JSONObject();
//		jsonObject.put("StsCd", "PARSEREJECTION");
//		jsonObject.put("MsgFctnCd", "INSTRUCTION");
//		jsonObject.put("PrcCd", "OUTGOING");//parameterize
//		System.out.println(jsonObject);
//		Response response = RestAssured.given().header("tenantid","DEMOTENANT")
//				.contentType(ContentType.JSON)
//				.body(jsonObject).post("rest/rest/replay/message");				
//		String body = response.getBody().asString();
//
//		System.out.println(body);
		
//RULE_FAILURE
		
		
//		RestAssured.baseURI="http://10.50.76.232:8080/";
//		JSONObject jsonObjectRule=new JSONObject();
//		jsonObject.put("StsCd", "RULE_FAILURE");//parameterize
//		jsonObject.put("MsgFctnCd", "CustomerCreditTransfer");//parameterize
//		jsonObject.put("PrcCd", "OUTGOING");//parameterize
//		System.out.println(jsonObject);
//		Response responserule = RestAssured.given().header("tenantid","DEMOTENANT")
//				.contentType(ContentType.JSON)
//				.body(jsonObject).post("rest/rest/replay/message");				
//		String bodyrule = response.getBody().asString();
//
//		System.out.println(body);
		// String directory = System.getProperty("user.dir")+"\\Screenshots\\\\"+Hook.scenarioname+".png";
	
		File file = new File("./MessageSamples\\aus_Australia\\autoreplay\\parseRejection\\MT103.dat");

		String content = FileUtils.readFileToString(file, "UTF-8");
	
	
	
	
	
	
	}

}
