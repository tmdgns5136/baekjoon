import java.util.*;
import java.io.*;
public class BJ11403 {
    static void DFS(int i, int N, int graph[][], int visited[]){
        for(int n =0; n< N; n++){
            if(graph[i][n] == 1 && visited[n] == 0){
                visited[n] = 1;
                DFS(n, N, graph, visited);
            }
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int graph[][] = new int[N][N];
        int result[][] = new int[N][N];
        for(int i =0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j =0; j<N; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i =0; i<N; i++){
            int visited[] = new int[N];
            DFS(i, N, graph, visited);
            for(int j =0; j<N; j++){
                if(visited[j] == 1) result[i][j] = 1;
            }
        }

        
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<N; i++){
            for(int j =0; j<N; j++){
                sb.append(result[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
