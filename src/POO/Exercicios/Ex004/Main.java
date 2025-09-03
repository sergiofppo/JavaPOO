package POO.Exercicios.Ex004;

public class Main {
    public static void main(String[] args) {
        Video [] v = new Video[3];
        v[0] = new Video("Dando pau no meu Audi 4 tudao!");
        v[1] = new Video("Racha Porsche 911 x Audi R8");
        v[2] = new Video("Como ser dedicado igual o Sergio?");

        Inscrito[] i = new Inscrito[2];
        i[0] = new Inscrito("Sergio", 19,"M", "sergiofppo");
        i[1] = new Inscrito("Laila", 18,"F", "lailoca");


        Visualizacao[] vz = new Visualizacao[5];
        vz[0] = new Visualizacao(i[1], v[1]);
        vz[0].avaliar();
        System.out.println(vz[0].toString());

        vz[1] = new Visualizacao(i[0], v[1]);
        vz[1].avaliar(87.0f);
        System.out.println(vz[1].toString());

    }
}
