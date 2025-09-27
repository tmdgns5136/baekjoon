// 감소하는 수(골드5)
// 백트래킹
import java.io.*;
import java.util.*;
public class BJ1038{
    static int N;
    static ArrayList<Long> arr = new ArrayList<>();
    static void DFS(long value, int predigit){{
        for(int digit : new int[]{0,1,2,3,4,5,6,7,8,9}){
            if(predigit > digit){
                long next = value * 10 + digit;
                arr.add(next);
                DFS(next, digit);
            }
        }
    }
        
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        for(int i = 0; i<10; i++){
            arr.add((long)i);
            DFS(i, i);
        }
        Collections.sort(arr);
        System.out.println((arr.size() > N) ? arr.get(N) : -1);
    }
}