import java.util.Scanner;

public class Lab0103 
{
    public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] binary = new int[n];
		gen01(0,binary);
		
    }
	
	private static void gen01(int index, int[] vector) {
		if (index >= vector.length) {		
			print(vector);
		} else {
			for (int i = 0; i <= 1; i++) {
				vector[index] = i;
				gen01(index + 1, vector);
			}
		}
	}
	
	private static void print(int[] nums){
			for(int i = 0; i < nums.length; i++){
				System.out.print(nums[i]);
			}
			System.out.println();
	}
}