package uol.com.desafio_uol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uol.com.desafio_uol.domain.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
