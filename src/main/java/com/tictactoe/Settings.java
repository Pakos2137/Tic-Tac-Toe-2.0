package com.tictactoe;

import java.util.Scanner;

public class Settings {

    char playerType;
    int boardValue;

    public void settingProcess(Board board) {
        System.out.println("Witaj W Grze Kamień,Papier,Nożyce" + '\n');
        playerSettings();
        boardSizeSet(board);
    }

    private void playerSettings() {
        System.out.println("Wybierz Grę z komputerem ( K ) lub z drugim graczem ( G ). ");

        Scanner playerScan = new Scanner(System.in);
        String player = playerScan.nextLine().toLowerCase();

        switch (player) {
            case "k": {
                System.out.println("Wybrano grę z komputerem");
                setPlayerType('K');
                break;
            }
            case "g": {
                System.out.println("Wybrano grę z graczem");
                setPlayerType('G');
                break;
            }
            default:
                System.out.print("Wybrano Nieporpwaną warość : " + player + '\n');
                playerSettings();
                break;
        }
    }
    private void boardSizeSet(Board board) {
        System.out.println("Wybierz wielkość planszy 3 lub 10.");
        Scanner boardSizeScan = new Scanner(System.in);
        try {
            int boardSize = boardSizeScan.nextInt();
            setBoardValue(boardSize);
        } catch (Exception e) {
            System.out.println("Wybierz Liczbę 3 lub 10");
            boardSizeSet(board);
        }
        if(boardValue == 10 || boardValue == 3) {
            if(getBoardValue() == 3) {
                board.setBoard3x3();
                GameProcess gameProcess = new GameProcess(board);
                gameProcess.startGame();
            }
            if(getBoardValue() == 10) {
                board.setBoard10x10();
                GameProcess gameProcess = new GameProcess(board);
                gameProcess.startGame();
            }
        } else {
            boardSizeSet(board);
            System.out.println("Wybierz Liczbę 3 lub 10");
        }
    }

    public char getPlayerType() {
        return playerType;
    }

    public void setPlayerType(char playerType) {
        this.playerType = playerType;
    }

    public int getBoardValue() {
        return boardValue;
    }

    public void setBoardValue(int boardValue) {
        this.boardValue = boardValue;
    }
}
