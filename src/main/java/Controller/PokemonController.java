package Controller;

import Model.Player;
import Model.Pokemon;

public class PokemonController
{
    Player player;

    public PokemonController(Player player)
    {
        this.player = player;
    }

    public void switchPokemon(Pokemon pokemon)
    {
        if (pokemon == null)
        {
            player.setSummonedPokemon(player.getAllPokemon().get(0));
        }
        else
        {
            for (Pokemon p : player.getAllPokemon())
            {
                if (p == pokemon)
                {
                    player.setSummonedPokemon(p);
                }
            }
        }

    }

    public void checkPokemonAlive()
    {
        if(player.getSummonedPokemon().isDead())
        {

        }
    }

    public void checkPlayerAlive()
    {
        if(player.getAllPokemon().size() > 0)
        {
            player.setSummonedPokemon(player.getAllPokemon().get(0));
        }
        else
        {
            player.setDefeated(true);
        }
    }


    public void takesDamage(int damage)
    {
        player.getSummonedPokemon().takeDamage(damage);

    }
}
