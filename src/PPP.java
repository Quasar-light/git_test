import world.Plant;

public class PPP {
	public static void main(String[] args) {
		
		Plant plant = new Plant();
		System.out.println(plant.name);
		
		System.out.println(plant.Id);
		//won't work bc private
		//System.out.println(plant.type);
		
		//won't work---not a subclass or part of package
		//System.out.println(plant.size);
	}

}
