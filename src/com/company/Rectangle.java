package com.company;

public class Rectangle {

    private float length=1.0f;
    private float width=1.0f;

    Rectangle(){

    }
    Rectangle(float length,float width){
        this.length=length;
        this.width=width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getArea(){
        float area;
        area=getLength()*getWidth();
        return  area;
    }

    public float getPerimetr(){
        float perimetr;
        perimetr=getLength()+getWidth();
        return perimetr;
    }

    @Override
    public String toString() {
        return "Rectangle[ length="+ getLength()+" , width="+ getWidth()+" ]";
    }

    public static void main(String[] args) {
        System.out.println("getArea() и getPerimetr() должны вычислять соответствующие величины, для прямоугольника.");
        Rectangle rec=new Rectangle();
        System.out.println("Area: "+ rec.getArea());
        System.out.println("Perimetr: "+ rec.getPerimetr());
    }
}
