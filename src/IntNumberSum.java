import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntNumberSum {
	
	static Scanner sc = new Scanner (System.in);
	
	public static List<int[]> findpairs(int[] numbers, int targetSum){
		List<int[]> pairs = new ArrayList<>();
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] + numbers[j] == targetSum) {
					pairs.add(new int [] { numbers[i], numbers[j]});
				}
			}
		}
		return pairs;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		System.out.println("Enter the required Sum that is not bigger than 10:");
		int targetSum = sc.nextInt();
		System.out.println("\n");

		List<int[]> pairs = findpairs(numbers, targetSum);
		for (int[] pair : pairs) {
			System.out.println("First Number is: " + pair[0] + " , " + "Second Number is: " + pair[1]);
		}
		
	}

}
