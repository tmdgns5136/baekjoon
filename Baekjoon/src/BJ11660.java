import java.util.*;
import java.io.*;
public class BJ11660 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int arr[][] = new int[N+1][N+1];
        int prefix[][] = new int[N+1][N+1];
        for(int i =1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j =1; j<=N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                prefix[i][j] = prefix[i-1][j] + prefix[i][j-1] - prefix[i-1][j-1] + arr[i][j];
            }
        }
        int sum = 0;
        for(int i =0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            sum = 0;
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            
            sum = prefix[x2][y2] - prefix[x1 - 1][y2] - prefix[x2][y1 - 1] + prefix[x1 - 1][y1 - 1];
            System.out.println(sum);
        }

            
           
    }
    
        

}

