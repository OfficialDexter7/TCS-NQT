import java.util.*;

class Remove_All_Duplicate{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        boolean[] seen = new boolean[256];
        String result = " ";

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!seen[c]){
                result += c;
                seen[c] = true;
            }
        }
        System.out.println(result);
    }
}