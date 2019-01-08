package Controller;

import Factory.PokemonFactory;
import Model.Attack;
import Model.Player;

public class Game
{
    //switch player
    //check turn
    //switch turn

    // Client -> Server <- Client
    // Zo kan ik PULL en push(wat niet push heet)

    private Player p1;
    private Player p2;

    private boolean playerTurn; //true = P1 turn

    public Game()
    {
        playerTurn = true;
    }

    public void startGame()
    {
        p1 = new Player("player 1");
        p2 = new Player("player 2");
    }

    public Player getP1() {
        return p1;
    }

    public Player getP2() {
        return p2;
    }

    public void attackP2(Attack attack)
    {
        p2.getSummonedPokemon().gotHit(attack.calculateDamage());
        p2.checkPokemonHealth();
    }

    public void attackP1(Attack attack)
    {
        p1.getSummonedPokemon().gotHit(attack.calculateDamage());
        p1.checkPokemonHealth();
    }
}
