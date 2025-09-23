// 차이를 최대로(실버2)
// 브루트포스, 백트래킹
import java.io.*;
import java.util.*;
public class BJ10819 {
    static int N;
    static int max = -1000000;
    static int arr[], visited[], perm[];
    static void DFS(int count){
        if(count == N){
            max = Math.max(max, sum());
            return;
        }
        for(int i = 0; i<N; i++){
            if(visited[i] == 0){
                visited[i] = 1;
                perm[count] = arr[i];
                DFS(count+1);
                visited[i] = 0;
            }
        }
    }
    static int sum(){
        int total = 0;
        for(int i = 0; i<N-1; i++){
            total += Math.abs(perm[i+1] - perm[i]);
        }
        return total;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        visited = new int[N];
        perm = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        DFS(0);
        System.out.println(max);
        
    }
}
