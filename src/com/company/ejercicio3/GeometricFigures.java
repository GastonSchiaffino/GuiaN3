package com.company.ejercicio3;

public abstract class GeometricFigures {
    ///Atributos
    private String colour="Amarillo";

    ///Constructores
    public GeometricFigures(){
    }

    public GeometricFigures(String colour){
        this.colour=colour;
    }
    ///Getters ans Setter

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    ///Metodos
    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    @Override
    public String toString(){
        return "Color: " + this.colour;
    }
}