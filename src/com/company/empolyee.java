package com.company;

import java.util.ArrayList;

public class empolyee {
    int id;
    String name;
    double salary;

    // depart d1;


    depart d1=new depart(20,"tolpa","HTML");





    public void print(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }









    public empolyee(int i ,double s ,String n){
        id=i;
        salary=s;
        name=n;
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
