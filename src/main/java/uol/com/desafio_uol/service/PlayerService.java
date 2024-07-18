package uol.com.desafio_uol.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uol.com.desafio_uol.domain.GroupType;
import uol.com.desafio_uol.domain.Player;
import uol.com.desafio_uol.domain.dtos.PlayerDto;
import uol.com.desafio_uol.infra.CodinameHandler;
import uol.com.desafio_uol.repositories.PlayerRepository;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository repository;

    @Autowired
    private CodinameHandler handler;

    public Player createPlayer(PlayerDto dto) {
        Player newPlayer = new Player(dto);
        String codiname = getCodiname(dto.groupType());
        newPlayer.setCodiname(codiname);
        return repository.save(newPlayer);
    }

    private String getCodiname(GroupType groupType) {
        return handler.findCodiname(groupType);
    }


}
