import java.io.*;
import java.util.*;
public class BJ1269 {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i =0; i<N; i++){
            int a = Integer.parseInt(st.nextToken());
            A.add(a);
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<M; i++){
            int a = Integer.parseInt(st.nextToken());
            if(A.contains(a)){
                A.remove(a);
            } 
            else{
                B.add(a);
            }
        }
        System.out.printf("%d", A.size() + B.size());
    }
}
