package com.application.rps;

import java.net.URL;
import java.util.ResourceBundle;

import com.application.rps.gameProcess.Game;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {

    public Controller contr;

    public void setContr(Controller contr) {
        this.contr = contr;
    }

    @FXML
    private Text mainTextArea;

    public void setMainTextArea(String text) {
        mainTextArea.setText(text);
    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button add100Btn;

    @FXML
    private Button add10Btn;

    @FXML
    private Button add50Btn;

    @FXML
    private Text ballansText;

    public void setBallansText(String text) {
        ballansText.setText(text);
    }

    @FXML
    private Text gamesPlayedText;

    public void setgamesPlayedText(String text) {
        gamesPlayedText.setText(text);
    }

    @FXML
    private TextField inputTextArea;

    public void setInputTextArea(String text) {
        inputTextArea.setText(text);
    }

    public String getInputTextArea() {
        return inputTextArea.getText();
    }

    @FXML
    private Button paperBtn;

    @FXML
    private Button playBtn;

    @FXML
    private Button reset;

    @FXML
    private Button scissorsBtn;

    @FXML
    private Button stoneBtn;

    @FXML
    private Text textWin;

    public void setTextWin(String text) {
        textWin.setText(text);
    }

    Game game = new Game();


    @FXML
    void initialize() {
        stoneBtn.setOnAction(event -> {
            game.startgame(0, contr);
        });
        scissorsBtn.setOnAction(event -> {
            game.startgame(1, contr);
        });
        paperBtn.setOnAction(event -> {
            game.startgame(2, contr);
        });
        add10Btn.setOnAction(event -> {
            inputTextArea.setText("10");
        });
        add50Btn.setOnAction(event -> {
            inputTextArea.setText("50");
        });
        add100Btn.setOnAction(event -> {
            inputTextArea.setText("100");
        });
        reset.setOnAction(event -> {
            game.reset();
        });


    }

}
