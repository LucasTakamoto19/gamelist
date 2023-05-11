package com.lucastakamoto.lucaslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lucastakamoto.lucaslist.dto.GameDTO;
import com.lucastakamoto.lucaslist.dto.GameMinDTO;
import com.lucastakamoto.lucaslist.entities.Game;
import com.lucastakamoto.lucaslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;

	@Transactional(readOnly = true)
	public GameDTO findBtId(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}
	
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
		
		
		
	}
}
