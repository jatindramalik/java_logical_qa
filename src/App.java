import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        int A = 10;
        int B = 20;

        A = A + B;
        B = A - B;
        A = A - B;

        System.out.println("B :" + B);
        System.out.println("A :" + A);

        int[] numbers = { 10, 20, 30, 40, 50 };
        int largest = numbers[0];
        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            } else if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("Largest number is: " + largest);
        System.out.println("Smallest number is: " + smallest);

        String str = "Hello World";

        int len = str.length();
        String rev = "";
        for (int i = len - 1; i > 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);

        char c = 'o';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        System.out.println("Number of occurrences of " + c + " is: " + count);
        int[] numbersInt = { 10, 20, 30, 40, 50 };
        int sum = 0;
        for (int i = 0; i < numbersInt.length; i++) {
            sum += numbersInt[i];
           
        }
        System.out.println(sum );

        int p = 151;
        int r = 0;
        int prv = 0;
        while(p > 0){
            r = p%10;
            p = p/10;

prv = prv *10 + r;
        }
        System.out.println(prv);
    }

}
