package day19_arraysIntro;

import java.text.DecimalFormat;

public class DecimalFormatPractice {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.000");

        double n1 = 10.58787654;

        System.out.println( df.format(n1) );



    }
}
