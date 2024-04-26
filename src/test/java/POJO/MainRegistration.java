package POJO;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;
public class MainRegistration {
	public static void main(String[] args) {
		
		RegistartionSerialization rs=new RegistartionSerialization();
		
		List<String> commands=new ArrayList<String>();
		commands.add("store_cache_data");
		commands.add("sign_in");
		rs.setCommands(commands);
		
		rs.setGeneratelink("true");
		
		List<String> user_management_commands=new ArrayList<String>();
		user_management_commands.add("CreateUserFromLink");
		rs.setUser_management_commands(user_management_commands);
		
		rs.setType("BUSINESS");
		rs.setFormId("dd20f8b2-1aac-11ed-861d-0242ac120002dd20f8b2-1aac-11ed-861d-0242ac120002");
		rs.setAccountName("e91c22e9-c506-4442-9bda-268ab2d786eb");
		rs.setIsUserAnApplicant("{\"isUserAnApplicant\":\"yes\"}");
		rs.setIdentifier_field("email");
		rs.setCountry("United States of America");
		rs.setEntity_name("USER");
		rs.setPostLoginUrl("pipeline");
		rs.setTemplate("NewAccount");
		rs.setExtraAPPByForm("{\"payment\":\"cec14502-3c24-4616-a0dd-5a6bf25fabf4\"}");
		rs.setFirstname("test123");
		rs.setLastname("testlastname");
		rs.setUserType("OfficeEmployee");
		rs.setPhone("(574) 374-3734");
		rs.setAddress1("Test Address 12");
		STATEOBJECT so=new STATEOBJECT();
		so.setName("Colorado"); 
		so.setAbbreviation("CO");
		rs.setStateObj(so);
		rs.setState("CO");
		rs.setCity("City");
	    rs.setEmail("test56@email.com");
	    rs.setSubmit(true);
	    rs.setZip("35004");
	    rs.setAppId("a4b1f073-fc20-477f-a804-1aa206938c42");
	    rs.setPreferences("{\"timezone\":\"Asia/Calcutta\"}");
		RestAssured.baseURI="https://hubdriveonlinetest.eoxvantage.com:9080";
		
		
		//Request spec for generic request
		RequestSpecification reqspec = new RequestSpecBuilder().setBaseUri("https://hubdriveonlinetest.eoxvantage.com:9080").setRelaxedHTTPSValidation().setContentType(ContentType.JSON).build();
		
		//connecting generic variable to request
		RequestSpecification req = given().spec(reqspec).body(rs);
				
		//response store
				Responsecheck res = req.when().post("/register")
.as(Responsecheck.class);
		
		System.out.println(res.getData().getJwt());
	}

}
