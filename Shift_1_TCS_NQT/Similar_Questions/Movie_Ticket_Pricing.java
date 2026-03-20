import java.util.*;

class Movie_Ticket_Pricing{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cost = 0;

        while(n >= 10){
            cost += 1000;
            n -= 10;
        }

        while(n >= 5){
            cost += 600;
            n -= 5;
        }

        cost += n * 150;
        System.out.println(cost);
    }
}