package by.itacademy.java.lesson18player;

public class BasketballPlayer extends Player {

	public BasketballPlayer(String name, String sportType) {
		super(name, sportType);
	}

	public void play() {
		System.out.println("player " + name + " plays basketball");
	}

}
