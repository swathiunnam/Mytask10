package oops;

import java.util.Scanner;

public class CircleCircumference {
    double radius;
    double circum;
    public CircleCircumference(double radius){
         this.radius=radius;
    }
    double getCircumference(){
         circum=2*3.14*radius;
         return circum;
        
    }

    public static void main(String[] args) {
        CircleCircumference c1=new CircleCircumference(5.50);
        System.out.println("circumference is"+c1.getCircumference());
        
        
    }
    
    
}
