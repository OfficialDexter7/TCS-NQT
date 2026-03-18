import java.util.*;

class Freq_Char{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            
            int[] freq = new int[256];
            
            for(int i = 0; i < s.length(); i++){
                freq[s.charAt(i)]++;
            }
            
            int max = 0;
            char result = ' ';
            
            for(int i = 0; i < s.length(); i++){
                if(freq[s.charAt(i)] > max){
                    max = freq[s.charAt(i)];
                    result = s.charAt(i);
                }
            }
            System.out.println(result);
    }
}