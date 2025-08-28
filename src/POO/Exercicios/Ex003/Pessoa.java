package POO.Exercicios.Ex003;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void fazerAniver() {
        this.idade++;
    }

    public String getNome() { return this.nome; }
    public void setNome(String n) { this.nome = n; }

    public int getIdade() { return this.idade; }
    public void setIdade(int i) { this.idade = i;}

    public String getSexo() { return this.sexo;}
    public void setSexo(String sx) {
        switch (sx) {
            case "M":
            case "F":
                this.sexo = sx;
                break;
            default:
                System.out.println("Sexo invalido! Escolha M (masculino) ou F (feminino).");
        }
    }
}
