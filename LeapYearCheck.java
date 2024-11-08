import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
      //Question5:Write a Java program that takes a year from the user and print whether that year is a leap year or not
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a year : ");
     int year = sc.nextInt();
     
     if( year % 4 == 0) {
         if(year % 100 == 0 ){
            if(year % 400 == 0) {
                System.out.println("Leap year");
            } else {
                System.out.println("not a leap year");
            }
         } else {
             System.out.println("Leap year");
         }
     } else {
         System.out.println("not a leap year");
     }
    }
}


--------------------------------------------
/*
Advance Solution:

import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
      //Question5:Write a Java program that takes a year from the user and print whether that year is a leap year or not
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a year : ");
     int year = sc.nextInt();
     
     boolean x = (year % 4) == 0;
     boolean y = (year % 100) != 0;
     boolean z = (((year % 100) == 0) && ((year % 400) == 0));
     
     if( x && (y || z)){
         System.out.println(year + " is a leap year");
     } else {
         System.out.println(year + " is not a leap year");
     }
    }
}


*/
