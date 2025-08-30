package POO.Estudos.aula010;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    public Funcionario(String nome, int idade, String genero, String setor){
        super(nome, idade, genero);
        this.trabalhando = false;
        this.setor = setor;
    }

    public void status(){
        System.out.println(getNome());
        System.out.println(getIdade());
        System.out.println(getGenero());
        System.out.println(this.setor);
        System.out.println(this.trabalhando);
    }

    public void mudarTrabalho() {
        if (trabalhando) {
            this.trabalhando = false;
        } else {
            this.trabalhando = true;
        }
    }

    public String getSetor() {return this.setor;}
    public void setSetor(String st) {this.setor = st;}

    public boolean getTrabalhando() {return this.trabalhando;}
    public void setTrabalhando(boolean t) {this.trabalhando = t;}
}
