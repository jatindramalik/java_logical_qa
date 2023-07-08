import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class AllLogicalQandA {

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
            if (a.charAt(k) == '0' && b.charAt(k) == '0' && carry == 0) {
                ans = "0" + ans;
            } else if (a.charAt(k) == '0' && b.charAt(k) == '0' && carry == 1) {
                ans = '0' + ans;
                carry = 1;
            } else if (a.charAt(k) == '0' && b.charAt(k) == '1' && carry == 1) {
                ans = "0" + ans;
                carry = 1;
            } else if (a.charAt(k) == '1' && b.charAt(k) == '0' && carry == 1) {
                ans = '0' + ans;
                carry = 1;
            } else if (a.charAt(k) == '1' && b.charAt(k) == '1' && carry == 1) {
                ans = "1" + ans;
                carry = 1;
            } else if (a.charAt(k) == '1' && b.charAt(k) == '0' && carry == 0) {
                ans = "1" + ans;
                carry = 0;
            } else if (a.charAt(k) == '0' && b.charAt(k) == '1' && carry == 0) {
                ans = "1" + ans;
                carry = 0;
            } else if (a.charAt(k) == '1' && b.charAt(k) == '1' && carry == 0) {
                ans = "0" + ans;
                carry = 1;
            }
            if (carry == 1) {
                ans = "1" + ans;
            }

        }
        return ans;

    }

    // Q-Swap two no by taking thired variable
    public static void swapTwono(int A, int B) {
        int C = A;
        A = B;
        B = C;
        System.out.println("A is : " + A);
        System.out.println("B is : " + B);
    }

    // Q-Swap two no without taking thired variable
    public static void swapTwono2(int A, int B) {
        A = A + B;
        B = A - B;
        A = A - B;
        System.out.println("A is : " + A);
        System.out.println("B is : " + B);
    }

    // Q-Find Largest and smallest no from int array?
    public static void findLargeAndSmall(int[] arr) {
        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            } else if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Largest no is :" + largest);
        System.out.println("Smallest no is :" + smallest);
    }

    // Q-Reverse a String
    public static String reverseString(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }

    // Q-No of occurance of a character in string
    public static int occurance(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    // Q-Sum of all the no present in arry
    public static int arraySum(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        return sum;
    }

    // Q-Palindrome check for no
    public static int numPalindrome(int i) {
        int rev = 0;
        int r = 0;
        while (i > 0) {
            r = i % 10;
            i = i / 10;
            rev = rev * 10 + r;
        }
        return rev;
    }

    // Q-Palindrome check for string
    public static String stringPalindrome(String s) {

        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }

    // ArrayList
    // Q-Find the item in the arraylist
    // Linier Search
    public static Integer findItem(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return item;
            }
        }
        return null;
    }

    // Binary Serch
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
    public static int[] findEvenNo(int[] arr1, int[] arr2) {
        List<Integer> evenList = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] / 2 == 0) {
                evenList.add(i);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] / 2 == 0) {
                evenList.add(i);
            }
        }
        return evenList.stream().mapToInt(x -> x).toArray();
    }

    // Q-Reverse array
    public static int[] revereArray(int[] arr){
        int[] result = new  int[arr.length-1];
        for(int i = 0;i < arr.length-1;i++){
            int temp = arr[i];
            result[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

        return result;
    }

    // Q-Reverse in placec
    public static int[] revereInPlace(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];

            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }

    // Q-Find max
    public static void findMax(int[] arr) {
        Arrays.stream(arr).max().ifPresent(System.out::println);

    }

    // Q-Rotate Array
    public static void rotateArray(int[] arr) {
        int first = arr[0];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i + 1];

        }
        arr[arr.length - 1] = first;

    }

    // Q-Find no of occurance of a char in string
    public static void charOccurance(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                int count = map.get(c);
                map.put(c, count + 1);

            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);
    }

    // Q-Character transformation
    public static String charTransform(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c)) {
                sb.setCharAt(i, Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                sb.setCharAt(i, Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }

    // Q-Map itteration
    public static void mapIteration(Map<String, Integer> map) {

        Set<Map.Entry<String, Integer>> set = map.entrySet();

        for (Map.Entry<String, Integer> entries : set) {
            System.out.println(entries.getKey() + ":" + entries.getValue());
        }
    }

    // Q-Which string appeared in the list first
    public static void firstAppear(List<String> list) {

        Set<String> set = new HashSet<>();
        for (String str : list) {
            if (set.contains(str)) {
                System.out.println("First repeating string is : " + str);
                break;
            } else {
                set.add(str);
            }
        }
    }

    // Q-How many times appear in the list
    public static Map<String, Integer> appearTimes(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : list) {
            if (map.containsKey(str)) {
                int count = map.get(str);
                map.put(str, count + 1);
            } else {
                map.put(str, 1);
            }
        }
        return map;
    }

    // Q-List Sorting
    public static List<String> sortString(List<String> list) {
        // return
        // list.stream().sorted((a,b)->a.length()-b.length()).collect(Collectors.toList());
        return list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    // Q-Index of two element in which addition is target
    public static int[] twoSum(int[] arr, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }

    // Q-Roman to integer
    public static int romanToInt(String str) {
        int ans = 0;
        int num = 0;
        for (int i = str.length() - 1; i > 0; i--) {
            switch (str.charAt(i)) {
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
        return ans;
    }

    // Q-Fibonacci Serice
    public static void fibonacciSerises(int num) {

        int f_no = 0;
        int s_no = 1;
        int sum = f_no + s_no;

        for (int i = 1; i <= num; i++) {
            System.out.println(sum);
            sum = f_no + s_no;
            f_no = s_no;
            s_no = sum;
        }
    }

    public static void main(String[] args) {
        String a = "10111011110";
        String b = "110101010111000";

        // addBinaryNo(a, b);
        // System.out.println(addBinaryNo(a, b));
        // swapTwono(10, 20);
        // int[] arr = { 1, 2, 3, 8, 6, 9 };

        // findLargeAndSmall(arr);
        // System.out.println(reverseString("Hello world"));
        // System.out.println(occurance("hello", 'l'));
        // System.out.println(arraySum(arr));
        // System.out.println(numPalindrome(111));

        // System.out.println(stringPalindrome("madam"));
        // // System.out.println(findItem(arr, 10));
        // // System.out.println(findItem2(arr, 9));
        int[] arr1 = { 12, 6, 14, 8, 3, 5, 17 };
        // int[] arr2 = { 2, 8, 96, 36, 2, 1, 7 };
        // findEvenNo(arr1, arr2);
        // System.out.println("==================");
        // Arrays.stream(reverseArray(arr2)).forEach(System.out::println);
        // System.out.println("==================");
        // Arrays.stream(revereInPlace(arr2)).forEach(System.out::println);
        // findMax(arr1);
        charOccurance("JaVaPRoGraMmiNg");
        System.out.println(charTransform("JaVaPRoGraMmiNg"));
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("John", 25);
        map2.put("jane", 30);
        map2.put("jaitn", 40);
        mapIteration(map2);

        List<String> smm = Arrays.asList("aa", "bb", "cc", "bb", "dd", "aa", "bb");
        firstAppear(smm);
        System.out.println(appearTimes(smm));
        int[] result = twoSum(arr1, 8);
        Arrays.stream(result).forEach(System.out::println);
        System.out.println("===============");
        System.out.println(romanToInt("M"));
        fibonacciSerises(10);
    }

}
