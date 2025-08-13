package POO.Estudos.aula003;

public class TesteTesoura {
    public static void main(String[] args) {
        Tesoura t1 = new Tesoura();
        t1.marca = "Tramontina";
        t1.cor = "Preta";
//        t1.aberta = false;
        t1.afiar();
        t1.abrir();
        t1.status();
        t1.cortar();

    }
}
