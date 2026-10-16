package br.com.joaocarloslima.tamagotchi.model;

// ===== Classe Dragao =====
public class Dragao extends Animal {

    // ----- Brincar -----
    @Override
    public void brincar() {
        felicidade = limitar(felicidade + 12);
        energia = limitar(energia - 15);
        fome = limitar(fome + 15);
    }

    // ----- Comer -----
    @Override
    public void comer() {
        fome = limitar(fome - 30);
        energia = limitar(energia + 20);
    }

    // ----- Dormir -----
    @Override
    public void dormir() {
        energia = limitar(energia + 10);
        fome = limitar(fome + 10);
    }

    // ----- Turno -----
    @Override
    public void turno() {
        energia = limitar(energia - 15);
        fome = limitar(fome + 10);
        felicidade = limitar(felicidade - 7);
    }

}
