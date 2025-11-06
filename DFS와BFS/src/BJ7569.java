import java.io.*;
import java.util.*;
class Point3{
    int x,y,h;
    Point3(int h, int x, int y){
        this.x = x;
        this.y = y;
        this.h = h;
    }
}
public class BJ7569 {
    static Queue<Point3>q = new LinkedList<>();
            
    static void BFS(int N, int M, int H, int arr[][][], int visited[][][]){
        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0, 0, -1, 1};
        int dh[] = {1, -1};
        while(!q.isEmpty()){
            Point3 cur = q.poll();
            for(int k =0; k<4; k++){ // h는 0
                int nx = dx[k] + cur.x;
                int ny = dy[k] + cur.y;
                if(nx >= 0 && ny >= 0 && nx <N && ny <M){
                    if(arr[cur.h][nx][ny] == 0 && visited[cur.h][nx][ny] == 0){
                        visited[cur.h][nx][ny] = visited[cur.h][cur.x][cur.y] + 1;
                        q.add(new Point3(cur.h, nx, ny));
                    }
                }
            }
            for(int k =0; k<2; k++){
                int nh = dh[k] + cur.h;
                if(nh >= 0 && nh < H){
                    if(arr[nh][cur.x][cur.y] == 0 && visited[nh][cur.x][cur.y] == 0){
                        visited[nh][cur.x][cur.y] = visited[cur.h][cur.x][cur.y] + 1;
                        q.add(new Point3(nh, cur.x, cur.y));
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
        int H = Integer.parseInt(st.nextToken());
        int arr[][][] =new int[H][N][M];
        int visited[][][] =new int[H][N][M];
        for(int k = 0; k<H; k++){
            for(int i =0; i<N; i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<M; j++){
                    arr[k][i][j] = Integer.parseInt(st.nextToken());
                    if(arr[k][i][j] == 1){
                        q.add(new Point3(k, i, j));
                        visited[k][i][j] = 1;
                    }
                }
            }
        }  

        
        
        BFS(N, M, H, arr, visited);
        boolean result = false;
        int max = 0;
        for(int k =0; k<H; k++){
            for(int i =0; i<N; i++){
                for(int j =0; j<M; j++){
                    if(arr[k][i][j] == 0 && visited[k][i][j] == 0){
                        result = true;
                    }
                    max = Math.max(max, visited[k][i][j]);
                }
            }
        }
        System.out.println(result ? -1 : max-1);
    }
}
