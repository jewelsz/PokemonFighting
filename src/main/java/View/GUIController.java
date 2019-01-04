package View;

import Controller.Game;
import Model.Attack;
import Model.Pokemon;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;


public class GUIController
{
    Game game;

    @FXML
    Button btnStartGame;

    @FXML
    Label lblP1Name, lblP2Name, lblSummonedPokemonP1, lblSummonedPokemonP2,
            lblHealthP1, lblHealthP2;

    @FXML
    private ListView listAttacksP1, listAttacksP2, listPokemonP1, listPokemonP2;

    public void startPokemonGame()
    {
        game = new Game();
        btnStartGame.setVisible(false);

        //Set labels and lists Players
        lblP1Name.setText(game.getP1().getName());
        lblP2Name.setText(game.getP2().getName());
        summonPokemonLbl();
        fillAttackList();
        fillPokemonList();
    }

    private  void fillPokemonList()
    {
        listPokemonP1.getItems().addAll(game.getP1().getAllPokemon());
        listPokemonP2.getItems().addAll(game.getP2().getAllPokemon());
    }
    private void fillAttackList()
    {
        listAttacksP1.getItems().addAll(game.getP1().getSummonedPokemon().getAttacks());
        listAttacksP2.getItems().addAll(game.getP2().getSummonedPokemon().getAttacks());
    }

    private void summonPokemonLbl()
    {
        //Pokemon name
        lblSummonedPokemonP1.setText(game.getP1().getSummonedPokemon().getName());
        lblSummonedPokemonP2.setText(game.getP2().getSummonedPokemon().getName());
        //Pokemon health
        lblHealthP1.setText(String.valueOf(game.getP1().getSummonedPokemon().getHealth()));
        lblHealthP2.setText(String.valueOf(game.getP2().getSummonedPokemon().getHealth()));
    }

    public void switchToSelectedPokemonP1()
    {
        game.pokemonControllerP1.switchPokemon((Pokemon)listPokemonP1.getSelectionModel().getSelectedItem());
        summonPokemonLbl();
    }

    public void switchToSelectedPokemonP2()
    {
        game.pokemonControllerP2.switchPokemon((Pokemon)listPokemonP2.getSelectionModel().getSelectedItem());
        summonPokemonLbl();
    }

    public void P1AttackP2()
    {

    }
}
