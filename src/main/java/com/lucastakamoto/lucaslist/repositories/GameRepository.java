package com.lucastakamoto.lucaslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucastakamoto.lucaslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

	
}
