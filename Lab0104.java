import java.util.Scanner;

public class Lab0104{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		
		long fact = calculateFactorial(n);
		
		System.out.println(fact);
	}
	private static long calculateFactorial(int num){
		if(num == 1){
			return 1;
		}
		return num *  calculateFactorial(num - 1);
	}
}