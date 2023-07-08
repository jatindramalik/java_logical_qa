import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class P4 {
    public static String addBinaryNo(String a, String b) {
        int t = a.length();
        int e = b.length();
        if (t > e) {
            int diff = t - e;
            for (int i = 0; i < diff; i++) {
                b = "0" + b;
            }
        }
        if (t < e) {
            int diff = e - t;
            for (int i = 0; i < diff; i++) {
                a = "0" + a;
            }
        }
        int carry = 0;
        String ans = "";
        for (int i = t; i >= 0; i--) {
            if (a.charAt(i) == '0' && b.charAt(i) == '0' && carry == 0) {
                ans = "0";
                carry = 0;
            }
            if (carry == 1) {
                ans = "1" + ans;
            }
        }
        return ans;

    }

    public static void swapTwono(int A, int B) {
        int C = A;
        A = B;
        B = C;
    }
    public static void swapTwono2(int A,int B){
        A = A + B;
        B = A - B;
        A = A - B;

    }
    public static void findLargeAndSmall(int[] arr){
        int largest = arr[0];
        int smallest = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }else if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
    }
    public static void reverseString(String s){
        String rev = "";
        for(int i = s.length()-1;i>=0;i--){
            rev = rev +s.charAt(i);
        }

    }
    public static void occurance(String s,char c){
        int count = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)==c){
                count ++;
            }
        }
    }
    public static void arraySum(int[] arr){
        Arrays.stream(arr).sum();
    }
    public static void numPalindrome(int i){
        int r =0;
        int rev =0;
        while(i>0){
            r = r % 10;
            i = i / 10;
            rev = rev *10 + r;
        }
    }
    public static void stringPalindrome(String s){
        String rev = "";
        for(int i = s.length()-1;i>=0;i--){
            rev = rev + s.charAt(i);
        }
    }
    public static void findItem(int[] arr, int j){
        for(int i= 0;i < arr.length;i++){
            if(arr[i]==j){
                System.out.println("item is :"+ arr[i]);
            }
        }
    }
    public static void findItem2(int[] arr,int item){
        int min = 0;
        int max = arr.length-1;
        while(min <= max){
            int mid = (min+max)/2;
            if(item == arr[mid]){
                System.out.println(item);
            }else if(item <= arr[mid]){
                max = mid -1;
            }else{
                max = mid + 1;
            }
        }

    }
    public static int[] findEvenNo(int[] arr1,int[] arr2){
        List<Integer> list = new ArrayList<>();

        for(int i = 0;i<arr1.length;i++){
            if(arr1[i]/2==0){
                list.add(i);
            }
        }
        for(int i = 0;i<arr2.length;i++){
            if(arr2[i]/2==0){
                list.add(i);
            }
        }
        return list.stream().mapToInt(x->x).toArray();
    }
    public static int[] revereArray(int[] arr){

        int [] result = new [arr.length-1];
        for(int i = arr.length-1;i>=0;i--){
            int temp = arr[i];
            result[i] = arr[arr.length-1-i];
           arr[ arr.length-1-i] = temp;
        }
    }
    public static int[] reverseInPlace(int[] arr){
        for(int i = 0;i>arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        return arr;
    }
    public static void findMax(int[] arr){
        Arrays.stream(arr).max().ifPresent(System.out::println);
    }
    public static void rotateArray(int[] arr){
        int first = arr[0];
        for(int i = 0;i<arr.length;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1] = first;
    }
    public static void charOccurance(String s){
        Map<Character,Integer> map = new HashMap<>();

        for(int i = 0;i<s.length();i++ ){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                int count = map.get(c);
                map.put(c,count + 1);
            }else{
                map.put(c, 1);
            }
        }
    }
    public static String charTransform(String s){
        StringBuffer sb = new StringBuffer(s);
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
    public static void matIteration(Map<String,Integer> map){
        Set<Map.Entry<String,Integer>> set = map.entrySet();

        for(Map.Entry<String,Integer> entries : set){
            System.out.println(entries.getKey() + ":"+entries.getValue());
        }
    }
    public static void firstAppear(String[] arr){

        Set<String> set = new HashSet<>();
        for(String s : arr){
            if(set.contains(s)){
                System.out.println("first repeating char :"+ s);
                break;
            }
        }
    }
    public static void appearTimes(String[] arr){
        Map<String,Integer> map = new HashMap<>();

        for(String str : arr){
            if(map.containsKey(str)){
                int count = map.get(str);
                map.put(str, count+1);
            }else{
                map.put(str,1);
            }
        }
    }
    public static void sortString(String[] str){
        Arrays.stream(str).sorted(Comparator.reverseOrder()).toArray();
    }
    public static void twoSum(int[] arr,int target){
        int[] ans = new int[2];
        for(int i = 0;i< arr.length;i++){
            for(int j = i + 1; j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
    }

}
