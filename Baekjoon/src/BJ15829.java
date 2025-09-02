import java.util.*;
public class BJ15829 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        long total = 0;

        StringBuilder sb = new StringBuilder();
        String s = sc.next();
        sb.append(s);
        long pow = 1;
        for(int i =0; i<L; i++){
            int a = sb.charAt(i) - 'a' + 1;
            total = (total + (a * pow) % 1234567891) % 1234567891;
            pow = (pow * 31) % 1234567891;
        }
        System.out.println(total);
        sc.close();
    }
}
