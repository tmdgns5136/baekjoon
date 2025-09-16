// N과 M(1)(실버3)
// 백트래킹
import java.io.*;
import java.util.StringTokenizer;
public class BJ15649 {
    static int N, M;
    static int visited[], arr[];
    static void DFS(int count){
        if(count == M){
           for(int i = 0; i<M; i++){
                System.out.print(arr[i] + " ");
           }
           System.out.println();
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
    static void array(){
        for(int i = 1; i<=N; i++){
            if(visited[i] == 1){
                System.out.printf("%d ", i);
            }
        }
        System.out.println("");
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new int[N+1];
        arr = new int[M];
        DFS(0);
    }
}
