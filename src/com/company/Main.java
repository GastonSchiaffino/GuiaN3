package com.company;

import com.company.ejercicio1.Circle;
import com.company.ejercicio1.Cylinder;

public class Main {

    public static void main(String[] args) {
        ///Prueba de circulo
        Circle circle = new Circle(4, "Azul");
        System.out.printf(circle.toString() + "\n");

        /// Punto 1
        Cylinder cylinder = new Cylinder();
        System.out.printf("\nRadio " + cylinder.getRadio());
        System.out.printf("\nAltura " + cylinder.getHeigth());
        System.out.printf("\nArea " + cylinder.calculateArea());
        System.out.printf("\nVolumen " + cylinder.calculateVolumeCylinder() + "\n");

        ///Punto 2
        Cylinder cylinder1 = new Cylinder(circle.getRadio(), circle.getColour(), 2);
        System.out.printf("\nRadio " + cylinder1.getRadio());
        System.out.printf("\nAltura " + cylinder1.getHeigth());
        System.out.printf("\nArea " + cylinder1.calculateArea());
        System.out.printf("\nVolumen " + cylinder1.calculateVolumeCylinder() + "\n");

        ///Punto 3
        System.out.printf("\nArea " + cylinder1.calculateArea());
        System.out.printf("\nVolumen " + cylinder1.calculateVolumeCylinder() + "\n");

        ///Punto4
        System.out.printf("\n" + cylinder1.toString());
    }
}
