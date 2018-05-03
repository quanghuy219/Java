package com.company;

public class Main {

    public static void main(String[] args) {
	    Player player = new Player();

	    player.name =  "Huy";
	    player.health = 100;
	    player.weapon = "Gun";

	    int damage = 10;
	    player.loseHealth(damage);
        System.out.println("Remaining health: " + player.healthRemaining());


    }
}
