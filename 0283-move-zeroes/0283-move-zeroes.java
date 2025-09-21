class Solution {
    public void moveZeroes(int[] nums) {
        int insertNonZero = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[insertNonZero] = nums[i];
                insertNonZero++;
            }
        }

        for(int i = insertNonZero; i < nums.length; i++){
            nums[i] = 0;
        }
        
    }
}