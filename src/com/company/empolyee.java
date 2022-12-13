package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class empolyee implements Serializable {
    public Object array;
    String name ;
    static int count=1;
    int id ;
    double salary =id*1000 ;






    public empolyee(String name){

        this.name = name ;
        this.id =count;
        this.salary=count*1000;
        count ++;

    }


    public String getName() {
        return name;
    }

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setCount(int count) {
        empolyee.count = count;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String toString(){

        String s ;
        s ="name" +" "+ name +" id " +id + " " + salary;
        return s;
    }

    public void  array() throws IOException, ClassNotFoundException {
        ArrayList Emp=new ArrayList();
        Scanner in =new Scanner(System.in);
        System.out.println("enter empolyee name");
        for (int e =1 ;e< 10; e++){
            String s ;
            s ="name" +" "+ name +" id " +id + " " + salary;
            Emp.add(in.next());
            toString();
            System.out.println(Emp);

        }
        File file = new File("Emp");
        PrintWriter outputfile =new PrintWriter("Emp");
        outputfile.println(Emp);

//        for (int i=0 ;i<Emp.size();i++){
//            outputfile.println(Emp);
//        }
        outputfile.close();



    }


}





