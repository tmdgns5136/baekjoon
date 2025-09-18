// N과 M(5)(실버3)
// 백트래킹
import java.io.*;
import java.util.*;
public class BJ15654 {
    static int N,M;
    static int arr1[], arr2[], visited[];
    static StringBuilder sb = new StringBuilder();
    static void DFS(int count){
        if(count == M){
            for(int i = 0; i<M; i++){
                sb.append(arr1[i] + " ");
            }
            sb.append("\n");
            return;
        }
        for(int i = 1; i<=N; i++){
            int j = arr2[i];
            if(visited[j] == 0){
                visited[j] = 1;
                arr1[count] = j;
                DFS(count+1);
                visited[j] = 0; 
            }
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr2 = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i<=N; i++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        visited = new int[10001];
        arr1 = new int[M];
        Arrays.sort(arr2);
        DFS(0);
        System.out.print(sb);
    }
}
