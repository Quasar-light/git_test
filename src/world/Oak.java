package world;


public class Oak extends Plant {
	public Oak(){
		//won't work --type is private
		//type = "tree";
		
		//works bc oak is a sub class of plant
		size = "large";
		
		height = 3;
	}

}
