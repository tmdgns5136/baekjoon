import java.util.*;
import java.io.*;
public class BJ11725 {
    static int parent[];
    static boolean visited[];
    static void DFS(int n, ArrayList<Integer>adj[]){
        visited[n] = true;

        for(int next: adj[n]){ // 인접리스트로 아직 방문하지 않은 것은 n이 next의 부모가 되는것임
            if(!visited[next]){
                parent[next] = n;
                DFS(next, adj);
            }
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer>adj[] = new ArrayList[N+1];
        for(int i = 1; i<=N; i++){
            adj[i] = new ArrayList<>();
        }
        for(int i = 1; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            adj[x].add(y);
            adj[y].add(x);
        }

        parent = new int[N+1];
        visited = new boolean[N+1];

        DFS(1, adj);

        for(int i = 2; i<=N; i++){
            System.out.println(parent[i]);
        }
    }
}
