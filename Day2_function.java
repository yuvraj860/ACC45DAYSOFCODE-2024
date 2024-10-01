package Simple.com;

import java.util.Scanner;

public class Day2_function {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        int a,b,sum;
//        System.out.println("Enter the two numbers");
//        a=in.nextInt();
//        b=in.nextInt();
//        System.out.println(a+b);
        a=0;
        b=0;
        for (int i=0;i<10;i++){
            System.out.println("Enter the First number");
            a=in.nextInt();
            System.out.println("Enter the Second number");
            b=in.nextInt();
            sum=a+b;
            System.out.println("The sum of the two number is "+sum);
        }
    }
}
