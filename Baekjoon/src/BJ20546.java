// 기적의 매매법(실버5)
// 구현, 시뮬레이션
import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;
public class BJ20546 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cash_j = Integer.parseInt(br.readLine()); // 준현 현금
        int cash_s = cash_j; // 성민 현금

        int price[] = new int[14]; // 주가
        int stock_j = 0; // 준현 주식 개수
        int stock_s = 0; // 성민 주식 개수
        
        int up = 0; // 주가 증가
        int down = 0; // 주가 감소
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<14; i++){
            price[i] = Integer.parseInt(st.nextToken());
            if(cash_j / price[i]!= 0){
                stock_j += cash_j / price[i];
                cash_j = cash_j % price[i];
            }
        }
        for(int i =1; i<14; i++){
            if(price[i-1] < price[i]){
                up += 1;
                down = 0;
            }
            if(price[i-1] > price[i]){
                up = 0;
                down += 1;
            }
            if(up == 3){
                cash_s += price[i] * stock_s;
                stock_s = 0;
                up = 0;
                down = 0;
            }
            if(down == 3){
                stock_s += cash_s / price[i];
                cash_s = cash_s % price[i];
                up = 0;
                down = 0;
            }
        }
        cash_j += price[13] * stock_j;
        cash_s += price[13] * stock_s;
        if(cash_j > cash_s){
            System.out.println("BNP");
        }
        else if (cash_j < cash_s){
            System.out.println("TIMING");
        }
        else{
            System.out.println("SAMESAME");
        }
    }
}
