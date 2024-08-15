package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParentheses {

    public List<String> generateParentheses(int n) {
        List<String> res = new ArrayList<>();
        Stack<Character> stack = new Stack<>();
        backtrack(n, 0, 0, stack, res);
        return res;
    }

    private void backtrack(int n, int open, int close, Stack<Character> stack, List<String> res) {
        if(open == close && open == n) {
            StringBuilder sb = new StringBuilder();
            for(char c : stack) {
                sb.append(c);
            }
            res.add(sb.toString());
            return;
        }
        if(open < n) {
            stack.push('(');
            backtrack(n, open + 1, close, stack, res);
            stack.pop();
        }
        if(close < open) {
            stack.push(')');
            backtrack(n, open, close + 1, stack, res);
            stack.pop();
        }
    }
}
