package world;


public class Field {
	private Plant plant = new Plant();
	
	public Field(){
		//this works bc size is protect and field is in same package as plant
		System.out.println(plant.size);
		System.out.println(plant.height);
		
	}

}
