package com.company.ejercicio1;

public class Cylinder extends Circle{
    ///Atributos
    private double heigth=1.0;
    ///Constructores
    public Cylinder(){
        super();
    }

    public Cylinder(double radio, String colour) {
        super(radio,colour);
    }

    public Cylinder(double radio, String colour, double heigth) {
        super(radio,colour);
        this.heigth = heigth;
    }
    ///Getter ans Setters
    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }
    ///Metodos
    public double calculateVolumeCylinder(){
        return super.calculateArea()*heigth;
    }
    @Override
    public double calculateArea(){
        return (2*PI*super.getRadio()*this.heigth + 2*super.calculateArea());
    }

    @Override
    public String toString(){
        return "Cilindro: subclase de " + super.toString() + "| Altura:" + heigth;
    }



}
