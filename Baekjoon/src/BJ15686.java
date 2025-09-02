import java.io.*;
import java.util.*;
public class BJ15686 { // 이해가 안되서 나중에 시도예정
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int village[][] = new int[N][N];
        
        for(int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j =0; j<N; j++){
                village[i][j] = Integer.parseInt(st.nextToken());
                if(village[i][j] == 2){
                    q.add(new Point(i, j));
                }
            }
        }
    }
}
