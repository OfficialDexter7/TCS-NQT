public class LargestElement{
    public static int findLargest(int[] arr, int n){
        int max = arr[0];

        for(int i = 1;i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 6};

        int result = findLargest(arr, arr.length);

        System.out.println("Largest element: " + result);
    }
}