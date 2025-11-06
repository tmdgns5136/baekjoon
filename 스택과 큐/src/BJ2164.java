import java.util.*;
import java.io.*;
public class BJ2164 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i<=N; i++){
            queue.add(i);
        }
        while(queue.size() > 1){
            queue.poll(); // 첫번째 값 반환 후 제거 반환 필요없으면 remove()사용
            queue.add(queue.poll());
        }
        System.out.println(queue.poll());
    }
}
