package com.cassioenderson.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cassioenderson.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
