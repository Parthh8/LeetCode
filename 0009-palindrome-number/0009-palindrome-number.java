class Solution {
    public static boolean isPalindrome(int num) 
    {
        int og = num;
        int rev = 0;

        while(num > 0)
        {
            int lastdig = num % 10;
            rev = rev * 10 + lastdig;
            num/=10;
        }

        return og == rev;

    }    
}