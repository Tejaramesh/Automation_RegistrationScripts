package resources;
//enum is special class in java which has collection of constants and methods

public enum APIresources {

	RegisterUser("/register");
    private String resource;
	
	APIresources(String resource) {
			
		this.resource=resource;
	}
	
	public String getResource()
	{
		return resource;
	}

}
