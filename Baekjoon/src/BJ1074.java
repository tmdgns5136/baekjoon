// Z(골드5)

import java.io.*;
import java.util.*;
public class BJ1074 {
    static int sum = 0;
    static void Z(int n, int s, int r, int c){
        if(r >= s && c < s){ // 좌하단
            sum += 2*s*s; // 위에 있는 것들 다 더해줌
            r -= s;
        }
        else if(r < s && c >= s){ // 우상단
            sum += s*s; // 좌상단만 더해줌
            c -= s;
        }
        else if(r >= s && c >= s){ // 우하단
            sum += 3*s*s; // 위에 있는 것 + 좌하단
            r -= s;
            c -= s;
        }
        n -= 1;
        if(s == 1) return;
        Z(n, (int)Math.pow(2, n-1), r, c);
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        Z(N, (int)Math.pow(2,N-1), r, c);
        System.out.println(sum);

    }
}
