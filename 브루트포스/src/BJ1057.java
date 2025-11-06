import java.util.*;
import java.io.*;
public class BJ1057 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int jimin = Integer.parseInt(st.nextToken());
        int hansu = Integer.parseInt(st.nextToken());
        int sum = 1;
        while(N != 1){
            if(((jimin / 2) != (hansu /2)) && (jimin - hansu == 1 || jimin - hansu == -1)){
                System.out.println(sum);
                break;
            }
            else{
                if(N % 2 != 0){
                    if(jimin % 2 == 0){
                        jimin /= 2;
                    }
                    else{
                        jimin = jimin/2 + 1;
                    }
                    if(hansu % 2 == 0){
                        hansu /=2;
                    }
                    else{
                        hansu = hansu /2 + 1;
                    }
                    N /= 2;
                    N +=1;
                }
                else{
                    if(jimin % 2 == 0){
                        jimin /= 2;
                    }
                    else{
                        jimin = jimin/2 + 1;
                    }
                    if(hansu % 2 == 0){
                        hansu /=2;
                    }
                    else{
                        hansu = hansu /2 + 1;
                    }
                    N /= 2;
                
                }
                sum += 1;
            }
        }
        
    }
}
