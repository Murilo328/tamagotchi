package br.com.joaocarloslima.tamagotchi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joaocarloslima.tamagotchi.service.TamagotchiService;

// ===== Controller da API: passagem do tempo =====
@RestController
public class ApiController {

    @Autowired
    private TamagotchiService service;

    // ----- Turno (chamado pela página a cada 1 segundo) -----
    @GetMapping("/turno")
    public void turno() {
        service.getGato().turno();
        service.getCachorro().turno();
        service.getDragao().turno();
    }

}
