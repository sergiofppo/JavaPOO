package POO.Estudos.aula012.Animal.Mamiferos;

public class Cachorro extends Mamifero{

    public void enterrarOsso(){
        System.out.println("Osso Enterrado!");
    }
    public void abanarRabo() {
        System.out.println("Balancando o Rabo");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Racao");
    }

    @Override
    public void emitirSom() {
        System.out.println("AUAU!");
    }

}
