package by.itacademy.java.lesson18player;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player player = new Player("Wasilij", "Noname");
		player.play();
		
		FootballPlayer fb = new FootballPlayer("Sergej", "football" );
		fb.play();
		
		TennisPlayer tp = new TennisPlayer("Irina", "tennis");
		tp.play();
		
		BasketballPlayer bp = new BasketballPlayer("Robert", "basketball");
		bp.play();
		
		
	}

}
