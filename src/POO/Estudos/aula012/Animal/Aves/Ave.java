package POO.Estudos.aula012.Animal.Aves;

import POO.Estudos.aula012.Animal.Animal;

public class Ave extends Animal {
    protected String corPena;

    public void fazerNinho() {
        System.out.println("Ninho feito!");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Minhoca");
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void emitirSom() {
        System.out.println("PiuPiu");
    }
}
