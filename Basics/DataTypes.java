package Basics;

import org.w3c.dom.ls.LSOutput;

public class DataTypes {
    static void main() {

        //Numeric Data Type
        byte num1 = 100;
        System.out.println(num1);
        short num2 = 5000;
        System.out.println(num2);

        int num3 = 50000;
        long num4 = 354254662;
        System.out.println(num3);
        System.out.println(num4);

        //Floating Datatype

        float num5 = 3.14246535763f;
        System.out.println(num5);
        double num6 = 3.143462477275275264;
        System.out.println(num6);

        //others - Char, Boolean

        boolean eligiableTOVote = true;
        System.out.println(eligiableTOVote);
        char firstCharacter = 'a';
        System.out.println((char)(firstCharacter+2));


        //Implicit Conversion
        int a = 10;
        double d =a;
        System.out.println(d);

        //Explicit Conversion

        double b = 10.00;
        int x = (int)b;
        System.out.println(x);

    }




}
