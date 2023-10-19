package com.tictactoe;

public class GameProcess {
    boolean gameInProgress;
    Board board;
    char playerType;

    public GameProcess(Board board,char playerType) {
        this.board = board;
        this.playerType = playerType;
    }
    public void startGame() {
        gameInProgress = true;
        MoveProcess moveProcess = new MoveProcess(board);
        WinCheck winCheck = new WinCheck(board);
        board.showBoard();
        while (gameInProgress) {
            moveProcess.playerFieldNumberInput();
            if(board.board.length == 3) {
                gameInProgress = winCheck.winCheck3x3();
            } else if (board.board.length == 10) {
                gameInProgress = winCheck.winCheck10x10();
            }
            if(playerType == 'K' && gameInProgress) {
                moveProcess.cpuMove();
            }
        }
    }
}
