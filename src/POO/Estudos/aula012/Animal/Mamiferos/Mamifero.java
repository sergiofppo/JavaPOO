package POO.Estudos.aula012.Animal.Mamiferos;

import POO.Estudos.aula012.Animal.Animal;

public class Mamifero extends Animal {
    protected String corPelo;

    public String getCorPelo() {
        return this.corPelo;
    }

    public void setCorPelo(String cp) {
        this.corPelo = cp;
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero");
    }

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }
}
