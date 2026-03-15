import java.util.*;

class Change_Case{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String result = " ";


        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(Character.isUpperCase(c)){
                result += Character.toLowerCase(c);
            }
            else{
                result += Character.toUpperCase(c);
            }
        }
        System.out.println(result);
    }
}