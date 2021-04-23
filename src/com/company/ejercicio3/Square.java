package com.company.ejercicio3;

public class Square extends Rectangle{
    public Square(){
        super();
    }
    public Square(String colour, double side){
        super(colour,side,side);
    }

    ///metodo


    @Override
    public String toString() {
        return "Cuadrado: " + "Color: " + getColour() + " | Altura: " + getHeigth() + " | Ancho: " + getWidth();
    }
}
