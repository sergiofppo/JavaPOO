package POO.Estudos.aula010;

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public Professor(String nome, int idade, String genero, String especialidade, float salario){
        super(nome, idade, genero);
        this.especialidade = especialidade;
        this.salario = salario;
    }
    public void status(){
        System.out.println(getNome());
        System.out.println(getIdade());
        System.out.println(getGenero());
        System.out.println(this.especialidade);
        System.out.println(this.salario);
    }
    public void receberAumento(float aumento) {
        this.salario = aumento;
    }

    public String getEspecialidade() {return this.especialidade;}
    public void setEspecialidade(String e) {this.especialidade = e;}

    public float getSalario() {return this.salario;}
    public void setSalario(float sa) {this.salario = sa;}

}
