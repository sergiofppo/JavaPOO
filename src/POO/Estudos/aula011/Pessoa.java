package POO.Estudos.aula011;

public abstract class Pessoa {
    protected String nome;
    private int idade;
    private String sexo;

    public final void fazerAniv() {
        this.idade++;
    }

    public String getNome() {return this.nome;}
    public void setNome(String n) {this.nome = n;}

    public int getIdade() {return this.idade;}
    public void setIdade(int i) {this.idade = i;}

    public String getSexo() {return this.sexo;}
    public void setSexo(String s) {
        switch (s) {
            case "M":
            case "F":
                this.sexo = s;
                break;
            default:
                System.out.println("Sexo Invalido! Escolha M para Masculino e F para Femenino.");
        }
    }

    @Override
    public String toString() {
        return "Dados{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
