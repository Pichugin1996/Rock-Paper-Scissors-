package com.application.rps.gameProcess;


import com.application.rps.Controller;

import java.util.Arrays;


public class Game{
    private int ballance = 500;
    private int gamePlayed;
    private int playerSelect;
    private int iiSelect;
    private boolean isWin = false;
    private final String[] itemText = new String[] {"Камень", "Ножницы", "Бумага", "Выйграл!!!", "Проиграл", "Ничья!"};
    private Controller controller;

    @Override
    public String toString() {
        return "Game{" +
                "ballance=" + ballance +
                ", gamePlayed=" + gamePlayed +
                ", playerSelect=" + playerSelect +
                ", iiSelect=" + iiSelect +
                ", isWin=" + isWin +
                ", controller=" + controller +
                '}';
    }

    public void startgame(int playerSelect, Controller controller) {

        this.playerSelect = playerSelect;
        iiSelect = (int) (Math.random() * 3);
        this.controller = controller;
        gamePlayed++;

        switch (playerSelect) {
            case 0:
                switch (iiSelect) {
                    case 0:
                        break;
                    case 1:
                        isWin = true;
                        break;
                    case 2:
                        break;
                }
                break;
            case 1:
                switch (iiSelect) {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        isWin = true;
                        break;
                }
                break;
            case 2:
                switch (iiSelect) {
                    case 0:
                        isWin = true;
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                }
                break;
        }

        setText();

        controller.setgamesPlayedText("Сыгранно игр: " + String.valueOf(gamePlayed));

        System.out.println(toString());

        isWin = false;
    }

    private void setBallance() {
        String newBallance = "";
        String bet = controller.getInputTextArea();
        if (bet == "")
            bet = "0";
        System.out.println("!");

        System.out.println(ballance);

        if (isWin){
            newBallance = String.valueOf(ballance + Integer.valueOf(bet));
        } else {
            newBallance = String.valueOf(ballance - Integer.valueOf(bet));
        }
        controller.setBallansText("Ваш баланс: " + newBallance);
        this.ballance = Integer.parseInt(newBallance);

    }

    private void setText(){
        controller.setMainTextArea("Компьютер выбрал " + itemText[iiSelect] + ". Ты выбрал " + itemText[playerSelect] + ".");
        if (isWin) {
            controller.setTextWin("Ты выйграл!");
        }
        else {
            controller.setTextWin("Ты проиграл!");
        }

        setBallance();
        controller.setInputTextArea("");
    }

    public void reset(){
        this.ballance = 500;
        this.gamePlayed = 0;
        controller.setMainTextArea("Для старта нажмите на предмет!");
        controller.setTextWin("СБРОС");
        controller.setInputTextArea("");
        controller.setBallansText("Ваш баланс: 500");
        controller.setgamesPlayedText("Сыгранно игр: 0");

    }

}
