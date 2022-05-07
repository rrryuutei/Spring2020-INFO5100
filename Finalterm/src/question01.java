import java.util.Stack;

public class question01 {
    /*
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    An input string is valid if:
    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
     */

    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length();i++){
                if (s.charAt(i) == '('){
                    stack.push('(');
                } else if(s.charAt(i) == '[') {
                    stack.push('[');
                } else if(s.charAt(i) == '{') {
                    stack.push('{');
                } else if(s.charAt(i) == ')') {
                    if(stack.empty() || stack.pop() != '(') return false;
                } else if(s.charAt(i) == ']') {
                    if(stack.empty() || stack.pop() != '[') return false;
                } else {
                    if(stack.empty() || stack.pop() != '{') return false;
                }
            }
            return stack.empty();
    }

}
