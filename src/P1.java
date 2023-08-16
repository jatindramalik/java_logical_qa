import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Set;

public class P1 {

    // Q-Addition of two binary no
    public static String addBinaryNo(String a, String b) {
        int i = a.length();
        int j = b.length();
        if (i > j) {
            int diff = i - j;
            for (int k = 0; k < diff; k++) {
                b = b + "0";
            }
        } else if (i < j) {
            int diff = j - i;
            for (int k = 0; k < diff; k++) {
                a = a + "0";
            }
        }

        int carry = 0;
        String ans = "";
        for (int k = i - 1; k >= 0; k--) {
            if (a.charAt(k) == '0' && b.charAt(k) == '0' && carry == 1) {
                ans = "0" + ans;
                carry = 1;
            } else if (a.charAt(k) == '0' && b.charAt(k) == '1' && carry == 0) {
                ans = "1" + ans;
            } else if (a.charAt(k) == '1' && b.charAt(k) == '0' && carry == 0) {
                ans = "1" + ans;
            } else if (a.charAt(k) == '1' && b.charAt(k) == '1' && carry == 1) {
                ans = "1" + ans;
                carry = 1;
            } else if (a.charAt(k) == '0' && b.charAt(k) == '1' && carry == 1) {
                ans = "0" + ans;
                carry = 1;
            } else if (a.charAt(k) == '1' && b.charAt(k) == '1' && carry == 0) {
                ans = "0" + ans;
                carry = 1;
            } else if (a.charAt(k) == '1' && b.charAt(k) == '0' && carry == 1) {
                ans = "0" + ans;
                carry = 1;
            }
            if (carry == 1) {
                ans = "1" + ans;

            }
        }
        return ans;

    }

    public static boolean isPalindrome(String s) {
        // Remove all non-alphanumeric characters and convert to lowercase
        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the cleaned string is a palindrome
        int left = 0;
        int right = cleanedString.length() - 1;
        while (left < right) {
            if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void binaryAdd(String s1, String s2) {
        int i = Integer.parseInt(s1, 2);
        int j = Integer.parseInt(s2, 2);

        int sum = i + j;
        String sumBinary = Integer.toBinaryString(sum);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(sumBinary);

    }

    // *write java code for swap string without taking third variable */
    public static void swapString(String str1, String str2) {

        System.out.println("Before swapping: str1 = " + str1 + ", str2 = " + str2);

        // Concatenate str1 and str2
        str1 = str1 + str2;
        // Get original str1 and assign it to str2
        str2 = str1.substring(0, str1.length() - str2.length());
        // Get original str2 and assign it to str1
        str1 = str1.substring(str2.length());

        System.out.println("After swapping: str1 = " + str1 + ", str2 = " + str2);

    }

    // Q-Swap two no by taking thired variable
    public static void swapTwono(int A, int B) {
        int C = A;
        A = B;
        B = C;
        System.out.println("A:" + A);
        System.out.println("B:" + B);

    }

    // Q-Swap two no without adding tired variable
    public static void swapTwono2(int A, int B) {
        A = A + B;
        B = A - B;
        A = A - B;
        System.out.println("A:" + A);
        System.out.println("B:" + B);

    }

    // Q-Find smallest and largest in int array?
    public static void findLargeAndSmall(int[] arr) {
        int large_no = arr[0];
        int small_no = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large_no) {
                large_no = arr[i];
            } else if (arr[i] < small_no) {
                small_no = arr[i];
            }
        }
        System.out.println("largest no :" + large_no);
        System.out.println("small no :" + small_no);
    }

    // Q-Rreverse String
    public static void reverseString(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);
    }

    public static void reverseString2(String str) {
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println(rev);
    }

    // Q-Find no of occurance
    public static Map<Character, Integer> noOfOccurance(String s) {

        char[] c = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (char i : c) {
            if (map.containsKey(i)) {
                int count = map.get(i);
                map.put(i, count + 1);
            } else {
                map.put(i, 1);
            }
        }
        return map;
    }

    // Q-Sum of all integer in list
    public static int arraySum(int[] arr) {
        return Arrays.stream(arr).reduce(0, (a, b) -> a + b);
    }

    // Q-Numbler palindrome
    public static void palindromeCheck(int num) {
        int r = 0;
        int rev = 0;
        while (num > 0) {
            r = r % 10;
            num = num / 10;
            rev = rev * 10 + r;
        }
        System.out.println(rev);
    }

    // Q-String palindrome
    public static void stringPalindrome(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);
    }

    // Q-Find the item in the arrylist
    // Liner search
    public static Integer findItem(int[] arr, int item) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return item;
            }
        }
        return null;
    }

    // Binary search
    public static boolean findItem2(int[] arr, int item) {
        int min = 0;
        int max = arr.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (item == arr[mid]) {
                return true;
            } else if (item < arr[mid]) {
                max = mid - 1;
            } else {
                max = mid + 1;
            }
        }
        return false;
    }

    // Q-Find even from two arry and make a list
    public static int[] evenList(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] / 2 == 0) {
                list.add(i);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (arr1[i] / 2 == 0) {
                list.add(i);
            }
        }
        return list.stream().mapToInt(x -> x).toArray();
    }

    // Q-Reverse Array
    public static int[] reverseArray(int[] arr) {
        int[] result = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = arr[i];
            result[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return result;
    }

    // Q-Reverse inplace
    public static int[] revereInPlace(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }

    // Q-Find max
    public static void findMax(int[] arr) {
        Arrays.stream(arr).max().ifPresent(System.out::println);
    }

    // Q-Rotate array
    public static int[] rotateArray(int[] arr) {
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];

        }
        arr[arr.length - 1] = first;
        return arr;

    }

    // Q-Char transformation
    public static String charTransform(String s) {
        StringBuffer sb = new StringBuffer(s);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.setCharAt(i, Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.setCharAt(i, Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }

    // Q-Map iteration
    public static Map<String, Integer> mapIteration(Map<String, Integer> map) {
        Set<Map.Entry<String, Integer>> entryset = map.entrySet();
        for (Map.Entry<String, Integer> entry : entryset) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        return map;

    }

    // Q-First appear
    public static void firstAppear(String[] str) {

        Set<String> set = new HashSet<>();
        for (String s : str) {
            if (set.contains(s)) {
                System.out.println("first repeat :" + s);
                break;
            } else {
                set.add(s);
            }
        }
    }

    // Q-Sorting string
    public static void sortString(String[] s) {
        Arrays.stream(s).sorted(Comparator.naturalOrder()).forEach(System.out::println);
    }

    // Q-Index of two element in which addition is target
    public static int[] twoSum(int[] arr, int target) {
        int[] result = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    // Q-Roman to int
    public static void romanToInt(String str) {
        int num = 0;
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (num) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }
            if (4 * num < ans) {
                ans = ans - num;
            } else {
                ans = ans + num;
            }
        }
    }

    // Q-Fibonacci Serise
    public static void fibonacciSerises(int num) {
        int f_no = 0;
        int s_no = 1;
        int next_no = f_no + s_no;
        for (int i = 0; i < num; i++) {
            System.out.println(next_no);
            f_no = s_no;
            s_no = next_no;
        }
    }

    //
    // public static Object lengthOfLongestSubstringJava8(String s) {
    // Set<Character> set = new HashSet<>();
    // return s.chars()
    // .mapToObj(c -> (char) c)
    // .reduce(new Object[]{0, 0}, (a, c) -> {
    // if (!set.contains(c)) {
    // set.add(c);
    // a[1] = Math.max((int) a[1], set.size());
    // } else {
    // set.remove(s.charAt((int) a[0]++));
    // a = new Object[]{a[0], a[1]};
    // }
    // return a;
    // }, (a, b) -> null)[1];
    // }
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int[] maxLength = { 0 };
        int[] left = { 0 };
        int[] right = { 0 };
        Set<Character> charSet = new HashSet<>();

        s.chars().forEach(c -> {
            if (!charSet.contains((char) c)) {
                charSet.add((char) c);
                maxLength[0] = Math.max(maxLength[0], right[0] - left[0] + 1);
                right[0]++;
            } else {
                charSet.remove(s.charAt(left[0]));
                left[0]++;
            }
        });

        return maxLength[0];
    }

    /*
     * public static int lengthOfLongestSubstring(String s) {
     * int n = s.length();
     * int maxLength = 0;
     * int left = 0;
     * int right = 0;
     * Set<Character> charSet = new HashSet<>();
     * 
     * while (right < n) {
     * char c = s.charAt(right);
     * if (!charSet.contains(c)) {
     * charSet.add(c);
     * maxLength = Math.max(maxLength, right - left + 1);
     * right++;
     * } else {
     * charSet.remove(s.charAt(left));
     * left++;
     * }
     * }
     * 
     * return maxLength;
     * }
     */
    // **Q-Reverse word letter of string of words */
    public static void reverseStringWord(String str) {
        StringBuilder sb = new StringBuilder();
        String[] s = str.split(" ");
        for (String word : s) {
            StringBuilder reverseWord = new StringBuilder(word);
            reverseWord.reverse();
            sb.append(reverseWord).append(" ");
        }
        System.out.println(sb.toString().trim());
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert the strings to lowercase for case-insensitive
        // comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths of both strings are the same
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted char arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {

        // System.out.println(addBinaryNo("1000110", "010"));
        // swapTwono(10, 20);
        int[] arr = { 1, 2, 5, 8, 7, 56, 45 };
        // findLargeAndSmall(arr);
        // reverseString("jatin");
        // System.out.println(noOfOccurance("javatujava"));
        // System.out.println(arraySum(arr));
        // findMax(arr);

        System.out.println(charTransform("JaBAaJowJJ"));
        Arrays.stream(rotateArray(arr)).forEach(System.out::println);
    }

}
