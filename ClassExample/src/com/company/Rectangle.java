package com.company;

public class Rectangle {

    private double length;
    private double width;

//    public Rectangle(double length, double width){
//
//        this.length = length;
//        this.width = width;
//
//    }

    public Rectangle(){

    }

    public double area(){

        return  length * width ;

    }

    public double perimeter(){

        return 2 * length + 2 * width;
    }

    public double getLength(){

        return length;
    }

    public void setLength(double length){

        this.length = length;
    }




}
