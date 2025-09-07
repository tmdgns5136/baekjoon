// 알파벳(골드4)
// DFS, 백트래킹사용
import java.io.*;
import java.util.*;
public class BJ1987 {
    static boolean alpha[] = new boolean[26];
    static int max = 0;
    static void DFS(int x, int y, int R, int C, char board[][], int depth){
        max = Math.max(max, depth);
        int dx[] = {1, -1, 0, 0};
        int dy[] = {0, 0, 1, -1};
        for(int i = 0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < R && ny >= 0 && ny < C){
                int a = board[nx][ny] - 'A'; // 몇번째인지
                if(!alpha[a]){
                    alpha[a] = true;
                    DFS(nx, ny, R, C, board, depth+1);
                    alpha[a] = false; // 백트래킹(다른 경로에서 다시 사용하기 위함)
                }
            }
        }
        
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        char board[][] = new char[R][C];
        int visited[][] = new int[R][C];
        visited[0][0] = 1;
        for(int i = 0; i<R; i++){
            String s = br.readLine();
            for(int j =0; j<C; j++){
                board[i][j] = s.charAt(j);
            }
        }
        alpha[board[0][0] - 'A'] = true;
        DFS(0, 0, R, C, board, 1); 
        System.out.println(max);
    }
}
