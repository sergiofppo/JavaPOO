package POO.Exercicios.Ex001;

public class TesteCarro {
    public static void main(String[] args) {
        Carro car1 = new Carro ("750s", "McLaren", "Laranja", 2023, 750, 81.6, true);
        car1.status();
        car1.acelerar();
        System.out.println("");
        Carro car2 = new Carro ("CLA 45S", " Mercedes-AMG", "Mountain Grey Magno", 2023, 421, 51, true);
        car2.status();
        car2.acelerar();



    }
}
