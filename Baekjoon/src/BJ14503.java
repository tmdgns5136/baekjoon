import java.io.*;
import java.util.*;
public class BJ14503 {
    static int days = 0;
    static void DFS(int x, int y, int N, int M, int arr[][], int d){
        if(x <0 || y < 0 || x >= N || y >= M) return;
        int dx[] = {-1,0,1,0}; // d 0 1 2 3순
        int dy[] = {0,1,0,-1};
        if(arr[x][y] == 0){
            arr[x][y] = 2; // 1로 바꾸면 벽이돼버려서 2로
            days += 1;
        }
        for(int i =0; i<4; i++){
            d = (d+3)%4;
            int nx = dx[d] + x;
            int ny = dy[d] + y;
            if(arr[nx][ny] == 0){
                DFS(nx, ny, N, M, arr, d);
                return;
            }
        }
        
        int back = (d+2)%4; // 방향은 그대로니 back 새로 선언
        int nx = dx[back] + x;
        int ny = dy[back] + y;
        if(arr[nx][ny] == 1){
            return;
        }
        else{
            DFS(nx, ny, N, M, arr, d);
        }
    }
            
        
    
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int arr[][] = new int[N][M];
        for(int i =0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j =0; j<M; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        DFS(r,c,N,M,arr,d);
        System.out.println(days);
        
    }
}
