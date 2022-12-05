package com.company;

public class Main {

    public static void main(String[] args) {
        depart d1 =new depart(20,"ahmed","Html");
        System.out.println(d1.getId());
        System.out.println(d1.getName());
        System.out.println(d1.getCode());

        System.out.println("   ");

        empolyee e1=new empolyee(20,2000,"sasa");
        System.out.println(e1.getId());
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());

    }
}
