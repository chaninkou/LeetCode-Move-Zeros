package leetcode283;

import java.util.Arrays;

public class MoveZeroesToEndFunction {
    public void moveZeroes(int[] nums) {
    	// We want to put everything on the left first
        int index = 0;
        
        // Insert the non zero number by checking and increase index position
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[index] = nums[i];
                
                index++;
            }
        }
        
        // Insert the zeros at the end now starting off from index
        while(index < nums.length){
            nums[index] = 0;
            index++;
        }
    }
}
