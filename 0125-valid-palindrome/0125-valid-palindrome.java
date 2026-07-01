class Solution {
    public boolean isPalindrome(String s) 
    {
        int l = 0, r = s.length() - 1;

        while (l < r) 
        {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) l++;
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) r--;

            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
                return false;

            l++;
            r--;
        }
        return true;



        // String res="";
		
		// for(int i=s.length()-1; i>=0; i--)
		// {
		// 	res+=s.charAt(i);
		// }
		
		// if(s.equals(res)) {
		// 	return true;
		// }
		// else
		// {
		// 	return false;
		// }
    }
}