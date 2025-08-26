package POO.Estudos.aula007;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
            System.out.println("Luta Marcada!");
        }  else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
            System.out.println("Luta Desaprovada!");
        }
    }

    public void lutar () {
        if (aprovada) {
            this.desafiado.apresentar();
            this.desafiante.apresentar();

            Random rand = new Random();
            int vencedor = rand.nextInt(3);

            switch (vencedor) {
                case 0:
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println(desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(desafiante.getNome());
                    this.desafiado.perderLuta();
                   this.desafiante.ganharLuta();
                    break;
            }
        } else {
            System.out.println("Luta Invalida!");
        }
    }

    public Lutador getDesafiado() { return this.desafiado; }
    public void setDesafiado(Lutador dedo) { this.desafiado = dedo; }

    public Lutador getDesafiante() { return this.desafiante; }
    public void setDesafiante(Lutador dante) { this.desafiante = dante; }

    public int getRounds() { return this.rounds; }
    public void setRounds(int r) { this.rounds = r; }

    public boolean getAprovada() { return this.aprovada; }
    public void setAprovada(boolean a) { this.aprovada = a; }
}
