package POO.Exercicios.Ex001;

public class Carro implements SistemaCarro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private int hp;
    private double torque;
    private boolean ligado;
    private boolean setaDireita;
    private boolean setaEsquerda;
    private boolean desligarSeta;

    public void status() {
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Ano: " + this.getCor());
        System.out.println("Cor: " + this.getCor());
        System.out.println("hp: " + this.getHp());
        System.out.println("Torque: " + this.getTorque());
    }

    public Carro(String m, String mrk, String c, int a, int h, double t, boolean l) {
        this.setLigado(false);
        this.modelo = m;
        this.marca = mrk;
        this.cor = c;
        this.ano = a;
        this.hp = h;
        this.torque = t;
        this.ligado = l;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
        System.out.println("Ligado: " +this.getLigado());
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        System.out.println("Ligado: " +this.getLigado());
    }

    @Override
    public void setaDireita() {
        if (getLigado()) {
            this.setSetaDireita(true);
            this.setSetaEsquerda(false);
            System.out.println("Dando Seta pra Direita!");
        } else {
            System.out.println("Ligue o Carro!");
        }
    }

    @Override
    public void setaEsquerda() {
        if (getLigado()) {
            this.setSetaDireita(false);
            this.setSetaEsquerda(true);
            System.out.println("Dando Seta pra Esquerda!");
        } else {
            System.out.println("Ligue o Carro!");
        }
    }

    @Override
    public void desligarSeta() {
        if (getLigado()) {
            if (getSetaDireita() || getSetaEsquerda())
                this.setSetaEsquerda(false);
                this.setSetaDireita(false);
                this.setDesligarSeta(true);
                System.out.println("Setas Desligadas!");
        }   else {
            System.out.println("Ligue o Carro!");
        }
    }

    @Override
    public void freiar() {
        if (getLigado()) {
            System.out.println("ACABOU O FREIO!");
        } else {
            System.out.println("Ligue o Carro!");
        }
    }

    @Override
    public void acelerar() {
        if (getLigado()) {
            System.out.println("VRUUUUUUUUUUUM!");
        } else {
            System.out.println("Ligue o Carro!");
        }
    }

    @Override
    public void buzinar() {
        System.out.println("BIBI!");
    }

    public String getModelo() { return this.modelo; }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String mrk) {
        this.marca = mrk;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String c){
        this.cor = c;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int a) {
        this.ano = a;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int h) {
        this.hp = h;
    }

    public double getTorque() {
        return this.torque;
    }

    public void setTorque(int t) {
        this.torque = t;
    }

    public boolean getLigado() {
        return this.ligado;
    }

    public void setLigado(boolean l) {
        this.ligado = l;
    }

    public boolean getSetaDireita() { return this.setaDireita; }
    public void setSetaDireita (boolean sd) { this.setaDireita = sd; }

    public boolean getSetaEsquerda() { return this.setaEsquerda; }
    public void setSetaEsquerda (boolean se) { this.setaEsquerda = se; }

    public boolean getDesligarSeta() { return this.desligarSeta; }
    public void setDesligarSeta (boolean d) { this.desligarSeta = d; }
}
