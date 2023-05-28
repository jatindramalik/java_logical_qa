
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice {

    public static void main(String[] args) {

        // length of the string
        String s = "hello wordl";
        int length = s.length();
        System.out.println(length);

        String[] sarray = s.split(" ");
        for (String str : sarray) {
            System.out.println(str);
        }

        String newStr = "hii byddy are u ok ..... ok... ohk";
        String[] newStarray = newStr.split(" ");
        int count = 1;
        for (String sr : newStarray) {
            if (sr.equals("ok")) {
                count++;
            }
        }
        System.out.println(count);

        int len = newStr.length();
        String rrev = "";
        for (int i = len - 1; i > 0; i--) {
            rrev = rrev + newStr.charAt(i);
        }
        System.out.println(rrev);

        String pstring = "madam";

        int plen = pstring.length();
        String prev = "";

        for (int i = plen - 1; i >= 0; i--) {
            prev = prev + pstring.charAt(i);
        }
        System.out.println(prev);

        int pi = 151;
        int r = 0;
        int prevv = 0;

        while (pi > 0) {
            r = pi % 10;
            pi = pi / 10;
            prevv = prevv * 10 + r;
        }
        System.out.println(prevv);

        int ai = 153;
        int ar = 0;
        int an = 0;
        while (ai > 0) {
            ar = ai % 10;
            ai = ai / 10;
            an = an + ar * ar * ar;

        }
        System.out.println(an);

        int A = 10;
        int B = 20;
        int C;
        C = B;
        B = A;
        A = C;
        System.out.println(A + " " + B);

        List<String> slist = Arrays.asList("aa", "bb", "cc", "aa", "bb");

        Set<String> set = new HashSet<>();

        for (String str : slist) {
            if (set.contains(str)) {
                System.out.println(str);
                break;
            } else {
                set.add(str);
            }
        }
        String str = "j a v a s t r i n g";
        String nstr = str.replaceAll(" ", "");
        System.out.println(nstr);

        // fibonacciSerises

        int n = 10;
        int f_no = 0;
        int s_no = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(f_no);
            int nxt_no = f_no + s_no;
            f_no = s_no;
            s_no = nxt_no;

        }
        int[] intArray = { 10, 20, 30, 40, 50, 60 };
        int largest_no = intArray[0];
        int smallest_no = intArray[0];

        for (int j = 1; j < intArray.length; j++) {
            if (intArray[j] > largest_no) {
                largest_no = intArray[j];
            } else if (intArray[j] < smallest_no) {
                smallest_no = intArray[j];
            }
        }
        System.out.println("large_no :" + largest_no);
        System.out.println("small_no :" + smallest_no);

        String stt = "Hello World";
        int sttlen = stt.length();
        String sttrev = "";
        for (int i = sttlen - 1; i >= 0; i--) {
            sttrev = sttrev + stt.charAt(i);
        }
        System.out.println(sttrev);

        StringBuffer sb = new StringBuffer(stt);
        String reversed = sb.reverse().toString();
        System.out.println(reversed);

        char c = 'o';
        int countt = 0;
        for (int i = 0; i < stt.length(); i++) {
            if (stt.charAt(i) == c) {
                countt++;
            }
        }
        System.out.println(countt);
        int[] sumArray = { 10, 20, 30, 40, 50, 60 };
        int sum = Arrays.stream(sumArray).filter(x -> x % 2 == 0).sum();
        System.out.println(sum);

        // Factorial
        int fn = 5;
        int factorial = 1;
        for (int i = 1; i <= fn; i++) {
            factorial *= i;
        }
        System.out.println(factorial);

        int number = 25;
        int root = (int) Math.sqrt(number);
        System.out.println(root);
        double pow = Math.pow(3, 3);
        System.out.println(pow);

        //write a java program to find the sum of first 10 natural numbers
        int sumN = 0;
        for (int i = 1; i <= 10; i++) {
            sumN += i;
        }
        System.out.println(sum);

        //List top java problems and  their solution
        
        
        




    }

}
