package com.company;

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


}
