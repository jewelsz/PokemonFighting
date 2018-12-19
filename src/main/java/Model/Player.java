package Model;

import java.security.Principal;
import java.util.ArrayList;

public class Player
{
    private String name;
    private ArrayList<Pokemon> allPokemon;
    private Pokemon summonedPokemon;
    private int pokemonAlive;
    private boolean isDefeated;
    private boolean turn;

    public Player(String name)
    {
        this.name = name;
        pokemonAlive = 6;
        isDefeated = false;
        allPokemon = new ArrayList<Pokemon>();
    }

    public void switchPokemon(String name)
    {
        for(Pokemon p : allPokemon)
        {
            if(p.getName() == name)
            {
                summonedPokemon = p;
            }
        }

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

    public void setAllPokemon(ArrayList<Pokemon> allPokemon) {
        this.allPokemon = allPokemon;
    }

    public Pokemon getSummonedPokemon() {
        return summonedPokemon;
    }

    public void setSummonedPokemon(Pokemon summonedPokemon) {
        this.summonedPokemon = summonedPokemon;
    }

    public int getPokemonAlive() {
        return pokemonAlive;
    }

    public void setPokemonAlive(int pokemonAlive) {
        this.pokemonAlive = pokemonAlive;
    }

    public boolean isDefeated() {
        return isDefeated;
    }

    public void setDefeated(boolean defeated) {
        isDefeated = defeated;
    }
}
