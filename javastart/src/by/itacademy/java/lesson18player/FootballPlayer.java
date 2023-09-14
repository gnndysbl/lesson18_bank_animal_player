package by.itacademy.java.lesson18player;

public class FootballPlayer extends Player {

	
	public FootballPlayer(String name, String sportType) {
		super(name, sportType);
			
	}
	
	public void play() {
		System.out.println("player " + name +  " plays football");
	}
	

}
