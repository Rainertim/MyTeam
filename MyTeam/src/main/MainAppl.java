package main;

import pkgData.Player;

public class MainAppl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player = new Player(2, "Dragovic", "Defense");
		System.out.println("== " + player);
		player = new Player(3, "John", "Lemmon");
		System.out.println("=== " + player);
		
		player = new Player(10, "Björn", "Kuhl");
		System.out.println("=== " + player);
	}

}
