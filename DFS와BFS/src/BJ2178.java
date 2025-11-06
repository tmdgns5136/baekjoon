import java.io.*;
import java.util.*;
class point{
    int x;
    int y;
    point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class BJ2178 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char arr[][] = new char[N][M];
        int visited[][] = new int[N][M];
        for(int i = 0; i<N; i++){
            String s = br.readLine();
            for(int j = 0; j<M; j++){
                arr[i][j] = s.charAt(j);
            }
        }
        int dx[] = {-1,1,0,0};
        int dy[] = {0,0,-1,1};
        Queue<point>q = new LinkedList<>();
        q.add(new point(0, 0));
        visited[0][0] = 1;
        while(!q.isEmpty()){
            point cur = q.poll();

            if(cur.x == N-1 && cur.y == M-1){
                System.out.println(visited[cur.x][cur.y]);
                break;
            }

            for(int i =0; i<4; i++){
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                if(nx >= 0 && ny >= 0 && nx < N && ny < M  && arr[nx][ny] == '1' && visited[nx][ny] == 0){
                    visited[nx][ny] = visited[cur.x][cur.y] + 1;
                    q.add(new point(nx, ny));
                }
            }
           
        }
    }
}
