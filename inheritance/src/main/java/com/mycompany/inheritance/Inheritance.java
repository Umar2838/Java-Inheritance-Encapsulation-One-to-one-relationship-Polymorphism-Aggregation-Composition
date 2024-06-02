/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inheritance;

/**
 *
 * @author Umar
 */
class Parent{
    String name = "Peter";
    void getdata(){
        System.out.println(this.name);
    }
}

class Child extends Parent{
   
    
}
public class Inheritance {

    public static void main(String[] args) {
   Child c1 = new Child();
   c1.getdata();
    }
}
