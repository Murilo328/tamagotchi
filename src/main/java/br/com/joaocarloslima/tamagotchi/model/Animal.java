package br.com.joaocarloslima.tamagotchi.model;

// ===== Classe abstrata Animal =====
public abstract class Animal {

    // ----- Atributos -----
    protected int energia;
    protected int fome;
    protected int felicidade;

    // ----- Construtor -----
    // Todo animal nasce com os atributos em 50
    public Animal() {
        this.energia = 50;
        this.fome = 50;
        this.felicidade = 50;
    }

    // ----- Gets -----
    public int getEnergia() {
        return energia;
    }

    public int getFome() {
        return fome;
    }

    public int getFelicidade() {
        return felicidade;
    }

    // ----- Métodos abstratos -----
    public abstract void brincar();

    public abstract void comer();

    public abstract void dormir();

    public abstract void turno();

    // ----- Método auxiliar -----
    // Garante que o valor fique sempre entre 0 e 100
    protected int limitar(int valor) {
        if (valor < 0) {
            return 0;
        }
        if (valor > 100) {
            return 100;
        }
        return valor;
    }

}
