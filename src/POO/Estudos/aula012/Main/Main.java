package POO.Estudos.aula012.Main;

import POO.Estudos.aula012.Animal.Animal;
import POO.Estudos.aula012.Animal.Aves.Ave;
import POO.Estudos.aula012.Animal.Mamiferos.Cachorro;
import POO.Estudos.aula012.Animal.Mamiferos.Mamifero;
import POO.Estudos.aula012.Animal.Peixes.Peixe;
import POO.Estudos.aula012.Animal.Reptil.Reptil;

public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Cachorro c = new Cachorro();

//        m.setPeso(35.2f);
//        m.setCorPelo("marrom");
//        m.alimentar();
//        m.locomover();
//        m.emitirSom();
        c.setPeso(6.7f);
        c.setIdade(3);
        c.setCorPelo("Preto");
        c.emitirSom();
        c.abanarRabo();
        c.alimentar();


    }
}
