package Simple.com;

import java.util.Arrays;

public class Day2_Shadowing {
    static int x=90;

    public static void main(String[] args) {
        System.out.println(x);
        fun(23,34,35,53535,25,35,235,235,235,35);
    }
//    static void fun(){
//        System.out.println(x);
//    }
    static void fun(int a,int ...b){
        System.out.println(a+","+Arrays.toString(b));
    }
}
