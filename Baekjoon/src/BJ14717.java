// 앉았다(실버4)
// 브루트포스
import java.io.*;
import java.util.StringTokenizer;
public class BJ14717 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int mysum = (A + B) % 10;
        int total = 18*17/2;
        int win = 0;
        double result = 0;
        int counts[] = new int[11];
        for(int i = 1; i<=10; i++){
            counts[i] = 2;
        }

        counts[A] -= 1;
        counts[B] -= 1;

        if(A == B){
            result = ((double)(total - (10-A)) / total);
            System.out.printf("%.3f\n", result);
        }

        else{
            for(int i = 1; i<=10; i++){
                for(int j = 1; j<=10; j++){
                    int ysum = (i + j) % 10;
                    if(i != j && mysum > ysum){
                        win += counts[i]*counts[j]; // 순서 상관없으니 중복 2개발생
                    }
                }
            }
            result = (double)win / total / 2; // 나누기 2
            System.out.printf("%.3f\n", result);
        }
        
    }
}
