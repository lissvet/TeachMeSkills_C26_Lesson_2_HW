import java.util.Scanner;

public class TaskOne {

    public static void main (String[] args){
        System.out.println("Let's do the math: a=4*(b+c-1)/2");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the variable b:");
        int b = scan.nextInt();
        System.out.println("Enter the variable c:");
        int c = scan.nextInt();
        int a = 4*(b+c-1)/2;
        System.out.println("Result: " + a);
    }

}
