// N과 M(4)(실버3)
// 백트래킹
import java.io.*;
import java.util.*;

public class BJ15652{
    static int N,M;
    static int arr[];
    static StringBuilder sb = new StringBuilder();
    static void DFS(int count){
        if(count == M){
            for(int i = 0; i<M; i++){
                sb.append(arr[i] + " ");
            }
            sb.append("\n");
            return;
        }
        for(int i = 1; i<=N; i++){
            if(count == 0) {
                arr[count] = i;
                DFS(count+1);
            }
            else{
                if(arr[count-1] <= i){
                    arr[count] = i;
                    DFS(count+1);
                }
            }
            

        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        DFS(0);
        System.out.println(sb);
    }
}