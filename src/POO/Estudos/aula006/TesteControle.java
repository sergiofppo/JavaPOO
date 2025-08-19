package POO.Estudos.aula006;

public class TesteControle {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();
        c.play();
        c.ligarMudo();
        c.desligarMudo();
        c.abrirMenu();
        c.fecharMenu();
    }
}
