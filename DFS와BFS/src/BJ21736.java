import java.util.*;
import java.io.*;
public class BJ21736 {
    static int people = 0;
    static void campus(int x, int y, int N, int M, char arr[][]){
        if (x < 0 || x >= N || y < 0 || y>=M) return;
        if(arr[x][y] == 'X') return;
        if(arr[x][y] == 'P'){
            people += 1;
        }
        arr[x][y] = 'X';
        campus(x+1, y, N, M, arr);
        campus(x-1, y, N, M, arr);
        campus(x, y+1, N, M, arr);
        campus(x, y-1, N, M, arr);
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char arr[][] = new char[N][M];
        for(int i = 0; i<N; i++){
            String s = br.readLine();
            for(int j =0; j<M; j++){
                arr[i][j] = s.charAt(j);
            }
        }
        for(int i =0; i<N; i++){
            for(int j=0; j<M; j++){
                if(arr[i][j] == 'I'){
                    campus(i, j, N, M, arr);
                }
            }
        }
        if(people == 0){
            System.out.println("TT");
        }
        else{
            System.out.println(people);
        }
    }
}
