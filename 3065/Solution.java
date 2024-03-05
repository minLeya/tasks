// HAVE TO OPTIMIZE THIS VERSION

class Solution {
    public int minOperations(int[] nums, int k) {
        int numberOfOperations = 0;
        int index = -1;
        var numsArray = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++) {
            numsArray.add(nums[i]);
        }

        boolean flag = true;

        while(flag)
        {
            for (int i = 0; i < numsArray.size() - 1; i++) {
                if (numsArray.get(i) < k)
                    index = i;
                else
                    index = -1;
            }

            if (index == -1) {
                flag = false;
            }

            else {
                for (int j = 0; j < numsArray.size() - 1; j++) {
                    if (j == index)
                    {
                        numsArray.remove(j);
                        numberOfOperations++;
                    }
                    else
                        continue;
                }
            }
        }
        return numberOfOperations;
    }
}
