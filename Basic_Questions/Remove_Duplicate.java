import java.util.*;

class Remove_Duplciate{
	public static void main(String args[]){
	
        int[] arr = {2, 0, 1, 4, 3, 2, 5, 5};
        
        int xor = 0;
        
        for(int i = 0; i< arr.length; i++){
            xor ^=arr[i];
        }
	
	    System.out.println("Unique Element: " + xor);
    }
}