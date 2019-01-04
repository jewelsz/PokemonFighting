package Model;

import Factory.AttackFactory;

import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Pokemon
{
    private String name;
    private ElementTypeEnum type;
    private int health;
    private ArrayList<Attack> attacks;
    private boolean isDead;

    public Pokemon(String name, ElementTypeEnum type)
    {
        this.name = name;
        this.type = type;
        health = 50;
        isDead = false;
        setAttacks();
    }

    public void gotHit(int damage)
    {
        health = health - damage;
    }

    //Create attacks for pokemon
    private void setAttacks()
    {
        AttackFactory factory = new AttackFactory();
        switch (type)
        {
            case FIRE:
                attacks = factory.createFireAttacks();

            case GRASS:
                attacks = factory.createGrassAttacks();

            case WATER:
                attacks = factory.createWaterAttacks();

            case NORMAL:
                attacks = factory.createNormalAttacks();

            case POISON:
                attacks = factory.createPoisonAttacks();

            case PSYCHIC:
                attacks = factory.createPsychicAttacks();
        }
    }

    public void takeDamage(int damage)
    {
        health = health - damage;
        if(health <= 0)
        {
            isDead = true;
        }

    }

    public String toString()
    {
        return name;
    }

    public ArrayList<Attack> getAttacks()
    {
        return attacks;
    }

    public String getName() {
        return name;
    }

    public ElementTypeEnum getType() {
        return type;
    }

    public int getHealth() {
        return health;
    }

    public boolean isDead() {
        return isDead;
    }
}
