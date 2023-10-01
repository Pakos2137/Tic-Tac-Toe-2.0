package com.tictactoe;

import java.util.Objects;
import java.util.Scanner;

public class MoveProcess {
    String actualMove = "X";
    Board board;
    public MoveProcess(Board board) {
        this.board = board;
    }
    public void fieldNumberInput() {
        board.showBoard();
        System.out.println("Wybierz pole");
        Scanner fieldNumberScan = new Scanner(System.in);
        try {
            int fieldNumber = fieldNumberScan.nextInt();
            fieldEditor(fieldNumber);
        } catch (Exception e) {
            System.out.println("Wybierz liczbę");
        }
    }
    public void fieldEditor(int fieldNumber) {
        int number = fieldNumber;
        for (int i = 0; i < board.board.length; i++) {
            for (int k = 0; k < board.board.length; k++) {
                fieldNumber--;
                if (fieldNumber == 0) {
                    String boardValue = board.board[i][k];
                    if (Objects.equals(String.valueOf(boardValue), String.valueOf(number))) {
                        board.board[i][k] = String.valueOf(actualMove);
                        changeActualMove();
                    } else {
                        System.out.println("To Pole zostało juz wybrane:");
                    }
                }
            }
        }
    }
    private void changeActualMove() {
        if(getActualMove() == "X") {
            setActualMove("O");
        } else {
            setActualMove("X");
        }
    }

    public String getActualMove() {
        return actualMove;
    }

    public void setActualMove(String actualMove) {
        this.actualMove = actualMove;
    }
}
