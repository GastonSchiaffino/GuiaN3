package com.company.ejercicio3;

public class Rectangle extends GeometricFigures{
    ///Atributo
    public double height=1.0;
    public double width=1.0;

    ///Constructores
    public Rectangle (){
        super();
    }
    public Rectangle (String colour, double height,double width){
        super(colour);
        this.height=height;
        this.width=width;
    }
    ///Getters ans Setter

    public double getHeigth() {
        return height;
    }

    public void setHeigth(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    ///Metodos
    @Override
    public double calculateArea(){
        return this.width*this.height;
    }
    @Override
    public double calculatePerimeter(){
        return (2*this.height + 2*this.width);
    }

    @Override
    public String toString(){
        return "Rectangulo: " + super.toString() + "|Altura: " + this.height + "|Ancho: " + this.width;
    }
}
