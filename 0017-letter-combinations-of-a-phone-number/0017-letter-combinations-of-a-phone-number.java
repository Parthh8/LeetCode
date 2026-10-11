class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();

        if (digits.length() == 0) {
            return res;
        }

        String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        backtrack(digits, 0, "", res, map);
        return res;
    }

    private void backtrack(String digits, int index, String current, List<String> res, String[] map) 
    {

        if (index == digits.length()) {
            res.add(current);
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for (char ch : letters.toCharArray()) {
            backtrack(digits, index + 1, current + ch, res, map);
        }
    }
}