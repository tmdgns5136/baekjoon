import java.util.*;
public class BJ7568 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[][] = new int[N][2];
        for(int i = 0; i<N; i++){
            int weight = sc.nextInt();
            int height = sc.nextInt();
            arr[i][0] = weight;
            arr[i][1] = height;
        }

        for(int i =0; i<N; i++){
            int rank = 1;
            for(int j = 0; j <N; j++){
                if(i==j) continue;
                if(arr[j][0] > arr[i][0] && arr[j][1] > arr[i][1]){
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }
        sc.close();
    }
}
