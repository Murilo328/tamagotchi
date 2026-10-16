package br.com.joaocarloslima.tamagotchi.model;

// ===== Classe Gato =====
public class Gato extends Animal {

    // ----- Brincar -----
    @Override
    public void brincar() {
        felicidade = limitar(felicidade + 10);
        energia = limitar(energia - 5);
        fome = limitar(fome + 5);
    }

    // ----- Comer -----
    @Override
    public void comer() {
        fome = limitar(fome - 15);
        energia = limitar(energia + 10);
    }

    // ----- Dormir -----
    @Override
    public void dormir() {
        energia = limitar(energia + 20);
        fome = limitar(fome + 5);
    }

    // ----- Turno -----
    @Override
    public void turno() {
        energia = limitar(energia - 5);
        fome = limitar(fome + 5);
        felicidade = limitar(felicidade - 3);
    }

}
