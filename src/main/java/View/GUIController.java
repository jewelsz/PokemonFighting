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
    Game game = new Game();

    @FXML
    Button btnStartGame;

    @FXML
    Label lblP1Name, lblP2Name, lblSummonedPokemonP1, lblSummonedPokemonP2,
            lblHealthP1, lblHealthP2;

    @FXML
    private ListView listAttacksP1, listAttacksP2, listPokemonP1, listPokemonP2;

    public void startPokemonGame()
    {
        btnStartGame.setVisible(false);
        game.startGame();
        //Set labels and lists Players
        lblP1Name.setText(game.getP1().getName());
        lblP2Name.setText(game.getP2().getName());
        summonPokemonLbl();
        fillAttackList();
        fillPokemonList();
    }

    private  void fillPokemonList()
    {
        listPokemonP1.getItems().clear();
        listPokemonP2.getItems().clear();
        listPokemonP1.getItems().addAll(game.getP1().getAllPokemon());
        listPokemonP2.getItems().addAll(game.getP2().getAllPokemon());
    }
    private void fillAttackList()
    {
        listAttacksP1.getItems().clear();
        listAttacksP2.getItems().clear();
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
        game.getP1().setSummonedPokemon((Pokemon)listPokemonP1.getSelectionModel().getSelectedItem());
        summonPokemonLbl();
        fillAttackList();
    }

    public void switchToSelectedPokemonP2()
    {
        game.getP2().setSummonedPokemon((Pokemon)listPokemonP2.getSelectionModel().getSelectedItem());
        summonPokemonLbl();
        fillAttackList();
    }

    public void p1AttackP2()
    {
        game.attackP2((Attack)listAttacksP1.getSelectionModel().getSelectedItem());
        refreshHealthLabels();
        fillAttackList();
        fillPokemonList();
        summonPokemonLbl();
    }

    public void p2AttackP1()
    {
        game.attackP1((Attack)listAttacksP2.getSelectionModel().getSelectedItem());
        refreshHealthLabels();
        fillAttackList();
        fillPokemonList();
        summonPokemonLbl();
    }

    private void refreshHealthLabels()
    {
        lblHealthP1.setText(String.valueOf(game.getP1().getSummonedPokemon().getHealth()));
        lblHealthP2.setText(String.valueOf(game.getP2().getSummonedPokemon().getHealth()));
    }
}
