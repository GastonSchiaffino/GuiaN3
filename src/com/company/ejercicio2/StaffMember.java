package com.company.ejercicio2;

public class StaffMember extends Person {

    ///Atributos
    private double salary;
    private String turn;

    ///Constructores
    public StaffMember() {
        super();
    }

    public StaffMember(double dni, String name,String surname,String email, String address,double salary, String turn){
        super(dni,name,surname,email,address);
        this.salary=salary;
        this.turn=turn;
    }

    ///Getter ans Setters

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getTurn() {
        return turn;
    }

    public void setTurn(String turn) {
        this.turn = turn;
    }

    ///Metodos
    public double annualSalary(){
        return this.salary*12;
    }

}
