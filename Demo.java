package pack1;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        int n = (int)(Math.random() * 100) + 1;
        Scanner sc = new Scanner(System.in);
        int i;
        int a;
        for (i = 1; ; i++) {
            System.out.println("Guess a number or enter a negative number to end: ");
            a = sc.nextInt();
            if (a > 0) {
            
            	if (a == n) {
            		System.out.println("Your guess is correct! It took you " + i + " trials.");
            		break;
            	} else if (n > a) {
            		System.out.println("Number is greater than " + a);
            	} else {
            		System.out.println("Number is less than " + a);
            	}
            }
            else if (a<0) {
            	System.out.println("Game over.");
            	break;}
            
        }}

}
