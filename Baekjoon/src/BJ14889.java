// 스타트와 링크(실버1)
// DFS, 백트래킹
import java.io.*;
import java.util.*;
public class BJ14889 {
    static int N;
    static int visited[];
    static int soccer[][];
    static int min = Integer.MAX_VALUE;
    static void DFS(int start, int count){
        if(count == N/2){
            diff();
            return;
        }
        for(int i = start; i < N; i++){
            visited[i] = 1;
            DFS(i+1, count+1);
            visited[i] = 0;
        }
    }
    static void diff(){
        int start = 0;
        int link = 0;
        
        for(int i = 0; i<N; i++){
            for(int j = i+1; j<N; j++){
                if(visited[i] == 1 && visited[j] == 1){
                    start += soccer[i][j] + soccer[j][i];
                }
                else if(visited[i] == 0 && visited[j] == 0){
                    link += soccer[i][j] + soccer[j][i];
                }
            }
        }
        min = Math.min(min, Math.abs(start - link));
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        visited = new int[N];
        soccer = new int[N][N];
        for(int i = 0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j<N; j++){
                soccer[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        DFS(0,0);
        System.out.println(min);
    }
}
