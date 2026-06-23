class Solution {
    public static int missingNumber(int[] n) {
        int diff=0, sum=0;
        Arrays.sort(n);

        int expected_sum = n.length*(n.length+1)/2;
        int actualsum = 0;
        
        for(int i=0; i<n.length; i++)
        {
            actualsum=actualsum+n[i];
        }
        return expected_sum - actualsum;
    }
}