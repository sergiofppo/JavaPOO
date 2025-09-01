package POO.Estudos.aula012.Animal.Peixes;

import POO.Estudos.aula012.Animal.Animal;

public class Peixe extends Animal {
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe nao faz som");
    }
}
