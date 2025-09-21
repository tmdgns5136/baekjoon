// N과 M(8)(실버3)
// 백트래킹
import java.io.*;
import java.util.*;
public class BJ15657 {
    static int N,M;
    static int arr[], comb[];
    static StringBuilder sb = new StringBuilder();
    static void DFS(int index, int count){
        if(count == M){
            for(int i = 0; i<M; i++){
                sb.append(comb[i] + " ");
            }
            sb.append("\n");
            return;
        }
        for(int i = index; i < N; i++){
            int j = arr[i];
            comb[count] = j;
            DFS(i, count+1);
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        comb = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        DFS(0,0);
        System.out.print(sb);

    }
}
