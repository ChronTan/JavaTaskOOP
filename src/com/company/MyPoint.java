package com.company;

import static java.lang.Math.pow;

public class MyPoint {

    private int x=0;
    private int y=0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public int[] getXY(){
        int[] mas={x,y};
        return mas;
    }
    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return
                "(" + x +
                ", )" + y;
    }

    public double distance(int x, int y){                     //
        double dis;
        dis=Math.sqrt(pow(x-this.x,2)+pow(y-this.y,2));
        return dis;
    }

    public double distance(MyPoint myPoint){
        double dis;
        dis=Math.sqrt(pow(x-myPoint.x,2)+pow(y-myPoint.y,2));
        return dis;
    }

    public double distance(){
        double dis;
        dis=Math.sqrt(pow(x-0,2)+pow(y-0,2));
        return dis;
    }


    public static void main(String[] args) {
        System.out.println("В данном задании  вспоминаем формулу вычисления расстояния между двумя точками на плоскости.\n" +
                " Для вычислений потребуется использовать метод Math.sqrt");
    }
}
