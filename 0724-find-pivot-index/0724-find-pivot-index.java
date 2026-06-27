class Solution {
    public static int pivotIndex(int[] nums) {
        int totalSum = 0;

        for(int i=0;i<nums.length;i++)
        {
            totalSum=totalSum+nums[i];
        }

        int leftSum=0;
        int rightSum=totalSum;

        for(int i=0;i<nums.length;i++)
        {
            rightSum=rightSum-nums[i];

            if(rightSum==leftSum)
            {
                return i;
            }

            leftSum=leftSum+nums[i];
        }

        return -1;
    }
}