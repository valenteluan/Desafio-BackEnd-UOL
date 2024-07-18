package uol.com.desafio_uol.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uol.com.desafio_uol.domain.Player;
import uol.com.desafio_uol.domain.dtos.PlayerDto;
import uol.com.desafio_uol.repositories.PlayerRepository;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository repository;

    public Player createPlayer(PlayerDto dto) {
        Player newPlayer = new Player(dto);
        return repository.save(newPlayer);
    }
}
