package POO.Estudos.aula010;

public class Pessoa {
    private String nome;
    private int idade;
    private String genero;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.genero = sexo;
    }

    public void status(){
        System.out.println(getNome());
        System.out.println(getIdade());
        System.out.println(getGenero());
    }

    public void fazerAniv() {
        this.idade++;
    }

    public String getNome() {return this.nome;}
    public void setNome(String n) {this.nome = n;}

    public int getIdade() {return this.idade;}
    public void setIdade(int i) {this.idade = i;}

    public String getGenero() {return this.genero;}
    public void setGenero(String g) {
        switch (g){
            case "M":
                this.genero = "M";
                break;
            case "F":
                this.genero = "F";
                break;
            default:
                System.out.println("Sexo Invalido! Digite M para Masculino e F para Feminino.");
        }
    }
}
