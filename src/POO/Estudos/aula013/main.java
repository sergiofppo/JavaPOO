package POO.Estudos.aula013;

public class main {
    public static void main(String[] args) {
        Cachorro x = new Cachorro();
        x.emitirSom();
        x.setIdade(12);
        x.setMembros(4);
        x.setPeso(6);
        x.setCorPelo("Preto");
        x.reagir(true);
        x.reagir("Ola");
        x.reagir(12, 30);
        x.reagir(x.getIdade(), x.getPeso());
    }
}
