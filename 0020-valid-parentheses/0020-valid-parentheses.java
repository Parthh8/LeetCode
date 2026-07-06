class Solution {
    public boolean isValid(String s) {
        // Stack <Character> stack =  new Stack<>();

        // char top=-1;
        // for(int i=0; i<=top; i++)
        // {
        //     if(stack.charAt(i)=='(' && top==')' || stack.charAt(i)=='[' && top == ']' || stack.charAt(i)=='{' && top == '}')
        //     {
        //         stack.push(i);
        //         top++;
        //     }
        //     else
        //     {
        //         return false;
        //         // i++;
        //     }
        // }






        Stack <Character> stack =  new Stack<>();

        for(char ch: s.toCharArray())
        {
            if (ch =='(' || ch =='[' || ch =='{')
            {
                stack.push(ch);
            }
            else
            {
                if(stack.isEmpty())
                {
                    return false;
                }

                char top=stack.pop();
                if((ch==')' && top!='(')||
                (ch=='}' && top!='{') ||
                (ch==']' && top!='['))
                {
                    return false;
                }
            }
        }
        return stack.isEmpty();

     }
}