package com.company;

import java.util.ArrayList;
import java.util.List;

public class depart  {
    int id ;
    String name;
    String code;



    public depart(){

    }
    public depart(int i,String n,String c){
        id=i;
        name=n;
        code =c;

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
    public void print_d(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(code);

    }
    public void array(){
        List<String> Emp=new ArrayList<String>();
        Emp.add("ahmed");
        Emp.add("mohamed");
        Emp.add("sasa");
        System.out.println(Emp);
        Emp.remove(1);
        System.out.println(Emp);

    }



}
