package com.company;

public class Circle {

   private static final double pi=Math.PI;

    public Circle() {
    }


    static void area(int radius){
        System.out.println("Area is: "+pi*(radius*radius));
    }

     static void circumference(int radius){
         System.out.println("Circimference is: "+pi*2*radius);
     }
}
