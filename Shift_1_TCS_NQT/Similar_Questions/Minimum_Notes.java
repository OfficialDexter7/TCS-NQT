import java.util.*;

public class Minimum_Notes {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] notes = {2000,500,200,100};

        for(int note : notes){
            int count = n / note;
            if(count > 0){
                System.out.println(note + " " + count);
                n %= note;
            }
        }
    }
}