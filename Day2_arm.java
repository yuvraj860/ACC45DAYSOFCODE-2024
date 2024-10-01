package Simple.com;

import java.util.Scanner;

public class Day2_arm {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=407;
        fun(a);
//        for (int i=0;i<1000;i++){
//            if
//        }
    }
    static void fun(int a){
        int b,sum=0;
        int c=a;
        while(a!=0){
            b=a%10;
            b=b*b*b;
            sum=sum+b;
            a=a/10;
        }
        if(c==sum){
            System.out.println("the number is armstrong number");
        }
        else{
            System.out.println("the number is not a armstrong number");
        }
    }
}
