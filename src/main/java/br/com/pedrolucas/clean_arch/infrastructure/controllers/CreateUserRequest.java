package br.com.pedrolucas.clean_arch.infrastructure.controllers;

public record CreateUserRequest(String name, String password, String email) {
    
}
