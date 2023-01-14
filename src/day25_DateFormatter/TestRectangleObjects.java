package day25_DateFormatter;

public class TestRectangleObjects {
    public static void main(String[] args) {

        /*
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setInfo(2.2, 3.8);

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setInfo(3.2, 3.7);

        Rectangle rectangle3 = new Rectangle();
        rectangle3.setInfo(4.2, 3.6);

        Rectangle rectangle4 = new Rectangle();
        rectangle4.setInfo(5.2, 3.5);

        Rectangle rectangle5 = new Rectangle();
        rectangle5.setInfo(6.2, 3.4);

        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);
        System.out.println(rectangle4);
        System.out.println(rectangle5);

 */

        // by creating constructor , we require user to enter 2 arguments of length and width

        Rectangle rec1 = new Rectangle(3.2,5.4);
        System.out.println(rec1);

        Rectangle rec2 = new Rectangle(2,3);
        System.out.println(rec2);

        Rectangle rec3 = new Rectangle(7,8);
        System.out.println(rec3);

        Rectangle rec4 = new Rectangle(6,1);
        System.out.println(rec4);

        Rectangle rec5 = new Rectangle(1.1,2.2);
        System.out.println(rec5);



    }


}
