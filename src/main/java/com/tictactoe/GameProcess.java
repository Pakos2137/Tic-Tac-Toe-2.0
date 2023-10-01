package com.tictactoe;

public class GameProcess {
    Board board;
    Settings settings;
    int boardSize;
    char boardValue;

    public GameProcess(Board board) {
        this.board = board;
    }
    public void startGame() {
        MoveProcess moveProcess = new MoveProcess(board);
        while (true) {
            moveProcess.fieldNumberInput();
        }
    }
}
