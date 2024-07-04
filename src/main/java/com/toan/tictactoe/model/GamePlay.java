package com.toan.tictactoe.model;

import lombok.Data;

/** GamePlay */
@Data
public class GamePlay {
    private TicToe type;
    private Integer coordinateX;
    private Integer coordinateY;
    private String gameId;
}
