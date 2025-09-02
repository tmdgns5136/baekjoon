import java.util.*;
public class BJ11053 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int[N];
        for(int i =0; i<N; i++){
            arr[i] = scanner.nextInt();
        }
        int D[] = new int[N];
        int max = 0;
        for(int i = 0; i<N; i++){
            D[i] = 1;
            for(int j = 0; j<i; j++){
                if(arr[j] < arr[i]){
                    D[i] = Math.max(D[i], D[j] + 1);
                }
            }
            if(max < D[i]){
                max = D[i];
            }
        }
        System.out.println(max);
        scanner.close();
    }
}
