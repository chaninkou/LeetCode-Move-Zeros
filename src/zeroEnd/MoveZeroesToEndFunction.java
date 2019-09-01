package zeroEnd;

import java.util.Arrays;

public class MoveZeroesToEndFunction {
    public void moveZeroes(int[] nums) {
        int index = 0;
        
        // Insert the non zero number first
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[index++] = nums[i];
            }
        }
        
        // Insert the zeros now
        while(index < nums.length){
            nums[index++] = 0;
        }
        
        System.out.println("Solution: " + Arrays.toString(nums));
    }
}
