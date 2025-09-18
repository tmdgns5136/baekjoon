// N과 M(3)(실버3)
// 백트래킹
import java.io.*;
import java.util.*;
public class BJ15651 {
    static int N, M;
    static int visited[], arr[];
    static StringBuilder sb = new StringBuilder();
    static void DFS(int count){
        
        if(count == M){
            for(int i = 0; i<M; i++){
                sb.append(arr[i] + " ");
            }
            sb.append("\n");
            return;
        }
        for(int i = 1; i<=N; i++){ // 같은 숫자 중복가능 -> visited[] 필요없음
            arr[count] = i;
            DFS(count+1);
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new int[N+1];
        arr = new int[M];
        DFS(0);
        System.out.print(sb);
    }
}
