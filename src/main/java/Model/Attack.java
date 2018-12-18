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
    }

//      Creates a random for the damage
//      Use every time the player attacks
    public int calculateDamage()
    {
        Random ran = null;
        int min = damage - 10;
        int max = damage +10;
        int dmg = ran.nextInt((max - min)+1) +min;

        return dmg;
    }
}
