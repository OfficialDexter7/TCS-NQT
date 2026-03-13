public class Find_Smallest_Element{
    public static int findSmallest(int[] arr, int n){
        int min = arr[0];

        for(int i = 1; i < n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 6};

        int result = findSmallest(arr, arr.length);

        System.out.println("Smallest element: " + result);
    }
}