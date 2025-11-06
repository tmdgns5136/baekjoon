import java.io.*;
import java.util.*;
public class BJ10026 {
    static void BFS(int x, int y, int N, char arr[][], char a){
        if(x < 0 || x >=N || y<0 || y>=N) return;
        if(arr[x][y] != a) return;
        arr[x][y] = '0';
        BFS(x+1, y, N, arr, a);
		BFS(x-1, y, N, arr, a);
		BFS(x, y+1, N, arr, a);
		BFS(x, y-1, N, arr, a);
    }
    static void RGBFS(int x, int y, int N, char arr[][], char a){
        if(x < 0 || x >=N || y<0 || y>=N) return;
        if(a == 'R' || a == 'G'){
            if(arr[x][y] != 'R' && arr[x][y] != 'G') return;
        }
        else if (a == 'B'){
            if(arr[x][y] != 'B') return;
        }
        
        arr[x][y] = '0';
        RGBFS(x+1, y, N, arr, a);
		RGBFS(x-1, y, N, arr, a);
		RGBFS(x, y+1, N, arr, a);
		RGBFS(x, y-1, N, arr, a);
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char arr[][] = new char[N][N];
        char arr2[][] = new char[N][N];
        int total = 0;
        for(int i = 0; i<N; i++){
            String s = br.readLine();
            for(int j = 0; j<N; j++){
                arr[i][j] = s.charAt(j);
                arr2[i][j] = s.charAt(j);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<N; i++){
            for(int j =0; j<N; j++){
                if(arr[i][j] == 'R' || arr[i][j] == 'B' || arr[i][j] == 'G'){
                    BFS(i,j,N,arr,arr[i][j]);
                    total += 1;
                }
            }
        }
        sb.append(total).append(" ");
        total = 0;
        for(int i =0; i<N; i++){
            for(int j =0; j<N; j++){
                if(arr2[i][j] == 'R' || arr2[i][j] == 'B' || arr2[i][j] == 'G'){
                    RGBFS(i,j,N,arr2,arr2[i][j]);
                    total += 1;
                }
            }
        }
        sb.append(total);
        System.out.println(sb);
    }
}
