// 빙고(실버4)
// 구현, 시뮬레이션
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;
public class BJ2578 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cheolsu[][] = new int[5][5];
        for(int i = 0; i<5; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j =0; j<5; j++){
                cheolsu[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int sum = 0;
        int bingo = 0;
        for(int q=0; q<5; q++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            for(int y =0; y<5; y++){
                int x = Integer.parseInt(st.nextToken());
                for(int k = 0; k<5; k++){
                    for(int w = 0; w<5; w++){
                        if(cheolsu[k][w] == x){
                            cheolsu[k][w] = 0;
                            sum += 1;
                        }
                    }
                }
                bingo = 0;
                 for(int r = 0; r<5; r++){
                    if(Arrays.stream(cheolsu[r]).allMatch(val -> val == 0)){
                        bingo += 1;
                    }
                }
                for(int c = 0; c<5; c++){
                    int col = c;
                    if(IntStream.range(0, 5). allMatch(r -> cheolsu[r][col] == 0)){
                        bingo += 1;
                    }
                }
                if(IntStream.range(0, 5).allMatch(k -> cheolsu[k][k] == 0)){
                        bingo += 1;
                    }
                if(IntStream.range(0, 5).allMatch(k -> cheolsu[k][4-k] == 0)){
                        bingo += 1;
                }
                if(bingo >= 3){
                    System.out.println(sum);
                    return;
                }
            }
        }
    }
}
