package br.com.devfelipebemvindo.live_extra.herenca;

public class MainCar {

    public static void main(String[] args) {
        // Instanciando os objetos
        Car car = new Car("Carro", "Toro", "Fiat", 0x000000, 4, 4);
        Motorcycle motorcycle = new Motorcycle("Moto", "Hayabusa", "Suzuki", 0xffffff, 2, true);

        System.out.println(car);
        System.out.println(motorcycle);
    }
}
