package POO.Exercicios.Ex002;

public class TesteConta {
    public static void main(String[] args) {
        System.out.println("---------- Criando Conta Corrente ----------");
        Conta conta1 = new Conta(1001, "Sérgio");
        conta1.abrirConta("cc");
        conta1.consultarSaldo();

        System.out.println("---------- Depósito ----------");
        conta1.depositar(200);
        conta1.consultarSaldo();

        System.out.println("---------- Saque ----------");
        conta1.sacar(100);
        conta1.consultarSaldo();

        System.out.println("---------- Pagando Mensalidade ----------");
        conta1.pagarMensalidade();
        conta1.consultarSaldo();

        System.out.println("---------- Tentando Fechar Conta com Saldo > 0 ----------");
        conta1.fecharConta();

        System.out.println("---------- Zerando Saldo ----------");
        conta1.sacar((float) conta1.getSaldoConta());
        conta1.consultarSaldo();

        System.out.println("---------- Fechando Conta corretamente ----------");
        conta1.fecharConta();


        System.out.println("\n-----------------------------\n");
    }
}
