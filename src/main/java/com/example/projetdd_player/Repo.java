package com.example.projetdd_player;

import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Repo {
    List<Hero> findAll();

    Hero findById(int id);

    Hero save(Hero hero);

    void deleteById(int id);
}
