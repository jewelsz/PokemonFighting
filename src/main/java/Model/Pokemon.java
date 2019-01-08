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
    private Boolean isDead;

    public Pokemon(String name, ElementTypeEnum type)
    {
        isDead = false;
        this.name = name;
        this.type = type;
        health = 50;
        setAttacks();
    }

    public void gotHit(int damage)
    {
        health = health - damage;
        if(health <= 0)
        {
            isDead = true;
        }
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

    public Boolean getDead() {
        return isDead;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(ElementTypeEnum type) {
        this.type = type;
    }

    public void setHealth(int health) {
        this.health = health;
    }


}
