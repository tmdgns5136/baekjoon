// 모든 순열(실버3)
// 백트래킹
import java.io.*;
public class BJ10974 {
    static int N;
    static int arr[], visited[];
    static StringBuilder sb = new StringBuilder();
    static void DFS(int count){
        if(count == N){
            for(int i = 0; i<N; i++){
                sb.append(arr[i] + " ");
            }
            sb.append("\n");
            return;
        }
        for(int i = 1; i<=N; i++){
            if(visited[i] == 0){
                visited[i] = 1;
                arr[count] = i;
                DFS(count+1);
                visited[i] = 0;
            }
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        visited = new int[N+1];
        DFS(0);
        System.out.print(sb);
    }
}
