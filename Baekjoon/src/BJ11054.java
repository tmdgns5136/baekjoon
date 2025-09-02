import java.util.*;
public class BJ11054 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int[N];
        for(int i =0; i<N; i++){
            arr[i] = scanner.nextInt();
        }

        int LIS[] = new int[N];
        int LDS[] = new int[N];

        for(int i =0; i<N; i++){
            LIS[i] = 1;
            for(int j =0; j<i; j++){
                if(arr[j] < arr[i]){
                    LIS[i] = Math.max(LIS[i], LIS[j] + 1);
                }
            }
        }

        for(int i = N-1; i>-1; i--){
            LDS[i] = 1;
            for(int j = N-1; j>i; j--){
                if(arr[j] < arr[i]){
                    LDS[i] = Math.max(LDS[i], LDS[j] + 1);
                }
            }
        }

        int max = 0;
        for(int i =0; i<N; i++){
            max = Math.max(max, LIS[i] + LDS[i] -1); // LIS 꼭대기 까지 최대, LDS 아래까지 최대 꼭대기 i가 겹치니까 -1
        }
        System.out.println(max);

        scanner.close();
    }
}
