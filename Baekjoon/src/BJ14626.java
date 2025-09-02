import java.util.*;
public class BJ14626 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        int total = 0;
        int a = 0;
        int x = 1;
        for(int i=0; i<12; i++){
            if(sb.charAt(i) == '*'){
                if(i % 2 != 0){
                    x = 3;
                }
            }
            else{
                if(i % 2 == 0){
                    a = (sb.charAt(i) - '0');
                }
                else{
                    a = (sb.charAt(i) - '0') * 3;
                }
                total += a;
            }
            
        }
        int m = sb.charAt(12) - '0';
        for(int i = 0; i<10; i++){
            if(m == 0){
                if(((total + x*i) % 10) == 0){
                    System.out.println(i);
                    break;
                }
            }
            if(m == (10 - (total + x*i) % 10)){
                System.out.println(i);
                break;
            }
        }
        sc.close();
    } 
}
