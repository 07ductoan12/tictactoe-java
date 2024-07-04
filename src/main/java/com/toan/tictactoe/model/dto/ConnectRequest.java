package com.toan.tictactoe.model.dto;

import com.toan.tictactoe.model.Player;

import lombok.Data;

/** ConnectRequest */
@Data
public class ConnectRequest {
    private Player player;
    private String gameId;
}
