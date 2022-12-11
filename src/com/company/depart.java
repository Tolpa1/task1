package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class depart  {
    int id ;
    String name;
    String code;



    public depart(){

    }

    public depart(int id , String name, String code) {
        this.id =id;
        this.name = name ;
        this.code = code;
    }

    public void setId(int i ){
        id=i;

    }
    public void setName(String n ){
        name=n;

    }
    public void setCode(String c){
        code=c;

    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getCode(){
        return code;
    }
    public String toString(){
        return id+" "+ name +" "+ code;



    }
    public void array(){
        List<String> Emp=new ArrayList<String>();
        Scanner in =new Scanner(System.in);


        display();
        System.out.println("  ");
        System.out.println("choice 1 , 2 , 3 ");
        for (int c=0 ;c<10; c++){
            int choice ;
            choice =in.nextInt();
            if (choice == 1){
                System.out.println("add empolyee name");
                Emp.add(String.valueOf(in.next()));
                System.out.println("empolyee  add");

            }
            if(choice==2){
                System.out.println("enter num can be removed");
                Emp.remove(in.nextInt());
                System.out.println("empolyee removed");

            }
            if (choice ==3){
                System.out.println(Emp);

            }

        }




    }
    public void display(){
        System.out.println("1 add empolyee");
        System.out.println("2 remove empolyee");
        System.out.println("3 print empolyee");


    }






}
