package com.goit.gojavaonline.tictactoe;

/**
 * Created by SashaKulek on 08/04/2016.
 */

public class Runner {
    public static void main(String[] args) {
       Board board = new Board();
//        board.cells[0][0].setContent(com.goit.gojavaonline.tictactoe.CellContent.CROSS);
//        board.cells[1][1].setContent(com.goit.gojavaonline.tictactoe.CellContent.CROSS);
//        board.cells[2][2].setContent(com.goit.gojavaonline.tictactoe.CellContent.ZERO);

        Game newGame = new Game(board);

        newGame.startGame();
    }
}
