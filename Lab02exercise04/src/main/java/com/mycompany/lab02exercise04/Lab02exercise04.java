/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab02exercise04;

/**
 *
 * @author Umar
 */
class Person{
    private String name;
    private Birthday dob;
    private Address adr;
   
    Person(String name , Birthday dob , Address adr){
        this.name = name;
        this.dob = dob;
        this.adr = adr;
    }
    
    void display(){
        System.out.println("Person Information:");
        System.out.println(this.name);
        System.out.println("Birthday:");
        System.out.println(this.dob);
        System.out.println("Adress:");
        System.out.println(this.adr);

    }
}

class Birthday{
    private String month;
    private int date;
    private int year;
    
    Birthday(int date , String month , int year){
        this.date = date;
        this.month = month;
        this.year = year;
    }
    
    public String toString() {
        return date + " " + month + " " + year;
    }
    
}

class Address{
    private int zipcode;
    private String city;
    private String province;
    private String country;

   Address(int zipcode , String city , String province , String country){
    this.zipcode = zipcode;
    this.city = city;
    this.province = province;
    this.country = country;
}

 public String toString() {
        return zipcode + ", " + city + ", " + province + ", " + country;
    }

}



public class Lab02exercise04 {

    public static void main(String[] args) {

        Birthday b1 = new Birthday(11,"Sep",2004);
        Address adr = new Address(7590,"Karachi","Sindh","Pakistan");
        Person p1 = new Person("Saleem",b1,adr);
        p1.display();
    }
}
