package leetcode283;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		MoveZeroesToEndFunction solution = new MoveZeroesToEndFunction();
		
		solution.moveZeroes(nums);
		
		System.out.println("Solution: " + Arrays.toString(nums));
	}
}
