class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        //Iterate over each bit (0 to 31)
        for(int i = 0; i < 32; i++){
            int bitSum = 0;

            for(int num : nums){
                //Check if the i - th bit is set
                if((num >> i & 1) == 1){
                    bitSum++;
                }
            }

            //if the bitSum is not multiple of 3 the unique number has this bit set
            if(bitSum % 3 != 0){
                result |= (1 << i);
            }
        }
        return result;
        
    }
}