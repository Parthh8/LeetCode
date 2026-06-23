class Solution {
    public static boolean isHappy(int n) 
    {

        int nn = n;
        do{
            n=digitSqSum(n);
            nn=digitSqSum(digitSqSum(nn));
        }

        while(n!=nn);
    
            return n==1;   
    
    }
    public static int digitSqSum(int n)
    {
        int sum = 0;
        while(n>0)
        {
            int lastdig = n % 10;
            sum = sum+(lastdig * lastdig);
            n=n/10;
        }

        return sum;
    }
}