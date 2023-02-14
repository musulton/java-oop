package com.enigma.moba;

public class Player {
    private String name;
    private double health = 100;
    private Weapon weapon;
    private Armor armor;

    public Player(String name){
        this.name = name;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getHealth() {
        return this.health;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack(Player opponent){
        double attackPower = this.weapon.getAttackPower();

        System.out.println(this.name + " attacking " + opponent.getName() + " with power " + attackPower);
        opponent.defence(attackPower);
    }

    public void defence(double attackPower){
        // akan mengambil damage
        double damage;
        double defencePower = this.armor.getDefencePower();
        if (defencePower < attackPower) {
            damage = attackPower - defencePower;
        } else {
            damage = 0;
        }

        this.health -= damage;
        System.out.println(this.name + " gets damage " + damage);
    }

    public void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void equipArmor(Armor armor){
        this.armor = armor;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", weapon=" + weapon +
                ", armor=" + armor +
                '}';
    }
}
