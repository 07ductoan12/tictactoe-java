package com.toan.tictactoe.model;

import lombok.Data;

/** Game */
@Data
public class Game {

    private String gameId;
    private Player player1;
    private Player player2;
    private GameStatus status;
    private int[][] board;
    private TicToe winner;
}
