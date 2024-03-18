/*Aim:-PracticalNO2
Author:-Anisha Bobade 
Version:-2.0
Date:-06 Feb 2024
*/


import java.util.Scanner;
public class PracticalNo2 {
       public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter the radius of the Circle :-");
              double radius= s.nextDouble();
       
if(radius<=0)
 {
  System.out.println("please enter non zero positive number ");
 }
else
{
  double perimeter = 2 * Math.PI * radius;
  double area = Math.PI * radius * radius;

 System.out.println("perimeter of the Circle :-"+ perimeter);
 System.out.println("Area of the Circle :-" + area);
}
 }
}