package Simple.com;

import java.util.Arrays;

public class Day3_Reverse {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        num(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void num(int[] arr) {
    int start=0;
    int end= arr.length-1;
    while(start < end){
       int swap=arr[start];
         arr[start]=arr[end];
         arr[end]=swap;
         start++;
         end--;
    }
    }
}