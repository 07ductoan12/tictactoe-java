package com.toan.tictactoe.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/** TicToe */
@AllArgsConstructor
@Getter
public enum TicToe {
    X(1),
    O(0);
    private Integer value;
}
