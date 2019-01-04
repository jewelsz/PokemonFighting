package Model;

import Controller.AttackController;
import Factory.PokemonFactory;

import java.security.Principal;
import java.util.ArrayList;

public class Player
{
    private AttackController attackController = new AttackController();
    private String name;
    private ArrayList<Pokemon> allPokemon;
    private Pokemon summonedPokemon;
    private boolean isDefeated;
    //private boolean turn;

    public Player(String name)
    {
        this.name = name;
        isDefeated = false;
        allPokemon = new ArrayList<Pokemon>();
        createAllPokemon();
    }

    public void removePokemonFromList(Pokemon pokemon)
    {
        for(Pokemon p : allPokemon)
        {
            if(pokemon == p)
            {
                allPokemon.remove(p);
            }
        }
    }

    public void setDefeated(boolean defeated) {
        isDefeated = defeated;
    }

    private void createAllPokemon()
    {
        PokemonFactory pokemonFactory = new PokemonFactory();
        allPokemon = pokemonFactory.getRandomPokemon();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Pokemon> getAllPokemon() {
        return allPokemon;
    }

    public void setAllPokemon(ArrayList<Pokemon>randomPokemon)
    {
        this.allPokemon = randomPokemon;

    }

    public Pokemon getSummonedPokemon() {
        return summonedPokemon;
    }

    public void setSummonedPokemon(Pokemon summonedPokemon) {
        this.summonedPokemon = summonedPokemon;
    }
}
