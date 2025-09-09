// 줄 세우기(골드 3)
// 위상정렬 알고리즘(khan) - indegree가 0인 걸 queue에 add 
// 연결된 indegree - 1 모든 노드가 없어질 때까지 반복
import java.util.*;
import java.io.*;
public class BJ2252 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        LinkedList<Integer> adj[] = new LinkedList[N+1];
        Queue<Integer>q = new LinkedList<>();
        for(int i = 0; i<=N; i++){
            adj[i] = new LinkedList<>();
        }
        int indegree[] = new int[N+1];
        for(int i =0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adj[a].add(b);
            indegree[b] += 1;
        }
        for(int i = 1; i<=N; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!q.isEmpty()){
            int v = q.poll();
            sb.append(v + " ");
            for(int node : adj[v]){
                indegree[node]-=1;
                if(indegree[node] == 0){
                    q.add(node);
                }
                node += 1;
            }
        }
        System.out.println(sb);
    }
}
