import java.io.*;
import java.util.*;
class Point{
    int x,y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class BJ7576v2 {
    static Queue<Point>q = new LinkedList<>();
            
    static void BFS(int N, int M, int arr[][], int visited[][]){
        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0, 0, -1, 1};
        while(!q.isEmpty()){
            Point cur = q.poll();
            for(int k =0; k<4; k++){
                int nx = dx[k] + cur.x;
                int ny = dy[k] + cur.y;
                if(nx >= 0 && ny >= 0 && nx <N && ny <M){
                    if(arr[nx][ny] == 0 && visited[nx][ny] == 0){
                        visited[nx][ny] = visited[cur.x][cur.y] + 1;
                        q.add(new Point(nx, ny));
                    }
                }
            }
        }
    }
    
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int arr[][] =new int[N][M];
        int visited[][] =new int[N][M];
        for(int i =0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] == 1){
                    q.add(new Point(i, j));
                    visited[i][j] = 1;
                }
            }
        }

        
        
        BFS(N, M, arr, visited);
        boolean result = false;
        int max = 0;
        for(int i =0; i<N; i++){
            for(int j =0; j<M; j++){
                if(arr[i][j] == 0 && visited[i][j] == 0){
                    result = true;
                }
                max = Math.max(max, visited[i][j]);
            }
        }
        
        System.out.println(result ? -1 : max-1);
    }
}
