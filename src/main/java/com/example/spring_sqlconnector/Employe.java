package com.example.spring_sqlconnector;


import jakarta.persistence.*;

@Entity
@Table(name = "dev")
public class Employe {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "emp_name")
    private  String name;

    @Column
    private float salary;

    public Employe(){

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public Employe(int id, String name, float salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
