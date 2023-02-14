package com.enigma.moba;

/* Access Modifier
Untuk memberi batasan kepada class dan data didalam class

1. default -> membuat data dapat dibaca dan ditulis / edit dari luar class di dalam package yang sama
2. public -> membuat data dapat dibaca dan ditulis / edit dari luar class
3. private -> membuat data tidak dapat di baca dan di tulis dari luar class
4. protected -> membuat data nya dapat diakses oleh class itu sendiri dan turunannya

 */

public class Main{

    public static void main(String[] args) {

        // membuat object player
        Player player1 = new Player("Moskov");
        Player player2 = new Player("Hanabi");

        // membuat object weapon
        Weapon weapon1 = new Weapon("Tombak",15);
        Weapon weapon2 = new Weapon("Kunai",1);

        // membuat object armor
        Armor armor1 = new Armor("Jirah besi",10);
        Armor armor2 = new Armor("Kaos",0);

        // player 1
        player1.equipWeapon(weapon1);
        player1.equipArmor(armor1);
        System.out.println(player1);

        // player 2
        player2.equipWeapon(weapon2);
        player2.equipArmor(armor2);
        System.out.println(player2);

        System.out.println("\nATTACK");
        System.out.println("\nEpisode - 1\n");
        player1.attack(player2);
        System.out.println("health player 2: " + player2.getHealth());

        System.out.println("\nEpisode - 2\n");
        player2.attack(player1);
        System.out.println("health player 1" + player1.getHealth());
    }
}
