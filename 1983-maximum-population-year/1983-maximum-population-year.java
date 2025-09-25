class Solution {
    public int maximumPopulation(int[][] logs) {
        //Constraint: year are between 1950 and 2050
        int[] populationChange = new int[101];
        //index 0 = 1950, index 100 = 2050

        //step 1: Apply changes (+1 at birth, -1 at death)
        for(int[] log : logs){
            int birth = log[0], death = log[1];
            populationChange[birth - 1950] += 1;
            populationChange[death - 1950] -= 1;
        }

        //Step 2: Sweep through years, track running population
        int maxPopulation = 0;
        int year = 1950;
        int currentPopulation = 0;

        for(int i = 0;  i < 101; i++){
            currentPopulation += populationChange[i];
            if(currentPopulation > maxPopulation){
                maxPopulation = currentPopulation;
                year = 1950 + i; // convert index back to actual year
            }
        }
        return year;
    }
}