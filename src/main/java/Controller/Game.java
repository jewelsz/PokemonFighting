package Controller;

import Factory.PokemonFactory;
import Model.Attack;
import Model.Player;

public class Game
{
    public AttackController attackController = new AttackController();
    public PokemonController pokemonControllerP1;
    public PokemonController pokemonControllerP2;
    //switch player
    //check turn
    //switch turn

    // Client -> Server <- Client
    // Zo kan ik PULL en push(wat niet push heet)

    private Player p1;
    private Player p2;


    public Game()
    {
        p1 = new Player("player 1");
        p2 = new Player("player 2");
        pokemonControllerP1 = new PokemonController(p1);
        pokemonControllerP2 = new PokemonController(p2);
    }

    private void createAllPokemon()
    {
        PokemonFactory pokemonFactory = new PokemonFactory();
        p1.setAllPokemon(pokemonFactory.getRandomPokemon());
        p1.setAllPokemon(pokemonFactory.getRandomPokemon());
    }
    public void startGame()
    {
        createAllPokemon();
    }

    public void playerAttacks(Attack attack)
    {

    }

    public Player getP1() {
        return p1;
    }

    public Player getP2() {
        return p2;
    }
}
