//	Create a class Circle that has two data members, one to store the radius and another to store area and three methods 
//	first init() method to input radius from user, second calculateArea() method to calculate area of circle and third 
//	display() method to display values of radius and area. Create class CircleDemo ( main class) that creates the Circle 
//	object and calls init(), calculateArea() and display() methods.

import java.util.Scanner;

class Circle{
    private int radius;
    private double area;

    void init(int radius){
        this.radius = radius;
    }

    void calculateArea(){
        area = 2 * 3.14 * radius * radius;
    }

    void display(){
        System.out.println("Area of Circle is : "+area);
    }
}

class CircleDemo{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        int r = sc.nextInt();
        Circle c1 = new Circle();
        c1.init(r);
        c1.calculateArea();
        c1.display();    
    }
}