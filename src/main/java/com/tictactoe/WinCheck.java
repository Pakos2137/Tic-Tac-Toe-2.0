package com.tictactoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class WinCheck {
    Board board;
    int boardSize;
    public WinCheck(Board board) {
        this.board = board;
    }
    public boolean winCheck3x3() {
        boardSize = board.board.length;
        boolean gameProgress;
        gameProgress = true;
        String line = "";
        ArrayList<String> lines = new ArrayList<>();
        //rows to list
        for(int i = 0;i<boardSize;i++) {
            for (int k = 0;k<boardSize;k++){
                line += board.board[i][k];
            }
            lines.add(line);
            line = "";
        }
        //columns to list
        for(int i = 0;i<boardSize;i++) {
            for (int k = 0;k<boardSize;k++){
                line += board.board[k][i];
            }
            lines.add(line);
            line = "";
        }
        //cross leftTop to rightDown
        for(int i = 0;i<boardSize;i++) {
                line += board.board[i][i];
            }
        lines.add(line);
        line = "";
        //cross rightTop to leftDown
        for(int i = 0;i<boardSize;i++) {
            line += board.board[2-i][i];
        }
        lines.add(line);
        line = "";
        System.out.println(lines);
        //winCheck
        for(int i = 0;i<lines.size();i++)
        {
            if(Objects.equals(lines.get(i), "XXX")) {
                System.out.println("X wygrało");
                gameProgress = false;
            }
            if(Objects.equals(lines.get(i), "OOO")) {
                System.out.println("O wygrało");
                gameProgress = false;
            }
        }
        return gameProgress;
    }
    public boolean winCheck10x10() {
        boolean gameProgress;
        gameProgress = true;
        return gameProgress;
    }
}
