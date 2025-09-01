package POO.Estudos.aula012.Animal.Reptil;

import POO.Estudos.aula012.Animal.Animal;

public class Reptil extends Animal {
    private String corEscama;

    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais");
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Reptil");
    }
}
