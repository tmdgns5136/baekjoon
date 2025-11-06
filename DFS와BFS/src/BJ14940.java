import java.util.*;
import java.io.*;
class Point{
    int x,y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class BJ14940 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int arr[][] = new int[n][m];
        int visited[][] = new int[n][m];

        Queue<Point> q = new LinkedList<>();
        for(int i =0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j =0; j<m; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] == 2){
                    q.add(new Point(i,j));
                    visited[i][j] = 1;
                }
            }
        }
        int dx[] = {1,-1,0,0};
        int dy[] = {0,0,1,-1};

        while(!q.isEmpty()){
            Point cur = q.poll();
            for(int i =0; i<4; i++){
                int nx = dx[i] + cur.x;
                int ny = dy[i] + cur.y;
                if(nx >= 0 && ny >= 0 && nx <n && ny<m){
                    if(arr[nx][ny] == 1 && visited[nx][ny] ==0){
                        visited[nx][ny] = visited[cur.x][cur.y] + 1;
                        q.add(new Point(nx, ny));
                    }
                }
            }
        }
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                if(visited[i][j] == 0){
                    if(arr[i][j] == 0){
                        System.out.print(0 + " ");
                    }
                    else{
                        System.out.print(-1 + " ");
                    }
                }
                else{
                    System.out.print(visited[i][j] -1 + " ");
                }
            }
            System.out.println();
        }
    }
}
