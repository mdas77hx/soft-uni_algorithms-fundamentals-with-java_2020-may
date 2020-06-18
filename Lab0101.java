import java.util.Scanner;

public class Lab0101{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String[] input = sc.nextLine().split(" ");
		
		int[] numbers = new int[input.length];
		
		for(int i = 0; i < input.length; i++){
			numbers[i] = Integer.parseInt(input[i]);
		}
		
		int sum = sumNumbers(numbers, 0);
		
		System.out.println(sum);
	}
	
	public static int sumNumbers(int[] arr, int index){
		
		if(index >= arr.length){
			return 0;
		}
		return arr[index] + sumNumbers(arr, index + 1);
	}
}