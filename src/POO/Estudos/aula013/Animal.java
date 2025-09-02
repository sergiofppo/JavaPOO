package POO.Estudos.aula013;

public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membros;

    public abstract void emitirSom();

    public float getPeso() {
        return peso;
    }

    public void setPeso(float p) {
        this.peso = p;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int m) {
        this.membros = m;
    }
}
