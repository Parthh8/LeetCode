class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int ast : asteroids) {
            boolean destroyed = false;

            while (!st.isEmpty() && st.peek() > 0 && ast < 0) {
                if (st.peek() < -ast) {
                    st.pop();
                } 
                else if (st.peek() == -ast) {
                    st.pop();
                    destroyed = true;
                    break;
                } 
                else {
                    destroyed = true;
                    break;
                }
            }


            if (!destroyed) {
                st.push(ast);
            }
        }

        int[] result = new int[st.size()];

        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = st.pop();
        }

        return result;
    }
}