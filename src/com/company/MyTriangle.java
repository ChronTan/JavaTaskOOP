package com.company;

public class MyTriangle extends MyPoint {

    MyPoint v1;
    MyPoint v2;
    MyPoint v3;

    public MyTriangle( MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        this.v1.setX(x1);
        this.v1.setY(y1);
        this.v1.setX(x2);
        this.v1.setY(y2);
        this.v1.setX(x3);
        this.v1.setY(y3);
    }

    @Override
    public String toString() {
        return "My Triangle[ v1=("+v1.getX()+","+v1.getY()+")," +
                "v2=("+v2.getX()+","+v2.getY()+")," +
                "v3=("+v3.getX()+","+v3.getY()+")] ";
    }
    public double getPerimetr(){
        double perimetr;
        perimetr=v1.distance()+v2.distance()+v3.distance();
        return perimetr;
    }

    public String getType(){
        String type="";
        if(v1.distance()==v2.distance()){
            if(v1.distance()==v3.distance()){
                type="Equilateral";
            }else{
                type="Isosceles";
            }
        }else{
            type="Scalene";
        }
        return type;
    }

    public static void main(String[] args) {
        System.out.println("getPerimetr() вычисляет периметр суммируя MyPoint distance() для трёх сторон треугольника.\n" +
                "getType() возвращает тип треугольника, в зависимости от соотношения длин сторон.\n" +
                "Вспоминаем школьный курс геометрии.\n");
    }
}
