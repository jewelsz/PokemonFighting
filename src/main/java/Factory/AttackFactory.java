package Factory;

import Model.Attack;

import java.util.ArrayList;

public class AttackFactory
{
    public ArrayList<Attack> createFireAttacks()
    {
        ArrayList<Attack>fireAttacks = new ArrayList<Attack>();
        fireAttacks.add(new Attack("Fire Blast", 5));
        fireAttacks.add(new Attack("Ember", 3));
        fireAttacks.add(new Attack("Inferno", 3));
        fireAttacks.add(new Attack("Magma Storm", 4));

        return fireAttacks;
    }
    public ArrayList<Attack> createWaterAttacks()
    {
        ArrayList<Attack>waterAttacks = new ArrayList<Attack>();
        waterAttacks.add(new Attack("Bubble", 3));
        waterAttacks.add(new Attack("Hydro Pump", 3));
        waterAttacks.add(new Attack("Surf", 4));
        waterAttacks.add(new Attack("Water Gun", 5));

        return waterAttacks;
    }
    public ArrayList<Attack> createGrassAttacks()
    {
        ArrayList<Attack>grassAttacks = new ArrayList<Attack>();
        grassAttacks.add(new Attack("Bullet Seed", 3));
        grassAttacks.add(new Attack("Leaf Storm", 3));
        grassAttacks.add(new Attack("Razor Leaf", 4));
        grassAttacks.add(new Attack("Solar Beam", 5));

        return grassAttacks;
    }
    public ArrayList<Attack> createNormalAttacks()
    {
        ArrayList<Attack>normalAttacks = new ArrayList<Attack>();
        normalAttacks.add(new Attack("Boom Burst", 3));
        normalAttacks.add(new Attack("Body Slam", 3));
        normalAttacks.add(new Attack("Crush Claw", 4));
        normalAttacks.add(new Attack("Comet Punch", 5));

        return normalAttacks;
    }
    public ArrayList<Attack> createPsychicAttacks()
    {
        ArrayList<Attack>psychicAttacks = new ArrayList<Attack>();
        psychicAttacks.add(new Attack("Dream Eater", 3));
        psychicAttacks.add(new Attack("Psyshock", 3));
        psychicAttacks.add(new Attack("Psybeam", 4));
        psychicAttacks.add(new Attack("Cosmic Power", 5));

        return psychicAttacks;
    }
    public ArrayList<Attack> createPoisonAttacks()
    {
        ArrayList<Attack>poisonAttacks = new ArrayList<Attack>();
        poisonAttacks.add(new Attack("Toxic", 3));
        poisonAttacks.add(new Attack("Acid", 3));
        poisonAttacks.add(new Attack("Venoshock", 4));
        poisonAttacks.add(new Attack("Sludge Bomb", 5));

        return poisonAttacks;
    }
}
