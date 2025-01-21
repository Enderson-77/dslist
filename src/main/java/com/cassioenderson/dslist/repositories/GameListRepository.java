package com.cassioenderson.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cassioenderson.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
