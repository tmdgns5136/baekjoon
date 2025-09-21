// N과 M(9)(실버2)
// 백트래킹
import java.io.*;
import java.util.*;
public class BJ15663 {
    static int N,M,last;
    static int arr[],visited[], comb[]; 
    static StringBuilder sb = new StringBuilder();
    static void DFS(int count){
        if(count == M){
            for(int i = 0; i<M; i++){
                sb.append(comb[i] + " ");
            }
            sb.append("\n");
            return;
        }
        last = -1;
        for(int i = 0; i < N; i++){
            if(visited[i] == 0 && arr[i] != last){
                visited[i] = 1;
                int j = arr[i];
                comb[count] = j;
                DFS(count+1);
                visited[i] = 0;
                last = j;
            }
            
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        comb = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        visited = new int[10001];
        DFS(0);
        System.out.print(sb);

    }
}
