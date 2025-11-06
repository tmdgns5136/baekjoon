import java.io.*;
import java.util.*;
public class BJ1920 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<Integer> arr = new HashSet<>();
        for(int i = 0; i<N; i++){
            int a = Integer.parseInt(st.nextToken());
            arr.add(a);
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i =0; i<M; i++){
            int a = Integer.parseInt(st.nextToken());
            if(arr.contains(a)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}
