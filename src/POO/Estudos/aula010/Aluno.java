package POO.Estudos.aula010;

public class Aluno extends Pessoa {
    private boolean matricula;
    private String curso;

    public Aluno(String nome, int idade, String genero, String curso) {
        super(nome, idade, genero);
        this.matricula = false;
        this.curso = curso;
    }

    public void status(){
        System.out.println(getNome());
        System.out.println(getIdade());
        System.out.println(getGenero());
        System.out.println(getMatricula());
        System.out.println(getCurso());
    }

    public void fazerMatricula() {
        this.matricula = true;
    }

    public void cancelarMatricula() {
        this.matricula = false;
    }

    public boolean getMatricula() {return this.matricula;}
    public void setMatricula(boolean m) {this.matricula = m;}

    public String getCurso() {return this.curso;}
    public void setCurso(String c) {this.curso = c;}
}
