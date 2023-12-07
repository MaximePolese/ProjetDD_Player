package com.example.projetdd_player;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeroController {

    private Repo repo;

    public HeroController(Repo repo) {
        this.repo = repo;
    }



}
