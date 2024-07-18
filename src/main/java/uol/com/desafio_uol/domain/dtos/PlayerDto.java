package uol.com.desafio_uol.domain.dtos;

import uol.com.desafio_uol.domain.GroupType;

public record PlayerDto(

        String name,
        String email,
        String phoneNumber,
        GroupType groupType

) {
}
