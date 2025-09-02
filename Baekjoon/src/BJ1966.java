import java.util.*;
class imp{
    int importancy;
    int ord;
    imp(int importancy, int ord){
        this.importancy = importancy;
        this.ord = ord;
    }
}
public class BJ1966 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i<T; i++){
            int sum = 0;
            int N = sc.nextInt();
            int M = sc.nextInt();
            Queue <imp>queue = new LinkedList<>();
            for(int j = 0; j<N; j++){
                    int x = sc.nextInt();
                    queue.add(new imp(x, j));
                }

            if(N == 1){
                System.out.println(1);
            }
            else{
                while(!queue.isEmpty()){
                    int max = -1;
                    for (imp im : queue) {
                        max = Math.max(max, im.importancy);
                    }
                    imp current = queue.poll();
                    if(current.importancy == max){
                        sum += 1;
                        if(current.ord == M){
                            System.out.println(sum);
                            break;
                        }

                    }
                    else{
                        queue.add(current);
                    }
                }
            }
        }
        sc.close();
    }
}
