package br.com.igordmoura.springsecurity.Controller.dto;

public record LoginRequest(String username,
                           String password) {
}
