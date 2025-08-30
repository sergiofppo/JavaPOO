package POO.Estudos.aula010;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Sergio", 19, "M");
        p1.status();

        Aluno a1 = new Aluno("Sergio", 19, "M", "Ciencia da Computacao");
        a1.fazerMatricula();
        a1.fazerAniv();
        a1.status();

        Professor pr1 = new Professor("Fabricio", 33, "M", "Matematica", 5240f);
        pr1.receberAumento(60000);
        pr1.status();

        Funcionario f1 = new Funcionario("Julietta", 28, "F","Limpeza");
        f1.setTrabalhando(false);
        f1.mudarTrabalho();
        f1.status();
    }
}
