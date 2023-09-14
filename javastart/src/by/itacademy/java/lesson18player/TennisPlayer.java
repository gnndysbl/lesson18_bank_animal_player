package by.itacademy.java.lesson18player;

public class TennisPlayer extends Player {

	
	public TennisPlayer(String name, String sportType) {
		super(name, sportType);
			
	}
	
	public void play() {
		System.out.println("player " + name +  " plays tennis");
	}
	

}
