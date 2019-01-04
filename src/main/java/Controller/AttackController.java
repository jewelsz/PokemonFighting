package Controller;

import Model.Attack;
import Model.Player;
import Model.Pokemon;

public class AttackController
{

    //TO DO
    //Deal dmg to pokemon
    //check if pokemon is dead
    //if dead, remove from player pokemon list

    public void getAttacked(Attack attack, Player otherplayer)
    {
        Pokemon po = otherplayer.getSummonedPokemon();
        po.takeDamage(attack.getDamage());
        attack.calculateDamage();

        if(!po.isDead())
        {

        }
    }
}
