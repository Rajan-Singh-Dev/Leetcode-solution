class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //create a set of number from 1 to size of array
        Set<Integer> fullset = new HashSet<>();
        for(int i=1; i<=nums.length; i++){
            fullset.add(i);
        }

        //Remove all number present in the array
        for(int arr : nums){
            fullset.remove(arr);
        }

        // convert set to sorted list
        List<Integer> missing = new ArrayList<>(fullset);
        Collections.sort(missing);
        return missing;

        
    }
}