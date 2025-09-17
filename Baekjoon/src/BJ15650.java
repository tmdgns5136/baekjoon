// N과 M(2)(실버3)
// 백트래킹
import java.io.*;
import java.util.*;
public class BJ15650 {
    static int N,M;
    static int visited[], arr[];
    static void DFS(int index, int count){
        if(count == M){
            for(int i = 0; i<M; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i = index; i<=N; i++){
            if(visited[i] == 0){
                visited[i] = 1;
                arr[count] = i;
                DFS(i+1, count+1);
                visited[i] = 0;
            }
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new int[N+1];
        arr = new int[N];
        DFS(1,0);
    }
}
