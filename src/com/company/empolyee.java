package com.company;

import java.util.ArrayList;

public class empolyee {
    int id;
    String name;
    double salary;

    public String toString(){
        return id+" "+ name+" " +salary ;
    }


    // depart d1;

    depart d1=new depart(20,"tolpa","HTML");
    depart d2 = new depart();




    public empolyee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }



    public void setId(int i ){
        id=i;
    }
    public void setName(String n){
        name=n;
    }
    public void setSalary(double s){
        salary=s;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }





}
