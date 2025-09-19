class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;

        // traverse the array 
        for(int num : nums){
            if(num == 1){
                currentCount++; //increment current count for consecutive number
            }
            else{
                // when a 0 is encountered, update the maxcount
                maxCount = Math.max(maxCount, currentCount);
                currentCount = 0;
            }
        }
        //final check in case the array ebds with consecutive 1s
        return Math.max(maxCount, currentCount);
        
    }
}