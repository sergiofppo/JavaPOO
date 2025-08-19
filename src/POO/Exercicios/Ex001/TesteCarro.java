package POO.Exercicios.Ex001;

public class TesteCarro {
    public static void main(String[] args) {
        Carro car1 = new Carro ("750s", "McLaren", "Laranja", 2023, 750, 81.6, true);
        car1.status();
        System.out.println("=============================");
        car1.ligar();
        car1.acelerar();
        car1.desligarSeta();
    }
}
