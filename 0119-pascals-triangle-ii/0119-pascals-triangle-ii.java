class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        for(int row=0; row<=rowIndex; row++){
            List<Integer>currentRow = new ArrayList<>();
            currentRow.add(1);

            for(int col = 1; col<row; col++){
                int val = triangle.get(row-1).get(col-1) + triangle.get(row - 1).get(col);
                currentRow.add(val);
            }

            if(row>0){
                currentRow.add(1);
            }
            triangle.add(currentRow);

        }

        return triangle.get(rowIndex);
        
    }
}