package POO.Exercicios.Ex003;

import POO.Estudos.aula007.Luta;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.aberto = false;
        this.pagAtual = 0;
    }

    public String detalhes() {
        return "Livro { " +
                "titulo = '" + titulo + '\'' +
                ", autor = '" + autor + '\'' +
                ", totPaginas = " + totPaginas +
                ", paginaAtual = " + pagAtual +
                ", aberto = " + aberto +
                ", leitor = " + leitor.getNome() +
                '}';
    }

    public int getPagAtual() { return pagAtual; }
    public void setPagAtual(int pagA) { this.pagAtual = pagA; }

    public String getTitulo() { return this.titulo; }
    public void setTitulo(String t) { this.titulo = t; }

    public String getAutor() { return this.autor; }
    public void setAutor(String a) { this.autor = a; }

    public int getTotPaginas() { return this.totPaginas; }
    public void setTotPaginas(int tot) { this.totPaginas = tot; }

    public boolean getAberto() { return this.aberto; }
    public void setAberto(boolean ab) { this.aberto = ab; }

    public Pessoa getLeitor() {return this.leitor; }
    public void setLeitor (Pessoa l) { this.leitor = l; }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (p > this.totPaginas) {
            this.pagAtual = 0;
        } else {
            this.pagAtual = p;
        }
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
}
