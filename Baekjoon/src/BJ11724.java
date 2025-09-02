import java.util.*;
import java.io.*;
public class BJ11724 {
    static void BFS(int start, int visited[], ArrayList<Integer>[]adj){
        Queue<Integer> q= new LinkedList<>();
        q.add(start);
        visited[start] = 1;

        while(!q.isEmpty()){
            int cur = q.poll();
            for(int nxt : adj[cur]){
                if(visited[nxt] == 0){
                    visited[nxt] = 1;
                    q.add(nxt);
                }
            }
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayList<Integer>[]adj = new ArrayList[N+1];
        int visited[] = new int[N+1];
        for(int i =1; i<=N; i++){
            adj[i] = new ArrayList<>();
        }

        for(int i =0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adj[u].add(v);
            adj[v].add(u);
        }

        int components = 0;
        for(int i =1; i<=N; i++){
            if(visited[i] == 0){
                BFS(i, visited, adj);
                components++;
            }
        }
        System.out.println(components);

    }
}
