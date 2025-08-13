package POO.Estudos.aula003;

public class Tesoura {
    public String marca;
     public String cor;
     // private String ponta;
     protected boolean aberta;
     private boolean afiada;

    protected void status() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Está aberta? " + this.aberta);
        System.out.println("Está afiada? " + this.afiada);
    }

    protected void cortar() {
        if (!this.aberta) {
            System.out.println("ERRO! Não posso cortar, a tesoura está fechada.");
        } else if (!this.afiada) {
            System.out.println("ERRO! Não posso cortar, a tesoura está cega.");
        } else {
            System.out.println("Cortando...");
        }
    }

   protected void abrir() {
        this.aberta = true;
        System.out.println("Tesoura aberta.");
    }

   protected void fechar() {
        this.aberta = false;
        System.out.println("Tesoura fechada.");
    }

   public void afiar() {
        this.afiada = true;
        System.out.println("Tesoura afiada.");
    }

   protected void desafiar() {
        this.afiada = false;
        System.out.println("Tesoura perdeu o fio.");
    }
}

