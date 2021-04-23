package com.company.ejercicio3;

public class Circle1 extends GeometricFigures{
    ///Atributos
    private double radio=1.0;

    ///Constructores
    public Circle1(){
        super();
    }

    public Circle1(String colour, double radio) {
        super(colour);
        this.radio=radio;
    }
    ///Getters ans Setter

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    ///Metodos
    ///Metodos
    @Override
    public double calculateArea(){
        return this.radio*this.radio*Math.PI;
    }
    @Override
    public double calculatePerimeter(){
        return 2*this.radio*Math.PI;
    }
    @Override
    public String toString() {
        return "Circulo: " + super.toString() + "|Radio: " + this.radio;
    }
}
