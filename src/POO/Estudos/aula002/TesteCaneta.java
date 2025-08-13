package POO.Estudos.aula002;

public class TesteCaneta {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.destampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "Ceub";
        c2.cor = "Preta";
        c2.status();
        c2.tampar();
        c2.rabiscar();

    }
}
