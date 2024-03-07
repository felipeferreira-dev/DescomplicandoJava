package br.com.devfelipebemvindo.live_extra.herenca;

// Classe filha extende (herda) as propriedades da classe pai
public class Car extends Vehicle {

    // para acessar propriedades e comportamentos da super classe, eu preciso usar o super()
    private int numberOfDoor;

    // super() indica que a rotina da classe pai será executada em primeiro lugar
    public Car(String type, String name, String brand, int color, int number_of_wheels,
               int numberOfDoor) {
        super(type, name, brand, color, number_of_wheels);

        super.setCram(type, true);
        this.numberOfDoor = numberOfDoor;
    }

    // usando super() para exibir primeiro o toString da classe pai
    @Override
    public String toString() {
        return super.toString() + ", numberOfDoor= " + numberOfDoor;
    }
}
