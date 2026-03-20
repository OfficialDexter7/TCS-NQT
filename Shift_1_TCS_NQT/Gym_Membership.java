import java.util.*;
class Gym_Membership{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cost = 0;

        if(n % 12 == 0){
            cost = (n / 12) * 15000;
        }

        else if(n % 9 == 0){
            cost = (n / 9) * 12000;
        }

        else if(n % 6 == 0){
            cost = (n / 6) * 9000;
        }

        else if(n % 3 == 0){
            cost = (n / 3) * 5000;
        }

        else if(n % 1 == 0){
            cost = n * 2000;
        }
        System.out.println(cost);
    }
}