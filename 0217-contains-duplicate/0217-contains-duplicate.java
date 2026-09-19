class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        // HashSet<Integer> set = new HashSet<>();

        // for(int num : nums)
        // {
        //     if(set.contains(num))
        //     {
        //         return true;
        //     }
            
        //     // If any duplicate, then removed while adding.
        //     set.add(num);  
        // }
        // return false;

        HashSet <Integer> st = new HashSet<>();

        for(int num : nums)
        {
            if(st.contains(num))
            {
                return true;
            }
            st.add(num);
        }
        return false;

    }
}