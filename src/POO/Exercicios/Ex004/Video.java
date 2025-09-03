package POO.Exercicios.Ex004;

public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private float views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String t) {
        this.titulo = t;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int a) {

        int nova;
        nova = (int) ((this.avaliacao + a)/ this.views);

        this.avaliacao = nova;
    }

    public float getViews() {
        return views;
    }

    public void setViews(float v) {
        this.views = v;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int c) {
        this.curtidas = c;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean r) {
        this.reproduzindo = r;
    }

    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.curtidas++;
    }

    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + this.titulo + '\'' +
                ", avaliacao=" + this.avaliacao +
                ", views=" + this.views +
                ", curtidas=" + this.curtidas +
                ", reproduzindo=" + this.reproduzindo +
                '}';
    }
}
