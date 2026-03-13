import java.util.*;

class MoveZeroToEnd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int j = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}


// what are the purpose of for-loop here how it works ?
// The purpose of the for-loop in this code is to iterate through the array and move all the 
// non-zero elements to the front of the array while pushing the zero elements to the end.

// for(int i = 0; i < n; i++){
//             if(arr[i] != 0){
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//                 j++;
//             }
// }

// Here's how it works:
// 1. The loop iterates through each element of the array from index 0 to n-1.
// 2. If the current element arr[i] is not zero, it means we want to keep it at the front of the array.
// 3. We swap the current element arr[i] with the element at index j (which is the position where the next non-zero element should be placed).
// 4. After the swap, we increment j to point to the next position for the next non-zero element.
// 5. By the end of the loop, all non-zero elements will have been moved to the front of the array, and all zero elements will be at the end.