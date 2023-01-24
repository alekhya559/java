package basics;
import java.util.*;

public class table {

	public static void main(String[] args) {
		//Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number :");
         int n = sc.nextInt();
         for(int i=1;i<=10;i++) {
        	 System.out.println(n +" * " + i + " = " + n*i ); 
         }
         sc.close();
	}

}
