class Solution {
    public int fib(int n) {
        if(n<=1)
        {
            return n;
        }

        int one=0;
        int two=1;

        for(int i=2; i<=n; i++)
        {
            int current=one+two;
            one=two;
            two=current;
        }

        return two;
    }
}