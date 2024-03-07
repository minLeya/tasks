//doesn't work

class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        boolean result;

        var nums1 = new ArrayList<Integer>();
        var nums2 = new ArrayList<Integer>();

        nums1.add(nums[0]);
        nums2.add(nums[1]);

        for (int i = 0; i < nums.length - 2; i++)
        {
            if(nums1.get(i) == nums[i+2])
            {
                nums2.add(nums[i+2]);
            }
            else if(nums2.get(i) == nums[i+2])
            {
                nums1.add(nums[i+2]);
            }
        }

        if (nums1.size() == nums2.size())
        {
            result = true;
        }
        else{
            result = false;
        }


        return result;
    }
}
