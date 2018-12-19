package Controller;

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

    public Game()
    {
        p1 = new Player("player 1");
        p2 = new Player("player 2");
    }

    public void startGame()
    {

    }
}
