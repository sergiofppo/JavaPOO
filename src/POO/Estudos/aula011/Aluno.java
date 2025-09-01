package POO.Estudos.aula011;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public void pagarMensalidade() {
        System.out.println("Pagando a Mensalidade do aluno: " + getNome());
    }

    public int getMatricula() {return this.matricula;}
    public void setMatricula(int m) {this.matricula = m;}

    public String getCurso() {return this.curso;}
    public void setCurso(String cr) {this.curso = cr;}

}
