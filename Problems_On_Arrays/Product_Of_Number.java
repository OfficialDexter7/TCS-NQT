import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int product = 1;

        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            product *= x;
        }
        System.out.println(product);
    }
}



// What is sc.nextInt()?

// sc.nextInt() is a method of the Scanner class in Java that reads the next integer from the input.
// It waits for the user to enter an integer and then returns that integer as an int data type. 
// If the user enters something that is not an integer, it will throw an InputMismatchException.

// What is sc.nextLine()?

// sc.nextLine() is a method of the Scanner class in Java that reads the next line of input from the user.
// It waits for the user to enter a line of text and then returns that line as a String data type.
// If the user enters something and presses Enter, it will return that input as a String.