class Solution {
    public int thirdMax(int[] nums) {

        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for(int num : nums){
            set.add(num);
        }   

        //if there are at least 3 distinct number are present, get third one
        if(set.size() >= 3){
            Iterator<Integer> it = set.iterator();
            it.next(); // first max
            it.next(); // second max
            return it.next(); // third max
        }else{
            //otherwise return maximum
            return set.first();
        }
        
    }
}