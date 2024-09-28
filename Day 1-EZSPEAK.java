import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt(); // Read the number of test cases
        while(T-- > 0) {
            int N = in.nextInt(); // Read the length of the word
            String word = in.next(); // Read the word
            int a = 0; // Counter for consecutive consonants
            boolean hardToPronounce = false; // Flag to check if the word is hard to pronounce
            for(int i = 0; i < word.length(); i++) {
                if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                    a = 0; // Reset counter if it's a vowel
                } else {
                    a++; // Increment counter if it's a consonant
                }
                if(a == 4) { // Check if there are 4 consecutive consonants
                    hardToPronounce = true;
                    break; // No need to check further if the word is already hard to pronounce
                }
            }
            if(hardToPronounce) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        in.close();
    }
}
