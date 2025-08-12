package POO.Exercicios.Ex001;

public class Carro {
    String marca;
    String modelo;
    int ano;
    String cor;
    int hp;
    double torque;
    boolean ligado;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Ano: " + this.ano);
        System.out.println("Cor: " + this.cor);
        System.out.println("hp: " + this.hp);
        System.out.println("Torque: " + this.torque);
    }

    void ligar () {
        this.ligado = true;
    }

    void desligar() {
        this.ligado = false;
    }

    void acelerar() {
        if (this.ligado == true) {
            System.out.println("VRUUUUUUUUUUUUUUUUUUUUM!");
        } else {
            System.out.println("Erro! De partida no motor!");
        }
    }


}
