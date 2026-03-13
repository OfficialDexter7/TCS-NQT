import java.util.*;

public class Count_Freq_Of_Each {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for(int num : arr){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        sc.close();
    }
}



// HashMap is used to store the frequency of each element in the array. 
// The getOrDefault method is used to simplify the counting process. 
// Finally, we iterate through the entries of the HashMap 
// to print each element and its corresponding frequency.