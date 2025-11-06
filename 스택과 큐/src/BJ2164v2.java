import java.util.*;
public class BJ2164v2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int power = 1;
        while(power * 2 <= N){
            power *=2;
        }
        int result = (N == power) ? N : 2*(N-power);
        System.out.println(result); 
        sc.close();
    }
}
