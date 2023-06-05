import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class P2 {

    // Binary addition
    public static String binaryAdd(String a, String b) {
        int i = a.length();
        int j = b.length();

        if (i > j) {
            int diff = i - j;
            for (int k = 0; k <= diff; k++) {
                b = "0" + b;
            }
        }
        if (i < j) {
            int diff = j - i;
            for (int k = 0; k <= diff; k++) {
                a = "0" + a;
            }
        }
        int carry = 0;
        String ans = "";

        for (int k = i - 1; k >= 0; k--) {
            // 1
            if (a.charAt(k) == '0' && b.charAt(k) == '0' && carry == 0) {
                ans = '0' + ans;
                carry = 0;
            } else if (a.charAt(k) == '0' && b.charAt(k) == '0' && carry == 1) {
                ans = '0' + ans;
                carry = 1;
            } else if (a.charAt(k) == '0' && b.charAt(k) == '1' && carry == 0) {
                ans = '1' + ans;
                carry = 0;
            } else if (a.charAt(k) == '1' && b.charAt(k) == '0' && carry == 0) {
                ans = '0' + ans;
                carry = 0;
            } else if (a.charAt(k) == '1' && b.charAt(k) == '1' && carry == 0) {
                ans = '0' + ans;
                carry = 1;
            } else if (a.charAt(k) == '0' && b.charAt(k) == '1' && carry == 1) {
                ans = '0' + ans;
                carry = 1;
            } else if (a.charAt(k) == '1' && b.charAt(k) == '0' && carry == 1) {
                ans = '0' + ans;
                carry = 1;
            } else if (a.charAt(k) == '1' && b.charAt(k) == '1' && carry == 1) {
                ans = '1' + ans;
                carry = 1;
            }
            if (carry == 1) {
                ans = "1" + ans;
            }
        }
        return ans;
    }

    //Swap two no without thired variable
    public static void swapTwono(int a,int b){
        a = a + b;
        b =a - b;
        a = a -b ;

        System.out.println("A is " + a);
        System.out.println("B is " + b);
    }

    //Swap two no
    public static void swapTwono2(int a,int b){
        int c = a;
        a = b;
        b = c;
        System.out.println("A is " + a);
        System.out.println("B is " + b);

    }
    // Q-Find Largest and smallest no from int array?
    public static void findLargeAndSmall(int[] arr){
        int largest = arr[0];
        int smallest = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }else if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println(largest + " Largest NO rahish");
        System.out.println(smallest + " Smallest NO rahish");
    }
    //String reverse
    public static void reverseString(String str){
        String rev ="";

        for(int i = str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println("Reverse String is :" + rev );
    }
    //No of occurance 
    public static  void noOfOccurance(String str,char c){

        int count = 0;
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) == c){
                count++;
            }
        }
        System.out.println("no of occurance is :" + count);
    }
    //sum of all the no present in array
    public static void sum(int[] arr){
       int sum = Arrays.stream(arr).sum();
       System.out.println(sum);
    }
    //Palindrome check 
    public static int numPalindrome(int i){
        int r = 0;
        int rev = 0;
        while(i > 0){
            r = i % 10;
            i = i / 10;
            rev = rev *10+ r;
        }
        return rev;
    }
    
        // ArrayList
    // Q-Find the item in the arraylist
    // Linier Search
    public static Integer findItem(int[] arr, int item){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==item){
                return item;
            }
        }
        return null;
    }
    // Binary Serch
    public static boolean findItem2(int[] arr, int item){
        int min = 0;
        int max = arr.length-1;
        while(min<=max){
            int mid = (min + max)/2;
            if(item == arr[mid]){
                return true;
            }else if(item < arr[mid]){
                max = mid -1;
            }else{
                max = mid + 1;
            }
        }
        return false;
    }
    // Q-Find even from two arry and make a list
    public static int[] findEvenNo(int[] arr1,int[] arr2){
        List<Integer> evenList = new ArrayList<>();

        for(int i = 0;i < arr1.length;i++){
            if(arr1[i]/2==0){
                evenList.add(i);
            }
        }
        for(int i = 0;i < arr2.length;i++){
            if(arr2[i]/2==0){
                evenList.add(i);
            }
        }
        return evenList.stream().mapToInt(x->x).toArray();
    }
    //Reverse array
    public static int[] reverseArray(int[] arr){

        int[] result = new int[arr.length-1];
        for(int i = 0;i<arr.length - 1;i++){
            result[i] = arr[arr.length-1-i];
        }
        return result;
    }
    //Reverse array in place
    public static int[] revereInPlace(int [] arr){
        for(int i = 0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] =temp;
        }
        return arr;
    }
    // Q-Find max
    public static void findMax(int[] arr){
        Arrays.stream(arr).max().ifPresent(System.out::println);
    }
    // Q-Rotate Array
    public static int[] rotateArray(int[] arr){
        int first = arr[0];
        for(int i = 0;i < arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = first;
        return arr;
    }

    // Q-Find no of occurance of a char in string
    public static void charOccurance(String s){
        Map<Character,Integer> map = new HashMap<>();

        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                int count = map.get(c);
                map.put(c, count + 1);
            }else{
                map.put(c, 1);
            }
        }
        System.out.println(map);
    }
    // Q-Character transformation
    public static String charTransform(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                sb.setCharAt(i, Character.toLowerCase(c));
            }else if(Character.isLowerCase(c)){
                sb.setCharAt(i, Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }
    // Q-Which string appeared in the list first
    public static void firstAppear(String[] arr){
        Set<String> set = new HashSet<>();
        for (String string : set) {
            if(set.contains(string)){
                System.out.println("first repeating string is :" + string);
                break;
            }else{
                set.add(string);
            }
        }
    }
    // Q-How many times appear in the list
    public static void appearTimes(String [] arr){
        Map<String,Integer> map = new HashMap<>();
        for(String s : arr){
            if(map.containsKey(s)){
                int count = map.get(s);
                map.put(s, count + 1);
            }else{
                map.put(s, 1);
            }
        }
        System.out.println(map);
    }
    // Q-List Sorting
    public static String[] sorStrings(String [] arr){
        Arrays.sort(arr,Comparator.reverseOrder());
        return arr;
    } 
    // Q-Index of two element in which addition is target
    public static int[] twoSum(int[] arr,int target){
        int[] ans = new int[2];
        for(int i = 0;i < arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        // System.out.println(binaryAdd("100", "111"));
        // swapTwono(10, 20);
        // swapTwono2(10, 20);
        int[] arr = { 12, 6, 14, 8, 3, 5, 17 };
        // findLargeAndSmall(arr);
        // reverseString("jatin");
        // noOfOccurance("hii i am jatin", 'i');
        // sum(arr);
        // System.out.println(numPalindrome(147));
        // System.out.println(findItem(arr, 81));
        // System.out.println(findItem2(arr, 8));
        // Arrays.stream(reverseArray(arr)).forEach(System.out::println);
        // Arrays.stream(revereInPlace(arr)).forEach(System.out::println);
        // findMax(arr);
        Arrays.stream(rotateArray(arr)).forEach(System.out::println);

        charOccurance("jaitnmalik");
        System.out.println(charTransform("JaTiNmiLiK"));

    }

}
