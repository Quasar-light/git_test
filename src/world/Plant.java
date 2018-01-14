package world;

public class Plant {
	//bad pratice, this stuff would usually be encapsulated
	public String name;
	
	/* normally if are using public then u'd make static and final so that it can't be changed */
	//acceptable practice ---as long as its final
	public final static int Id = 8;
	
	private String type;
	
	protected String size;
	
	int height;
	
	public Plant(){
		name ="Freddy ";
		//don't have to use this, its redundant here, same for name variable
		this.type = "Plant";
		
		size = "medium";
		
		height = 4;
		
	}
	
	

}
