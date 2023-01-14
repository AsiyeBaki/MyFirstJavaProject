package day25_DateFormatter;

public class Rectangle {

    public double length, width;

    /*
    public void setInfo(double length, double width) {
        this.length = length;
        this.width = width;
    }
     */

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }


    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area="+area()+
                '}';
    }




}
