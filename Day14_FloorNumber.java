package Simple.com;

public class Day14_FloorNumber {
    public static void main(String[]args){
        int[] arr={2,3,5,9,14,15,16,18};
        int target=8;
        int ans=CeilingOfNumber(arr,target);
        System.out.println(ans);
    }

    static  int CeilingOfNumber(int arr[],int target) {
        int start = 0;
        int end = arr.length - 1;
        int check = 0;
        while (start <= end) {
            check = start + (end - start) / 2;
            if (target == arr[check]) {
                return arr[check];
            } else if (target > arr[check]) {
                start = check + 1;
            } else if (target < arr[check]) {
                end = check - 1;
            }
        }

        return arr[end];
    }
}
