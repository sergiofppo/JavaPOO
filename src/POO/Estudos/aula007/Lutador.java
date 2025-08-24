package POO.Estudos.aula007;

public class Lutador {
   private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String no, String na, int i, float a, float p, int v, int d, int e) {
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(i);
        this.setAltura(a);
        this.setPeso(p);
        this.setVitorias(v);
        this.setDerrotas(d);
        this.setEmpates(e);
    }

    public void apresentar() {
        System.out.println("-----------------------------");
        System.out.println("Nome: " +getNome());
        System.out.println("Nacionalidade: " +getNacionalidade());
        System.out.println("Idade: " +getIdade());
        System.out.println("Altura: " +getAltura());
        System.out.println("Peso: " +getPeso());
        System.out.println("Categoria: " +getCategoria());
        System.out.println("Vitorias: " +getVitorias());
        System.out.println("Derrotas: " +getDerrotas());
        System.out.println("Empates: " +getEmpates());
        System.out.println("----------------------------");

    }

    public void Status() {
        System.out.println(getNome());
        System.out.println("Eh um Peso: " + getCategoria());
        System.out.println(getVitorias()+ " vitorias");
        System.out.println(getDerrotas()+ " derrotas");
        System.out.println(getEmpates()+ " empates");
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    public String getNome() { return this.nome; }
    public void setNome(String no) { this.nome = no; }

    public String getNacionalidade() { return this.nacionalidade; }
    public void setNacionalidade(String na) { this.nacionalidade = na; }

    public int getIdade() { return this.idade; }
    public void setIdade(int i) { this.idade = i; }

    public float getAltura() { return this.altura; }
    public void setAltura(float a) { this.altura = a;}

    public float getPeso() { return this.peso; }
    public void setPeso(float p) {
        this.peso = p;
        this.setCategoria();
    }

    public String getCategoria() { return this.categoria;}
    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }


    public int getVitorias() { return this.vitorias;}
    public void setVitorias(int v) { this.vitorias = v;}

    public int getDerrotas() { return this.derrotas;}
    public void setDerrotas(int d) { this.derrotas = d;}

    public int getEmpates() { return this.empates;}
    public void setEmpates(int e) { this.empates = e;}

}
