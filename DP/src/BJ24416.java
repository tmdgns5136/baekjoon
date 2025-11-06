import java.util.*;
public class BJ24416 {
    static int fib_sum = 0;
    static int fibo_sum1 = 0;
    static int fib(int n){
        if (n == 1 || n == 2) {
            fib_sum += 1;
            return 1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }

    static int fibo(int n, int arr[]){
        if(n == 1) return 1;
        else if (n == 2) return 1;
        else{
            arr[0] = 1;
            arr[1] = 1;
            for(int i =2; i<n; i++){
                arr[i] = arr[i-1] + arr[i-2];
                fibo_sum1 += 1;
            }
            return arr[n-1];
    }
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int fibo_sum[] = new int[N];
        fib(N);
        fibo(N, fibo_sum);
        System.out.printf("%d %d\n",fib_sum, fibo_sum1);
        scanner.close();
    }
}
