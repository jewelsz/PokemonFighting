package Factory;

import Model.Pokemon;
import Model.ElementTypeEnum;

import java.util.ArrayList;

public class PokemonFactory
{
    private ArrayList<Pokemon> createdPokemon;

    public PokemonFactory()
    {
        createdPokemon = new ArrayList<Pokemon>();
    }

    public ArrayList<Pokemon> createPokemon()
    {
        //Create pokemon and add to the list
        createdPokemon.add(new Pokemon("Psyduck", ElementTypeEnum.WATER));
        createdPokemon.add(new Pokemon("Squirtle", ElementTypeEnum.WATER));
        createdPokemon.add(new Pokemon("Goldeen", ElementTypeEnum.WATER));
        createdPokemon.add(new Pokemon("Charmander", ElementTypeEnum.FIRE));
        createdPokemon.add(new Pokemon("Vulpix", ElementTypeEnum.FIRE));
        createdPokemon.add(new Pokemon("Vulpix", ElementTypeEnum.FIRE));
        createdPokemon.add(new Pokemon("Tangela", ElementTypeEnum.GRASS));
        createdPokemon.add(new Pokemon("Ivysaur", ElementTypeEnum.GRASS));
        createdPokemon.add(new Pokemon("Exeggutor", ElementTypeEnum.GRASS));
        createdPokemon.add(new Pokemon("Meowth", ElementTypeEnum.NORMAL));
        createdPokemon.add(new Pokemon("Lickitung", ElementTypeEnum.NORMAL));
        createdPokemon.add(new Pokemon("Jigglypuff", ElementTypeEnum.NORMAL));
        createdPokemon.add(new Pokemon("Abra", ElementTypeEnum.PSYCHIC));
        createdPokemon.add(new Pokemon("Mr. Mime", ElementTypeEnum.PSYCHIC));
        createdPokemon.add(new Pokemon("Hypno", ElementTypeEnum.PSYCHIC));
        createdPokemon.add(new Pokemon("Gengar", ElementTypeEnum.POISON));
        createdPokemon.add(new Pokemon("Ekans", ElementTypeEnum.POISON));
        createdPokemon.add(new Pokemon("Muk", ElementTypeEnum.POISON));


        return createdPokemon;
    }
}
