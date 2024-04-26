package stepDefinations;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import POJO.RegistartionSerialization;
import POJO.Responsecheck;
import POJO.STATEOBJECT;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.TestDataBuild;
import resources.Utils;

import static org.junit.Assert.*;

public class StepDefination extends Utils {
	TestDataBuild data=new TestDataBuild();
	ResponseSpecification resspec;
	RequestSpecification req;
	Response res;
	
	@Given("Registration Details with {string} {string} {string}")
	public void registration_details_with(String email, String firstname, String lastname) throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		//Request spec for generic request
		
       resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		//connecting generic variable to request
	 req = given().spec(requestSpecification()).body(data.registerPayload(email,firstname,lastname));
	}
	@When("user calls {string} with {string} http request")
	public void user_calls_with_http_request(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		 res = req.when().post("/register").then().spec(resspec).extract().response();
	}
	@Then("the api call got success with status code {int}")
	public void the_api_call_got_success_with_status_code(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	   assertEquals(res.getStatusCode(),200);
	    
	}
	
	@Then("{string} in response body is {string}")
	public void in_response_body_is(String keyvalue, String Expectedvalue) {
	    // Write code here that turns the phrase above into concrete actions
	   String response = res.asString();
	   JsonPath js=new JsonPath(response);
	   assertEquals(js.get(keyvalue).toString(),Expectedvalue);
	}




}
