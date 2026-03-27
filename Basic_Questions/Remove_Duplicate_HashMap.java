import java.util.*;

class Remove_Duplicate_HashMap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Print only unique elements
        for(int num : arr) {
            if(map.get(num) == 1) {
                System.out.print(num + " ");
            }
        }
    }
}