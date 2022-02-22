//program to find biggest number
import java.util.Scanner;
public class biggest_num {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner (System.in);
        System.out.println("enter number1:");
        int a = sc.nextInt();
        System.out.println("enter number 2:");
        int b = sc.nextInt();
        System.out.println("enter number 3:");
        int c = sc.nextInt();
        int d = ((a>b && a>c)?a:(b>c)?b:c);
        System.out.println("biggest number"+d);
    
        
        
        
	}

}
