import java.util.*;
import java.io.*;
public class BJ1260 {
    static ArrayList<Integer> graph[];
    static void DFS(int v, int visited[]){
        visited[v] = 1;
        System.out.print(v + " ");
        for (int next: graph[v]){
            if(visited[next] == 0){
                DFS(next, visited);
            }
        }
    }

    static void BFS(int v, int visited[]){
        Queue<Integer> q = new LinkedList<>();
        visited[v] = 1;
        q.add(v);

        while(!q.isEmpty()){
            int n = q.poll();
            System.out.print(n + " ");
            for(int next : graph[n]){
                if(visited[next] == 0){
                    visited[next] = 1;
                    q.add(next);
                }
            }
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        
        graph = new ArrayList[N+1];
        for(int i = 1; i<=N; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        for(int i = 1; i<=N; i++){
            Collections.sort(graph[i]);
        }
        int visited[] = new int[N+1];
        DFS(V, visited);
        System.out.println();
        visited = new int[N+1];
        BFS(V, visited);
    }
}
