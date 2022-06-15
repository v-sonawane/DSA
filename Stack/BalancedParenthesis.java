import java.util.Stack;

public class BalancedParenthesis {
    public static boolean isBalanced(String expression){
        Stack<Character> stack= new Stack<Character>();
        if(expression==null || expression.length()==0){
            return false;
        }
        else{
            for(int i=0;i<expression.length();i++){
                if(expression.charAt(i)=='{' || expression.charAt(i)=='(' || expression.charAt(i)=='['){
                    stack.push(expression.charAt(i));
                }
                else if(expression.charAt(i)==')'){
                    if(!stack.isEmpty() && stack.peek()=='('){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
                else if(expression.charAt(i)=='}'){
                    if(!stack.isEmpty() && stack.peek()=='{'){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
                else if(expression.charAt(i)==']'){
                    if(!stack.isEmpty() && stack.peek()=='['){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        
        if(stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    }

    public static void main(String[] args){
        String exp1 = "[3+(4-9)]";
        System.out.println("Expression " + exp1 + " isBalance : " + isBalanced(exp1));
        String exp2 = "(3+45-({4[3-5+3/4]-9)}}]";
        System.out.println("Expression " + exp2 + " isBalance : " + isBalanced(exp2));
        String exp3 = "((a+b)+[c-d])";
        System.out.println("Expression " + exp3 + " isBalance : " + isBalanced(exp3));
    }
    
}
