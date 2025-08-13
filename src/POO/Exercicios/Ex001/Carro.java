package POO.Exercicios.Ex001;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private int hp;
    private double torque;
    private boolean ligado;

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Ano: " + this.ano);
        System.out.println("Cor: " + this.cor);
        System.out.println("hp: " + this.hp);
        System.out.println("Torque: " + this.torque);
    }

    public Carro(String m, String mrk, String c, int a, int h, double t, boolean l) {
        this.modelo = m;
        this.marca = mrk;
        this.cor = c;
        this.ano = a;
        this.hp = h;
        this.torque = t;
        this.ligado = l;


    }

    public void ligar () {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public void acelerar() {
        if (this.ligado == true) {
            System.out.println("VRUUUUUUUUUUUUUUUUUUUUM!");
        } else {
            System.out.println("Erro! De partida no motor!");
        }
    }

    public String getModelo() {
        return this.modelo;
    }

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



}
