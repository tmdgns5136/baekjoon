import java.io.*;
import java.util.*;
public class BJ14425 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        HashSet<String> set = new HashSet<>();
        for(int i =0; i<N; i++){
            set.add(br.readLine());
        }
        for(int i =0; i<M; i++){
            String s = br.readLine();
            if(set.contains(s)){
                sum+=1;
            }
        }
        System.out.println(sum);
    }
}
