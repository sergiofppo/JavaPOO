package POO.Exercicios.Ex004;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String genero;
    protected float experiencia;

    public Pessoa(String nome, int idade, String genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.experiencia = 0;
    }

    protected abstract void ganharXp();


    public String getNome() {
        return this.nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setSexo(String g) {
        switch (g) {
            case "M":
            case "F":
                this.genero = g;
                break;
            default:
                System.out.println("Genero Invalido! Coloque M para Masculino e F para Femenino.");
        }
    }

    public float getExperiencia() {
        return this.experiencia;
    }

    public void setExperiencia(float xp) {
        this.experiencia = xp;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + this.nome + '\'' +
                ", idade=" + this.idade +
                ", genero='" + this.genero + '\'' +
                ", experiencia=" + this.experiencia +
                '}';
    }
}
