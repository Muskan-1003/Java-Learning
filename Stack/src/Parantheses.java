import java.util.Stack;

class Parantheses {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (ch == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(ch); // Push ')' onto the stack
                }
            } else {
                stack.push(ch); // Push '(' onto the stack
            }
        }
        
        return stack.size();
    }
}
