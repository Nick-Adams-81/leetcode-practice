package Stack;

import java.util.Stack;

public class DailyTemps {
    public int[] dailyTemps(int[] temps) {
        int[] res = new int[temps.length];
        Stack<Integer> stack = new Stack<>();
        for(int i= 0; i < temps.length; i++) {
            while(!stack.isEmpty() && temps[i] > temps[stack.peek()]) {
                Integer topIndex = stack.pop();
                int diff = i - topIndex;
                res[topIndex] = diff;
            }
            stack.push(i);
        }
        while(!stack.isEmpty()) {
            Integer topIndex = stack.pop();
            res[topIndex] = 0;
        }
        return res;
    }
}
