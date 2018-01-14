package space;

import KnownUniverse.BlackHoles;
import KnownUniverse.Galaxy;
import KnownUniverse.Quantum;

public class Main {
	public static void main(String[] args) {
		
		Galaxy bigBang = new Galaxy();
		
		bigBang.start();
		bigBang.collapse();
		
		BlackHoles blasar = new BlackHoles();
		
		blasar.formation();
		blasar.growth();
		blasar.blasar();
		
		Quantum particles = new Quantum();
		
		particles.mechanics();
		
	}

}
