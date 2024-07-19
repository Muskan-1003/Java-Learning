import java.util.ArrayList;
import java.util.List;

public class GenerateParantheses {

    // Approach-1 (Simple Recursion)
//T.C : O(2n* (2^(2n)) -> Removing constant -> O(n * (2^n))
//S.C : O(2*n) -> Removing constant -> O(n) -> recursion stack space - Max depth of recusion tree
    class Solution {
        public List<String> generateParenthesis(int n) {
            List<String> res = new ArrayList<>();
            generate("", n, 0, res);
            return res;

        }

        public void generate(String curr, int n, int length, List<String> res) {
            if (length == 2 * n) {// _ _ to posiible only ( ) and no. of paranthese will only dececide by 2*n
                if (isValid(curr)) {
                    res.add(curr);
                    return;
                }

            }

            // backtracking template
            curr += "(";
            generate(curr, n, length + 1, res);

            curr = curr.substring(0,curr.length() - 1);

            curr += ")";
            generate(curr, n, length + 1, res);

        }

        public boolean isValid(String str) {
            int balance = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == '(') {
                    balance++;
                } else if (ch == ')') {
                    balance--;
                }
                // Early return if balance is negative
                if (balance < 0) {
                    return false;
                }
            }
            return balance == 0;
        }




        //this is better
        // Approach-2 (Smart Recursion)
//T.C : O(2^n)
//S.C : O(2*n) -> Removing constant -> O(n) -> recursion stack space - Max depth of recusion tree


        class Solution1 {
            private  List<String> result = new ArrayList<>();
            public List<String> generateParenthesis(int n) {
                generate("", n, 0, 0);
                return result;
            }


            // Recursive function to generate parentheses
            private void generate(String curr, int n, int open, int close) {
                if (curr.length() == 2 * n) {

                    result.add(curr);
                    return;
                }

                if (open < n) {
                    curr += '(';
                    generate( curr,n, open + 1, close);
                    curr = curr.substring(0, curr.length() - 1);
                }
                if (close < open) {
                    curr += ')';
                    generate( curr,n, open, close + 1);
                    curr = curr.substring(0, curr.length() - 1);
                }
            }
        }

    }

}
