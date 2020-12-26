//write a java method to compute the average of three numbers


import java.util.Scanner;

public class Assignment {
public static void main(String[]args) {

    Scanner input = new Scanner( System.in );

    System.out.println( "Enter the first number" );
    double side1 = input.nextInt();

    System.out.println( "Enter the second number" );
    double side2 = input.nextInt();

    System.out.println( "Enter the third number" );
    double side3 = input.nextInt();

   System.out.println( "the area of a triangle: " + area( side1,side2,side3 ));


//float area = (side2+side3)/2;

}

    public static  double area(double side1, double side2, double side3){

        double area = 0;

        double s = (side1 + side2 + side3)/2;

    area =  Math.sqrt(s*( s - side1)*(s - side2)*(s - side3));

    return area;

}



}
