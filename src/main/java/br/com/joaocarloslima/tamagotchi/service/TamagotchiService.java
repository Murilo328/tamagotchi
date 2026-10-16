package br.com.joaocarloslima.tamagotchi.service;

import org.springframework.stereotype.Service;

import br.com.joaocarloslima.tamagotchi.model.Animal;
import br.com.joaocarloslima.tamagotchi.model.Cachorro;
import br.com.joaocarloslima.tamagotchi.model.Dragao;
import br.com.joaocarloslima.tamagotchi.model.Gato;

// ===== Service: guarda os três animais =====
@Service
public class TamagotchiService {

    // ----- Animais -----
    private Animal gato = new Gato();
    private Animal cachorro = new Cachorro();
    private Animal dragao = new Dragao();

    // ----- Gets -----
    public Animal getGato() {
        return gato;
    }

    public Animal getCachorro() {
        return cachorro;
    }

    public Animal getDragao() {
        return dragao;
    }

}
