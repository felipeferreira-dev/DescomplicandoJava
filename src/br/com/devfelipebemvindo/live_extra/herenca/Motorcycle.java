package br.com.devfelipebemvindo.live_extra.herenca;

public class Motorcycle extends Vehicle {

    private boolean eletric;

    // super() indica que a rotina da classe pai será executada em primeiro lugar
    public Motorcycle(String type, String name, String brand, int color, int number_of_wheels,
                      boolean eletric) {
        super(type, name, brand, color, number_of_wheels);

        super.setAccelerate(type, true);
        this.eletric = eletric;
    }

    // usando super() para exibir primeiro o toString da classe pai
    @Override
    public String toString() {
        return super.toString() + ", eletric = " + eletric;
    }
}
