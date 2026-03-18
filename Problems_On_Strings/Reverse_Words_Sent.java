import java.util.*;

class Reverse_Words_Sent{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLLine();

        String[] words = s.split(" ");

        for(int i = words.length-1; i >= 0; i--){
            System.out.println(words[i] + " ");
        }
    }
}

// Input : Java is fun
// Output : fun is Java