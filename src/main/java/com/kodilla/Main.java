package com.kodilla;

public class Main {
    public static void main(String[] args) {
        Settings settings = new Settings();
        Board board = new Board();
        settings.settingProcess(board);
        board.showBoard();
    }
}