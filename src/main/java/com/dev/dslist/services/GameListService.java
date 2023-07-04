package com.dev.dslist.services;

import com.dev.dslist.dto.GameListDTO;
import com.dev.dslist.entities.GameList;
import com.dev.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> gameDto = result.stream().map(x -> new GameListDTO((x))).toList();
        return gameDto;
    }
}
