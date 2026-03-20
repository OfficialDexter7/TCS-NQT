import java.util.*;

class Chocolate_Pack{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

            int free = n / 3;
            int total = (n + free) * 10;
            System.out.println(total);
    }
}
