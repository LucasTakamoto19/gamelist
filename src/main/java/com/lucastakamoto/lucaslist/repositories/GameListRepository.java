package com.lucastakamoto.lucaslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucastakamoto.lucaslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

	
}
