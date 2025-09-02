import java.util.*;
import java.io.*;
public class BJ18110 {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N == 0){
            System.out.println(0);
        }
        else{
            List<Integer>arr = new ArrayList<>();
            for(int i = 0; i<N; i++){
                int a = Integer.parseInt(br.readLine());
                arr.add(a);
             }
            arr.sort(null);
            double avg = Math.round(N * 0.15);
            int sum = 0;
            for(int i = (int)avg; i<N-(int)avg; i++){
                sum += arr.get(i);
            }
            System.out.println((int)Math.round(sum/(N-2*avg)));
        }
    }
}
