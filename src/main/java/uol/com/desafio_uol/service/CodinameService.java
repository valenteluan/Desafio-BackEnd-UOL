package uol.com.desafio_uol.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CodinameService {

    @Autowired
    private RestTemplate restTemplate;

}
