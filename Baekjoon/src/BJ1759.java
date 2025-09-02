import java.io.*;
import java.util.*;
public class BJ1759 { // 얼추 이해 완료
    // pass: 현재까지 만든 암호
    // idx: 현재 고려할 알파벳 위치
    // vowel: 현재까지 모음 개수
    // cons: 현재까지 자음 개수
    static int L,C;
    static char arr[];

    static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;
        else return false;
    }
    static void comb(String pass, int idx, int vowel, int cons){
        if(pass.length() == L){
            if(vowel >= 1 && cons >= 2){
                System.out.println(pass);
            }
            return;
        }
        for(int i = idx; i < C; i++){
            char ch = arr[i];
            if(isVowel(ch)){
                comb(pass + ch, i+1, vowel + 1, cons);
            }
            else{
                comb(pass + ch, i+1, vowel, cons+1);
            }
        }

    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        arr = new char[C];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<C; i++){
            arr[i] = st.nextToken().charAt(0);
        }
        Arrays.sort(arr);
        comb("",0,0,0);
    }
}
