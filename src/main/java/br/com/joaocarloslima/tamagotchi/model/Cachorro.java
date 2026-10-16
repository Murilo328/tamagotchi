package br.com.joaocarloslima.tamagotchi.model;

// ===== Classe Cachorro =====
public class Cachorro extends Animal {

    // ----- Brincar -----
    @Override
    public void brincar() {
        felicidade = limitar(felicidade + 15);
        energia = limitar(energia - 10);
        fome = limitar(fome + 10);
    }

    // ----- Comer -----
    @Override
    public void comer() {
        fome = limitar(fome - 20);
        energia = limitar(energia + 15);
    }

    // ----- Dormir -----
    @Override
    public void dormir() {
        energia = limitar(energia + 15);
        fome = limitar(fome + 10);
    }

    // ----- Turno -----
    @Override
    public void turno() {
        energia = limitar(energia - 10);
        fome = limitar(fome + 10);
        felicidade = limitar(felicidade - 5);
    }

}
