package unit_9;

import java.lang.Math;
public class Math_test {
    public static void main(String[] args) {
        //absolute value
        int value1 =-10;
        System.out.println("The absolute value="+Math.abs(value1));
        //acos asin atan
        //value with be Nan (not a number) if >1

        double value2 = 0.5;
        System.out.println("The arc cosine of "+value2+" is: "+Math.acos(value2));
        System.out.println("The arc sine of "+value2+" is: "+Math.asin(value2));
        System.out.println("The arc tangent of "+value2+" is: "+Math.atan(value2));

        // square root cube root
        System.out.println("Square root of 16 is: "+Math.sqrt(16));
        System.out.println("Cube root of 27 is: "+Math.cbrt(27));

        //floor and ceil
        double value3 = 3.7;
        System.out.println("The floor of "+value3+" is: "+Math.floor(value3));
        System.out.println("The ceiling of "+value3+" is: "+Math.ceil(value3));


    }
}