class Solution {
    public int minOperations(int[] nums, int k) {
        int numberOfOperations = 0;

        var numsArray = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < k)
                numberOfOperations++;
            else
                numsArray.add(nums[i]);
        }
        
        return numberOfOperations;
    }
}
