import java.io.*;
import java.util.*;
public class BJ11286 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Comparator<Integer>custom = (a,b) -> {
            if(Math.abs(a) == Math.abs(b)){
                return a-b;
            }
            else{
                return Math.abs(a) - Math.abs(b);
            }
        };
        PriorityQueue<Integer>arr = new PriorityQueue<>(custom);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<N; i++){
            int x = Integer.parseInt(br.readLine());
            if(x == 0){
                if(arr.size() == 0){
                    sb.append(0).append("\n");
                }
                else{
                    sb.append(arr.poll()).append("\n");
                }
            }
            else{
                arr.add(x);
            }
    
        }
        System.out.println(sb);
    }
}
