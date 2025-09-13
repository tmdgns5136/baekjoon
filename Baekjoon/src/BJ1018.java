// 체스판 다시 칠하기(실버3)
// 브루트포스
import java.io.*;
import java.util.StringTokenizer;

public class BJ1018{
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char chess[][] = new char[N][M];
        for(int i = 0; i<N; i++){
            String s = br.readLine();
            for(int j = 0; j<M; j++){
                chess[i][j]= s.charAt(j);
            }
        }
        int min = 64;
        for(int i=0; i+7 < N; i++){
            for(int j=0; j+7 < M; j++){
                int countW = 0; // 시작이 White
                int countB = 0; // 시작이 Black

                for(int x = 0; x < 8; x++){
                    for(int y = 0 ; y < 8; y++){
                        char expectedW = ((x+y) % 2 == 0) ? 'W' : 'B'; // White 시작했을 때 기대되는 색
                        char expectedB = ((x+y) % 2 == 0) ? 'B' : 'W'; // Black 시작했을 때 기대되는 색

                        if(chess[x+i][y+j] != expectedW) countW++;
                        if(chess[x+i][y+j] != expectedB) countB++;
                    }
                }
                min = Math.min(min, Math.min(countW, countB));
            }
        }
        System.out.println(min);
	}
	
}

