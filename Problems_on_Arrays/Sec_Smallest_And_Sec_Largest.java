import java.util.*;

public class Sec_Smallest_And_Sec_Largest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int small = Integer.MAX_VALUE, secondSmall = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE, secondLarge = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            int x = sc.nextInt();

            if(x < small){
                secondSmall = small;
                small = x;
            }
            else if(x < secondSmall && x != small){
                secondSmall = x;
            }

            if(x > large){
                secondLarge = large;
                large = x;
            }
            else if(x > secondLarge && x != large){
                secondLarge = x;
            }
        }

        if(secondSmall == Integer.MAX_VALUE || secondLarge == Integer.MIN_VALUE){
            System.out.println("Second smallest or largest not found");
        }
        else{
            System.out.println(secondSmall + " " + secondLarge);
        }

        sc.close();
    }
}