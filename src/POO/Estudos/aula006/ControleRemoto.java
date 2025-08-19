package POO.Estudos.aula006;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto (int v, boolean l, boolean t) {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() { return this.volume; }
    private void setVolume(int v){ this.volume = v; }

    private boolean getLigado() { return this.ligado; }
    private void setLigado(boolean l) { this.ligado = l; }

    private boolean getTocando() { return this.tocando; }
    private void setTocando(boolean t) { this.tocando = t; }

    @Override
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println(getLigado());
        System.out.println(getTocando());
        System.out.print(getVolume());
        for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.print("[]");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando o Menu...");
    }

    @Override
    public void maisVolume() {

    }

    @Override
    public void menosVolume() {

    }

    @Override
    public void ligarMudo() {

    }

    @Override
    public void desligarMudo() {

    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }
}


