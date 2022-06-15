import java.util.Stack;

public class StringReverse {
    
    public static String reverse(String exp){
        Stack<Character> res=new Stack<Character>();

        if(exp==null || exp.length()==0){
            return "Empty String";
        }
        else{
            for(int i=0;i<exp.length();i++){
                res.push(exp.charAt(i));
            }
        }
        String result="";
        for(int i=0;i<exp.length();i++){
            result+=res.peek();
            res.pop();
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(reverse("Vaishnavi"));
    }
}
