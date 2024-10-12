package Simple.com;

public class Day4_FindaNumber {
    public static void main(String[] args) {
        int[] nums={10,20,30,34,3,34,23,354,354,2,42};
        int target=42;
//        int ans=linearsearch(nums,target);
//        System.out.println(ans);
        System.out.println(linearsearch(nums,target));
    }
    static int linearsearch(int[] nums,int target){
        if(nums.length==0){
            return -1;
        }
        for(int i=0;i<nums.length;i++){
           int element=nums[i];
           if(element==target){
               return i;
           }
        }
        return -1;
    }
//    static int index(int[] nums,int target){
//        if(nums.length==0){
//            return -1;
//        }
//        for (int i = 1; i <=4 ; i++) {
//            if(nums[i]==target){
//                return i;
//            }
//        }
//        return -1;

}
