package com.tictactoe;

public class GameProcess {
    Board board;
    char playerType;

    public GameProcess(Board board,char playerType) {
        this.board = board;
        this.playerType = playerType;
    }
    public void startGame() {
        MoveProcess moveProcess = new MoveProcess(board);
        WinCheck winCheck = new WinCheck(board.board.length);
        board.showBoard();
        while (true) {
            moveProcess.playerFieldNumberInput();
            if(playerType == 'K') {
                moveProcess.cpuMove();
            }
        }
    }
}
