import java.io.*;
import java.util.*;
public class BJ10816 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer>arr = new HashMap<>();
        StringTokenizer st= new StringTokenizer(br.readLine());
        for(int i =0; i<N; i++){
            int a = Integer.parseInt(st.nextToken());
            arr.put(a, arr.getOrDefault(a, 0) + 1);
        }
        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for(int i =0; i<M; i++){
            int a = Integer.parseInt(st.nextToken());
            sb.append(arr.getOrDefault(a,0)).append(' ');
        }
        System.out.println(sb);
    }
}
