package POO.Exercicios.Ex001;

public class TesteCarro {
    public static void main(String[] args) {
        Carro car1 = new Carro ();
        car1.marca = "McLaren";
        car1.modelo = "750s";
        car1.ano = 2023;
        car1.cor = "Laranja";
        car1.hp = 750;
        car1.torque = 81.6;
        car1.ligado = true;
        car1.status();
        car1.acelerar();

    }
}
