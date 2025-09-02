package POO.Estudos.aula013;

public class Mamifero extends Animal {
    protected String corPelo;

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String cp) {
        this.corPelo = cp;
    }
}
