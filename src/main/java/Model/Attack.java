package Model;

import java.util.Random;

public class Attack
{
    private String name;
    private  int averageDamage;
    private  int damage;

    public Attack(String name, int averageDamage)
    {
        this.name = name;
        this.averageDamage = averageDamage;
        calculateDamage();
    }

//      Creates a random for the damage
//      Use every time the player attacks
    public void calculateDamage()
    {
        Random ran = null;
        int min =  3;
        int max = -3;
        //int dmg = ran.nextInt((max - min)+1) +averageDamage;
        int dmg = ran.nextInt(max) + min;


        damage = dmg + averageDamage;
    }

    public int getDamage() {
        return damage;
    }

    public String toString()
    {
        return name;
    }
}
