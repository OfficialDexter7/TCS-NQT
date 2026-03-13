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


        int min = arr[0];

        for(int i = 1; i < n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
       return min;
    }
    

    int min = arr[0];

    for(int i = 0; i < n; i++){
        if(arr[i] < min){
            min = arr[i];
        }
    }
    return min;