import java.util.*;
class Electricity_Bill{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();

        int bill = 0;

        if(units > 200){
            bill += (units - 200) * 10;
            units = 200;
        }

        if(units > 100){
            bill += (units - 100) * 7;
            units = 100;
        }

        bill += units * 5;
        System.out.println(bill);
    }
}