// 숫자 정사각형(실버3)
// 브루트포스
import java.io.*;
import java.util.StringTokenizer;
public class BJ1051 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int arr[][] = new int[N][M];
        for(int i =0; i<N; i++){
            String s = br.readLine();
            for(int j =0; j<M; j++){
                arr[i][j] = (int)(s.charAt(j)) - '0';
            }
        }
        int max = 1;
        for(int i = 0; i<N; i++){
            for(int j = 0; j<M; j++){
                int first = arr[i][j];
                int k = 1;
                while((i+k < N) && (j+k < M)){
                    if((first == arr[i+k][j]) && (first == arr[i][j+k]) && (first == arr[i+k][j+k])){
                        max = Math.max(max, (k+1)*(k+1));
                    }
                    k++;
                }
            }
        }
        System.out.println(max);
    }
}
