import java.util.Scanner;

public class Lab0102{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		int number = Integer.parseInt(input);
		
		printFigure(number);
	}
	
	public static String draw(String patt, int rep){ // first method using recursion
		
		if(rep == 0){
			return "";
		}
		return patt + draw(patt, rep - 1);
	}
	
	public static void printFigure(int n){         //second method using recursion
		if(n == 0){
			return;
		}
		
		String str1 = draw("*",n);
		String str2 = draw("#",n);
		  
		System.out.println(str1);
		printFigure(n - 1);
		System.out.println(str2);
		
	}
}