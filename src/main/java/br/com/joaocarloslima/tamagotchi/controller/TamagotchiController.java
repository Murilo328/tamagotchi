package br.com.joaocarloslima.tamagotchi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.joaocarloslima.tamagotchi.service.TamagotchiService;

// ===== Controller das páginas =====
@Controller
public class TamagotchiController {

    @Autowired
    private TamagotchiService service;

    // ----- Página inicial -----
    @GetMapping
    public String index(Model model) {
        model.addAttribute("gato", service.getGato());
        model.addAttribute("cachorro", service.getCachorro());
        model.addAttribute("dragao", service.getDragao());
        return "index";
    }

    // ----- Gato -----
    @PostMapping("/gato/brincar")
    public String brincarGato() {
        service.getGato().brincar();
        return "redirect:/";
    }

    @PostMapping("/gato/comer")
    public String comerGato() {
        service.getGato().comer();
        return "redirect:/";
    }

    @PostMapping("/gato/dormir")
    public String dormirGato() {
        service.getGato().dormir();
        return "redirect:/";
    }

    // ----- Cachorro -----
    @PostMapping("/cachorro/brincar")
    public String brincarCachorro() {
        service.getCachorro().brincar();
        return "redirect:/";
    }

    @PostMapping("/cachorro/comer")
    public String comerCachorro() {
        service.getCachorro().comer();
        return "redirect:/";
    }

    @PostMapping("/cachorro/dormir")
    public String dormirCachorro() {
        service.getCachorro().dormir();
        return "redirect:/";
    }

    // ----- Dragão -----
    @PostMapping("/dragao/brincar")
    public String brincarDragao() {
        service.getDragao().brincar();
        return "redirect:/";
    }

    @PostMapping("/dragao/comer")
    public String comerDragao() {
        service.getDragao().comer();
        return "redirect:/";
    }

    @PostMapping("/dragao/dormir")
    public String dormirDragao() {
        service.getDragao().dormir();
        return "redirect:/";
    }

}
