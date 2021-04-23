package com.company;

import com.company.ejercicio1.Circle;
import com.company.ejercicio1.Cylinder;
import com.company.ejercicio2.Person;
import com.company.ejercicio2.StaffMember;
import com.company.ejercicio2.Student;
import com.company.ejercicio3.Circle1;
import com.company.ejercicio3.Rectangle;
import com.company.ejercicio3.Square;
import com.sun.source.tree.NewArrayTree;

public class Main {

    public static void main(String[] args) {
     /*   ///Prueba de circulo
        Circle circle = new Circle(4, "Azul");
        System.out.printf(circle.toString() + "\n");

        ///////////Ejercicio 1 - Guia 3 ///////////

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
      */

        /* ///////////Ejercicio 2 - Guia 3 ///////////
        ///Punto 1
        Student student1= new Student(38953932,"Gaston","Schiaffino","gastonschiaffino10@gmail.com","Tucuman 2370 2 E", 2020, 3800, "Programación");
        Student student2= new Student(37867138, "Lucas", "Mostafa", "mostafalucas@gmail.com", "Costa Azul 4608", 2019, 1555, "Programación");
        Student student3= new Student(38953888, "Kevin", "Botta", "bottakevin@gmail.com", "Falucho 2640 4 H", 2021, 4800,"Relaciones Públicas");
        Student student4= new Student(42963828,"Nicolas","Mostafa","mostafanicolas1@gmail.com","Bolivar y cordoba", 2015, 3500, "Analista de sistemas");
        ///Punto 2
        StaffMember staffMember1=new StaffMember(21416288,"Cecilia","Labarre", "cecilialabarre27@gmail.com","Brown 2507 8 G", 30000, "Mañana");
        StaffMember staffMember2=new StaffMember(17797205, "Sergio", "Schiaffino", "schaiffinosergia@gmail.com", "9 de Julio 7220", 45000, "Tarde");
        StaffMember staffMember3=new StaffMember(21448228, "Karina", "Arana", "anakarinaarana@gmail.com", "Costa Azul 4608", 50000, "Mañana");
        StaffMember staffMember4=new StaffMember(27867125, "Juan", "Riquelme", "todosobreroman@gmail.com", "Brandsen 805", 200000, "Tarde");

        ///Punto 3
        Person[] person = new Person[8];

        person[0]=student1;
        person[1]=student2;
        person[2]=student3;
        person[3]=student4;
        person[4]=staffMember1;
        person[5]=staffMember2;
        person[6]=staffMember3;
        person[7]=staffMember4;
        ///Punto 4
        int student=0;
        int staffMember=0;

        for (Person members:person) {
            if (members != null) {
                if (members instanceof Student)
                    student++;
                if (members instanceof StaffMember)
                    staffMember++;
            }
        }

        System.out.printf("La cantidad de estudiante es: " + student);
        System.out.printf("\nLa cantidad de miembros del staff es: " + staffMember);

        ///Punto 5
        double totalFee=0;

        for (Person institution:person) {
            if(institution!=null) {
                if(institution instanceof Student){
                    totalFee += ((Student) institution).getFee();
                }
            }
        }
        System.out.printf("\nLa cantidad de ingresos del colegio por la cuota de los estudiantes es: " + totalFee);

        */

        //////////////Ejercicio 3 - Guia 3 ///////////
        ///Punto 1
        Circle1 circle1 = new Circle1();
        Circle1 circle2 = new Circle1("Rojo", 3);

        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle("Purpura", 2,4);

        System.out.printf(circle1.toString()+"\n");
        System.out.printf(circle2.toString()+"\n");
        System.out.printf(rectangle.toString()+"\n");
        System.out.printf(rectangle1.toString()+"\n");

        Square square = new Square();
        System.out.printf(square.toString()+"\n");

    }
}
