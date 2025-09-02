import java.util.*;
import java.io.*;
public class BJ5430 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();
        for(int i = 0; i<T; i++){
            StringBuilder sb = new StringBuilder();
            String command = br.readLine();
            sb.append(command);
            int n = Integer.parseInt(br.readLine());
            String input = br.readLine();
            String digit[] = input.replaceAll("[^0-9,]", "").split(",");
            Deque<Integer> deque = new ArrayDeque<>();
            for(String num: digit){
                if(!num.isEmpty()) deque.add(Integer.parseInt(num));
            }
            boolean reverse = false;
            boolean error = false;

            for(int j = 0; j<sb.length(); j++){
                if(sb.charAt(j) == 'R'){
                    reverse = !reverse;
                }
                else if(sb.charAt(j) == 'D'){
                    if(deque.isEmpty()){
                        result.append("error\n");
                        error = true;
                        break;
                    }
                    if(reverse){
                        deque.removeLast();
                    }
                    else{
                        deque.removeFirst();
                    }
                }
            }
            if(!error){
                result.append("[");
                while(!deque.isEmpty()){
                    result.append(reverse ? deque.removeLast() : deque.removeFirst());
                    if(!deque.isEmpty()) result.append(",");
                }
                result.append("]\n");
            }
            
        }
        System.out.println(result);
    }
}
