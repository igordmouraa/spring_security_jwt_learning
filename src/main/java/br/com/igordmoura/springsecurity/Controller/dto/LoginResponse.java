package br.com.igordmoura.springsecurity.Controller.dto;

public record LoginResponse(String accessToken,
                            Long expiresIn) {
}
