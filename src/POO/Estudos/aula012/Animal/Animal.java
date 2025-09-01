package POO.Estudos.aula012.Animal;

public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membros;

    public abstract void locomover();

    public abstract void alimentar();

    public abstract void emitirSom();

    public float getPeso() {return this.peso;}
    public void setPeso(float p) {this.peso = p;}

    public int getIdade() {return this.idade;}
    public void setIdade(int i) {this.idade = i;}

    public int getMembros() {return this.membros;}
    public void setMembros(int m) {this.membros = m;}
}
