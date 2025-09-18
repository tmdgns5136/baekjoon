// 로또(실버2) 더 깔끔한 풀이
// 백트래킹
import java.io.*;
import java.util.*;
public class BJ6603v2 {
    static int k;
    static int arr[];
    static int comb[] = new int[6];
    static StringBuilder sb = new StringBuilder();
    static void DFS(int index, int count){
        if(count == 6){
            for(int i = 0; i<6; i++){
                sb.append(comb[i] + " ");
            }
            sb.append("\n");
            return;
        }
        for(int i = index; i<=k; i++){
            int j = arr[i];
            comb[count] = j;
            DFS(i+1, count+1);
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            k = Integer.parseInt(st.nextToken());
            if(k == 0) break;
            arr = new int[k+1];
            for(int i = 1; i<=k; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            DFS(1 ,0);
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
