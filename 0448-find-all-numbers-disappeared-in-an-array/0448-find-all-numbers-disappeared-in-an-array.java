class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //1. sort the array
        Arrays.sort(nums);

        List<Integer> missing = new ArrayList<>();
        int j=0;

        // iterate from 1 to length of array
        for(int i=1; i<=nums.length; i++){
            //skip duplicate in array
            while(j<nums.length - 1 && nums[j] == nums[j+1]){
                j++;
            }
            // if array is not exhausted and cuurent array value matches i
            if(j<nums.length && nums[j] == i){
                j++;// move to next element in array
            }else{
                //i is not found in the array store it in missing
                missing.add(i);
            }
        
        }
        return missing;
    }
}