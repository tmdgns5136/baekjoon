// 좋은 수열(골드4)
// 백트래킹
import java.io.*;
public class BJ2661 {
    static int N;
    static boolean found = false;
    static void DFS(String seq){
        if(found) return;
        if(seq.length() == N){
            System.out.println(seq);
            found = true;
            return;
        }
        for(char c = '1'; c <= '3'; c++){
            String next = seq + c;
            if(goodArrays(next)){
                DFS(next);
            }
        }
    }
    static boolean goodArrays(String seq){
        int len = seq.length();
        for(int k = 1; k <= len/2; k++){
            String left = seq.substring(len - 2*k, len-k);
            String right = seq.substring(len-k);
            if(left.equals(right)) return false;
        }
        return true;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        DFS("");
    }
}
