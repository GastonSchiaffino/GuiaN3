package com.company.ejercicio2;

public class Student extends Person{
    ///Atributos
    private int entryYear;
    private double fee;
    private String career;

    ///Constructores
    public Student(){
        super();
    }

    public Student(double dni, String name,String surname,String email, String address, int entryYear, double fee, String career){
        super(dni,name,surname,email,address);
        this.entryYear=entryYear;
        this.fee=fee;
        this.career=career;
    }
    ///Getter ans Setters

    public int getEntryYear() {
        return entryYear;
    }

    public void setEntryYear(int entryYear) {
        this.entryYear = entryYear;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    ///Metodos
}
