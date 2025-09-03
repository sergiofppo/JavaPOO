package POO.Exercicios.Ex004;

public class Inscrito extends Pessoa {
    private String login;
    private int totAssistido;

    public Inscrito(String nome, int idade, String genero, String login) {
        super(nome, idade, genero);
        this.login = login;
        this.totAssistido = 0;
    }

    public void viuMaisUm() {

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return this.totAssistido;
    }

    public void setTotAssistido(int tot) {
        this.totAssistido = tot;
    }

    @Override
    protected void ganharXp() {

    }
}
