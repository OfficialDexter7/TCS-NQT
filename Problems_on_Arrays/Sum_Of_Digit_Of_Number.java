import java.util.*;

public class Sum_Of_Digit_Of_Number{
    public static int SumOfDigits(int num){
        if(num == 0)
            return 0;

        return 1 + (num - 1) % 9;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(SumOfDigits(num));
    }
}

