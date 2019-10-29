package com.company;

import static java.lang.Math.pow;

public class Circle {

    static double PI=Math.PI;
    private double radius=1.0;
    private String color="red";
    Circle(){

    }
    Circle(double radius){
        this.radius=radius;
    }
    Circle(double radius, String color){
        this.radius=radius;
        this.color=color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle[radius= "+getRadius()+", color= "+getColor()+"]";
    }

    public double getArea(){
        double area;
        area=pow(getRadius(),2)*PI;
        return area;
    }

    public static void main(String[] args) {
        System.out.println("Реализовать логику метода getArea() для вычисления площади круга. " +"\n"+
                "В качестве числа pi использовать статическую переменную класса Math.PI");
        Circle c=new Circle();
        System.out.println("Area: "+ c.getArea());
        Circle c1=new Circle(2.0, "Blue");
        System.out.println("Area1: "+ c1.getArea()+", \n"+c1.toString());

    }
}
