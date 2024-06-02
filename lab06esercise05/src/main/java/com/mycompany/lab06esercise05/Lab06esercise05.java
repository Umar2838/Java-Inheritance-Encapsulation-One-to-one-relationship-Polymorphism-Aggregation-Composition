/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab06esercise05;

/**
 *
 * @author Umar
 */
class Passport{
    private String passportNumber;
    private String country;
    
    Passport(String passportNumber , String country ){
        this.passportNumber = passportNumber;
        this.country = country;
    }
    
     public String getPassportNumber() {
        return passportNumber;
    }

    public String getCountry() {
        return country;
    }

     public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    public String toString() {
        return   passportNumber  + "\n"+ country  ;
               
    }
    
}

class Person{
    private String name;
    private int age;
    private Passport passport;
    
    Person(String name, int age , Passport passport){
        this.name = name;
        this.age = age;
        this.passport = passport;
    }
    public String getName(){
        return name;
    }
    public int getAge() {
        return age;
    }

    public Passport getPassport() {
        return passport;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }
     public String toString() {
        return name + "\n"  + age + "\n" + passport + "\n";
    }

}
public class Lab06esercise05 {

    public static void main(String[] args) {
     Passport p1 = new Passport("A1234567","Pakistan");
     Person per1 = new Person("Umar Aqeel",19,p1);
     System.out.println(per1);
    }
}
