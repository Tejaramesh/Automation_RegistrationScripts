package resources;

import java.util.ArrayList;
import java.util.List;

import POJO.RegistartionSerialization;
import POJO.STATEOBJECT;
import POJO.ATruck.Registrationlist;
import POJO.ATruck.StateObject;
import POJO.Baier.Registrationlistbaier;
import POJO.Baier.Stateobjectba;
import POJO.Rison.Registrationlistrison;
import POJO.Rison.STATEOBJ;
import io.restassured.RestAssured;

public class TestDataBuild  {
	
	//RTTI Registration details
	
	public  RegistartionSerialization registerPayload(String email, String firstname, String lname, String formId, String userType)
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
		rs.setFormId(formId);
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
		rs.setUserType(userType);
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




public Registrationlist aTruckpayload(String email, String firstname, String lastname, String formId, String userType)
{
	Registrationlist at=new Registrationlist();
	
	List<String> co=new ArrayList<String>();
	co.add("store_cache_data");
	co.add("sign_in");
	at.setCommands(co);
	
	at.setGeneratelink("true");
	
	List<String> umc=new ArrayList<String>();
	umc.add("CreateUserFromLink");
	at.setUser_management_commands(umc);
	
	at.setType("BUSINESS");
	
	at.setBusinessRole("Independent Contractor");
	at.setFormId("fb1a5abd-0b5a-459c-b823-ea816459b940");
	at.setAccountName("2e06031f-104b-4db6-ba45-8a945bfa0f95");
	at.setIsUserAnApplicant("{\"isUserAnApplicant\":\"yes\"}");
	at.setIdentifier_field("email");
	at.setSellerAccountName("2e06031f-104b-4db6-ba45-8a945bfa0f95");
	at.setBusinessRole("Independent Contractor");
	at.setFirstname("test");
	at.setEntity_name("USER");
	at.setRegiondelegate("ClientSpecificUserType");
    at.setPostLoginUrl("pipeline");
    at.setTemplate("NewAccount");
    at.setExtraAPPByForm("{\"payment\":\"cec14502-3c24-4616-a0dd-5a6bf25fabf4\"}");
    
    List<String> ro=new ArrayList<String>();
    ro.add("Manage Insured");
    
    at.setREGISTRATION_EMAIL_SEND("false");
    at.setUserkey("Welcome2HDOL!");
    at.setFirstname(firstname);
    at.setLastname(lastname);
    at.setUserName(firstname+" "+lastname);
    at.setUserType(userType);
    at.setEmail(email);
    at.setEmail2(email);
    at.setPhone("(987) 656-7876");
    at.setAddress1("#123 abc test");
    at.setCity("testcity");
    
    StateObject so1=new StateObject();
    so1.setName("Arkansas");
    so1.setAbbreviation("AR");
   at.setStateObj(so1);
   
   at.setState("AR");
   at.setZip(22323);
   at.setRegister(true);
   at.setAppId("a4b1f073-fc20-477f-a804-1aa206938c42");
   at.setPreferences("{\"timezone\":\"Asia/Calcutta\"}");
	
	return at;
	
}



public Registrationlistrison risonpayload(String email, String firstname, String lastname, String formId, String userType)
{
	Registrationlistrison rrl=new Registrationlistrison();
	List<String> commands=new ArrayList<String>();
	commands.add("store_cache_data");
	commands.add("sign_in");
	rrl.setCommands(commands);
	
	rrl.setGeneratelink("true");
	List<String>  umc=new ArrayList<String>();
	umc.add("CreateUserFromLink");
	rrl.setUser_management_commands(umc);
	
	rrl.setType("BUSINESS");
	rrl.setFormId(formId);
	rrl.setAccountName("a41244ed-91e8-4ff8-a044-82d1aa5ac48b");
	rrl.setIsUserAnApplicant("{\"isUserAnApplicant\":\"yes\"}");
	rrl.setIdentifier_field("email");
	rrl.setCountry("United States of America");
	rrl.setName(firstname);
	rrl.setEntity_name("USER");
	rrl.setTemplate("pipeline");
	rrl.setTemplate("NewAccount");
	rrl.setExtraAPPByForm("{\"payment\":\"cec14502-3c24-4616-a0dd-5a6bf25fabf4\"}");
	rrl.setFirstname(firstname);
	rrl.setiCFirstName(firstname);
	rrl.setLastname(lastname);
	rrl.setUserType("DotDriver");
	rrl.setIcLastName(lastname);
	rrl.setEmail(email);
	rrl.setEmail2(email);
	rrl.setPhone("(876) 567-8876");
	rrl.setAddress1("#123 abc test");
	rrl.setCity("cleveland");
	rrl.setCity1IC("cleveland");
	
	
	STATEOBJ soj=new STATEOBJ();
	soj.setName("Ohio");
	soj.setAbbreviation("OH");
	rrl.setStateObj(soj);
	
	rrl.setState("OH");
	rrl.setZip(23233);
	rrl.setZipCode1IC(23233);
    rrl.setiCEmail(email);
    rrl.setSubmit(true);
    rrl.setAppId("a4b1f073-fc20-477f-a804-1aa206938c42");
    rrl.setPreferences("{\"timezone\":\"Asia/Calcutta\"}");
    	
	return rrl;	
	
}



public Registrationlistbaier baierPayload(String email, String firstname, String lastname, String formId, String userType)
{
	Registrationlistbaier bpl=new Registrationlistbaier();
	
	List<String> cmd=new ArrayList<String>();
	cmd.add("store_cache_data");
	cmd.add("sign_in");
	bpl.setCommands(cmd);
	
	bpl.setGeneratelink("true");
	
	List<String> umc=new ArrayList<String>();
	umc.add("CreateUserFromLink");
    bpl.setUser_management_commands(umc);
    
    
bpl.setType("BUSINESS");
bpl.setFormId(formId);
bpl.setAccountName("d0d9ed1d-20a3-4131-8d4f-f360560180c5");
bpl.setIsUserAnApplicant("{\"isUserAnApplicant\":\"yes\"}");
bpl.setIdentifier_field("email");
bpl.setCountry("United States of America");
bpl.setName("gvfd grfed");
bpl.setEntity_name("USER");
bpl.setPostLoginUrl("pipeline");
bpl.setTemplate("NewAccount");
bpl.setExtraAPPByForm("{\"payment\":\"cec14502-3c24-4616-a0dd-5a6bf25fabf4\"}");
bpl.setFirstname(firstname);
bpl.setiCFirstName(firstname);
bpl.setLastname(lastname);
bpl.setUserType(userType);
bpl.setIcLastName(lastname);
bpl.setEmail(email);
bpl.setEmail(email);
bpl.setPhone("(876) 543-4567");
bpl.setAddress1("vgbh");
bpl.setCity("gvb");
bpl.setCity1IC("gvb");

Stateobjectba so1=new Stateobjectba();
so1.setName("Ohio");
so1.setAbbreviation("OH");
bpl.setStateObj(so1);

bpl.setState("AK");
bpl.setZip(23333);
bpl.setZipCode1IC(23333);
bpl.setiCEmail(email);
bpl.setSubmit(true);
bpl.setAppId("a4b1f073-fc20-477f-a804-1aa206938c42");
bpl.setPreferences("{\"timezone\":\"Asia/Calcutta\"}");


return bpl;
	
}


























}
