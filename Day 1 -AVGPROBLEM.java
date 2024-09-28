import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Read the number of test cases
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            
            // Correctly calculate the average as a double
            double average = (A + B) / 2.0;
            
            // Check if average is strictly greater than C
            if (average > C) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close(); // Close the scanner
    }
}
