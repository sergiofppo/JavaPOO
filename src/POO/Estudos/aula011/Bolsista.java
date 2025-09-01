package POO.Estudos.aula011;

public class Bolsista extends Aluno {
    private int bolsa;

    public void renovarBolsa() {
        System.out.println("Bolsa Renovada!");
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Mensalidade Paga Com Desconto!");
    }
}
