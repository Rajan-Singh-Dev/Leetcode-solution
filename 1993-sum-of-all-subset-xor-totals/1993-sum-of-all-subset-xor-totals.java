class Solution {
    public int subsetXORSum(int[] nums) {
        int orVal = 0;
        for(int num : nums){
            orVal |= num;
        }
        //multiply vy2^(n-1)

        return orVal * (1 << (nums.length - 1));
    }
}