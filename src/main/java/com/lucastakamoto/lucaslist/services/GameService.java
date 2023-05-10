package com.lucastakamoto.lucaslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucastakamoto.lucaslist.dto.GameMinDTO;
import com.lucastakamoto.lucaslist.entities.Game;
import com.lucastakamoto.lucaslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;

	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
		
		
	}
}
