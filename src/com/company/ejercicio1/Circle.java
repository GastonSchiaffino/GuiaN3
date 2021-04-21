package com.company.ejercicio1;

public class Circle {
    ///Atributos
    public static final double PI = 3.141592653589793;
    private double radio = 1.0;
    private String colour = "Rojo";

    ///Constructores
    public Circle() {
    }

    public Circle(double radio, String colour) {
        this.radio = radio;
        this.colour = colour;
    }
    ///Getter and Setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    ///Metodos
    public double calculateArea() {
        return PI * (this.radio * this.radio);
    }

    public String toString() {
        return "El circulo posee un radio de " + this.radio + ", es de color " + this.colour + " y tiene un área de " + calculateArea();
    }
}


