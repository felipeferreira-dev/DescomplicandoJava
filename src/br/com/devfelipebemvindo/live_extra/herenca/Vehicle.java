package br.com.devfelipebemvindo.live_extra.herenca;

import br.com.devfelipebemvindo.felipe.projeto_resumao.bank.Log;

// Super classe, possui as principais propriedades e comportamentos que podem ser herdados pelas classes filhas
public class Vehicle {
    private Log logger = new Log();

    private String type;
    private String name;
    private String brand;
    private int color;

    private boolean accelerate;
    private boolean cram;

    private Motorcycle motorcycle;
    private Car car;

    private int number_of_wheels = 0;

    public Vehicle(String type, String name, String brand, int color, int number_of_wheels) {
        this.type = type;
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.number_of_wheels = number_of_wheels;
    }

    public int getNumber_of_wheels() {
        return number_of_wheels;
    }

    public boolean isCram() {
        return cram;
    }

    public void setCram(String type, boolean cram) {
        System.out.println(type + " buzinou!!!");
        this.cram = cram;
    }

    public boolean isAccelerate() {
        return accelerate;
    }

    public void setAccelerate(String type, boolean accelerate) {
        System.out.println(type + " acelerou!!!");
        this.accelerate = accelerate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle ->" +
                " type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", color=" + color +
                ", number_of_wheels=" + number_of_wheels;
    }
}
