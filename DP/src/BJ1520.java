// 내리막 길(골드3)
// DP
// TOP-DOWN 방식의 DFS
// DFS(x, y)는 (x,y)에서 도착점까지 갈 수 있는 경우의 수
// 최종 위치 도착시 1 return, 이미 방문 한적 있으면 그 값 return
// 4방향을 모두 가능한 지 확인 후 가능하면 dp[x][y] += DFS(nx,ny)를 해줌
// 현재 값에 가능한 경우의 수들을 더해주는 것임
import java.io.*;
import java.util.*;
public class BJ1520 {
    static int map[][], dp[][];
    static int M, N;
    static int dx[] = {1, -1, 0, 0};
    static int dy[] = {0, 0, 1, -1};
    static int DFS(int x, int y){
        if (x == M && y == N) return 1;
        if (dp[x][y] != -1) return dp[x][y];

        dp[x][y] = 0;
        for(int i = 0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 1 || nx > M || ny < 1 || ny > N) continue;

            if(map[nx][ny] < map[x][y]){
                dp[x][y] += DFS(nx, ny);
            }
        }
        return dp[x][y];
        
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        map = new int[M+1][N+1];
        for(int i = 1; i<=M; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j<=N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dp = new int[M+1][N+1];
        for(int i = 0; i<=M; i++){ // 2차원 배열이라 각 행을 채워줘야됨
            Arrays.fill(dp[i], -1);
        }
        
        System.out.println(DFS(1,1));
    }
}
