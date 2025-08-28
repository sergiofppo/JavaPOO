package POO.Exercicios.Ex003;

public class TesteLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Sergio", 19, "M");
        p[1] = new Pessoa("Laila", 18, "F");

        l[0] = new Livro("Crime e Castigo","Dostoiévski" , 561, p[0]);
        l[1] = new Livro("Suicidas", "Raphael Montes", 429, p[1]);

        l[1].abrir();
        l[1].folhear(29);
        l[1].avancarPag();
        System.out.println(l[1].detalhes());

    }

}
