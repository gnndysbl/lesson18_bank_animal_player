package by.itacademy.java.lesson18player;

import java.util.Objects;

//Базовый класс: Player с атрибутами name, sportType и методом play().
//Производные классы: FootballPlayer, BasketballPlayer, TennisPlayer.
//Каждый производный класс может переопределить метод play() для отображения сообщений, 
//относящихся к конкретному виду спорта.
//Создавайте объекты для каждого типа игроков и демонстрируйте их игровые действия.

public class Player {

	public  String name;
	public  String sportType;

	public Player(String name, String sportType) {
		this.name = name;
		this.sportType = sportType;
	}
	
	public void play(){
		System.out.println("player " + name +  " plays");
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", sportType=" + sportType + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, sportType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return Objects.equals(name, other.name) && Objects.equals(sportType, other.sportType);
	}

	public  String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public  String getSportType() {
		return sportType;
	}

	public void setSportType(String sportType) {
		this.sportType = sportType;
	}
	

	}


