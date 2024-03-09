//accepted
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        var commonNums = new ArrayList<Integer>();

        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++)
            {
                if(nums1[i] == nums2[j])
                    commonNums.add(nums1[i]);
            }
        }

        Collections.sort(commonNums);
        return commonNums.get(0);

    }
}
