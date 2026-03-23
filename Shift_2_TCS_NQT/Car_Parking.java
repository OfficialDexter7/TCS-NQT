import java.util.*;

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    if(!sc.hasNextInt()){
        System.out.println("error");
        return;
    }

    int n = sc.nextInt();

    if(n < 0) {
        System.out.println("error");
        return;
    }

    int charge;

    if(n <= 2){
        charge = n * 30;
    } else {
        charge = 60 + (n - 2) * 50;
    }

    System.out.println(charge);
}