package com.accenture.bufferedReaderInputStreamReader;

public class Employee {
    private String name;
    private int id;
   private  int age;

    public Employee(String name, int age, int id){
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public void displayDetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Id: "+this.id);
    }
}
