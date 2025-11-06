import java.util.*;
public class BJ4949 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            String s = sc.nextLine();
            if(s.equals(".")){
                break;
            }

            Stack<Character> stack = new Stack<>();
            boolean balance = true;

            StringBuilder sb = new StringBuilder();
            sb.append(s);
            for(int i = 0; i<sb.length(); i++){
                if(sb.charAt(i) == '(' || sb.charAt(i) == '['){
                    stack.push(sb.charAt(i));
                }
                else if(sb.charAt(i) == ')'){
                    if(stack.isEmpty() || stack.peek() != '('){
                        balance = false;
                        break;
                    }
                    stack.pop();
                }
                else if(sb.charAt(i) == ']'){
                    if(stack.isEmpty() || stack.peek() != '['){
                        balance = false;
                        break;
                    }
                    stack.pop();
                }
            }
             if(!stack.isEmpty()){
                    balance = false;
                }
             System.out.println(balance ? "yes" : "no");
        }
        sc.close();
    }
}
