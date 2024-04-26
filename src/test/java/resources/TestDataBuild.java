package resources;

import java.util.ArrayList;
import java.util.List;

import POJO.RegistartionSerialization;
import POJO.STATEOBJECT;
import io.restassured.RestAssured;

public class TestDataBuild {
	public  RegistartionSerialization registerPayload(String email, String firstname, String lname)
	{
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
		rs.setFirstname(firstname);
		rs.setLastname(lname);
		rs.setUserType("OfficeEmployee");
		rs.setPhone("(574) 374-3734");
		rs.setAddress1("Test Address 12");
		STATEOBJECT so=new STATEOBJECT();
		so.setName("Colorado"); 
		so.setAbbreviation("CO");
		rs.setStateObj(so);
		rs.setState("CO");
		rs.setCity("City");
	    rs.setEmail(email);
	    rs.setSubmit(true);
	    rs.setZip("35004");
	    rs.setAppId("a4b1f073-fc20-477f-a804-1aa206938c42");
	    rs.setPreferences("{\"timezone\":\"Asia/Calcutta\"}");
		RestAssured.baseURI="https://hubdriveonlinetest.eoxvantage.com:9080";
		
		return rs;
	}

}
