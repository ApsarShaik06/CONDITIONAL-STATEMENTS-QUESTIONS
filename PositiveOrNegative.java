import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        //Write a Java program to get a number from the user and print whether it is positive or negative.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if(n > 0){
            System.out.println("Given number is Positive number.");
        } else {
            System.out.println("Given number is Negative number.");
        }
    }
}
