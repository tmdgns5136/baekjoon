import java.util.*;
import java.io.*;
public class BJ28702 {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int idx = 1;
        int num = 0;
        for(int i = 0; i<3; i++){
            String s = br.readLine();
            if(s.equals("Fizz") || s.equals("Buzz") || s.equals("FizzBuzz")){
                idx++;
            }
            else{
                num = Integer.parseInt(s);
                break;
            }
        }
        int x = num + (3-idx) + 1;
        if(x % 3 == 0 && x % 5 == 0){
            System.out.println("FizzBuzz");
        }
        else if(x % 3 == 0 && x % 5 != 0){
            System.out.println("Fizz");
        }
        else if(x % 3 != 0 && x % 5 == 0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(x);
        }
        
    }
}
