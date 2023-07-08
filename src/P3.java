import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class P3{

    public static String addBinary(String s1, String s2){
        int i = s1.length();
        int j = s2.length();
        
        if(i>j){
            int diff = i-j;
            for(int k = 0;k < diff;k++){
                s2="0"+s2;
            }
        }else if(i<j){
            int diff = j - i;
            for(int k = 0 ;k < diff;k++){
                s1="0"+s1;
            }
        }
        int carry = 0;
        String ans = "";
        for(int k = s1.length();k>0;k--){
            if(s1.charAt(k) == '0' && s2.charAt(k)== '0' && carry ==0){
                carry = 0;
                ans = "0"+ans;
            }
        }
        return ans;
    }
    public static void swapTwono(int a,int b){
        int c = a;
        a = b;
        b = c;
        a = a+b;
        b = a - b;
        a = a - b;
    }
    public static void findLargeAndSmall(int[] arr){
        int largest = arr[0];
        int smallest = arr[0];

        for(int i = 0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }else if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
    }
    public static void secondHighest(int[] arr){
        Arrays.sort(arr);
        System.out.println("Second Highest is : " + arr[arr.length-2]);
    }
    public static void reverseString(String s){
        String rev = "";
        for(int i = s.length()-1;i>=0;i--){
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);
    }
    public static void charOccurance(String s,char c){
        int coint = 0;
        for(int i = 0;i>s.length();i++){
            if(s.charAt(i) == c){
                coint ++;
            }
        }
    }
    public static int arrSum(int[] arr){
        int sum = Arrays.stream(arr).sum();
        return sum;
    }
    public static int numPalindrome(int num){
        int r = 0;
        int rev = 0;
        while(num > 0){
            r = r%10;
            num = num/10;
            rev = rev*10 + r;
        }
        return rev;
    }
    public static Integer findItem(int[] arr,int item){
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == item){
                return item;
            }
        }
        return null;
    }
    public static boolean findItem2(int[] arr,int item){
        int min = 0;
        int max = arr.length-1;
        while(min <= max){
            int mid = (min + max)/2;
            if(item == arr[mid]){
                return true;
            }else if(item <arr[mid]){
                max = mid - 1;
            }else {
                max = mid + 1;
            }
        }
        return false;
    }
    public static int[] findEvenNo(int[] arr1,int[] arr2){
        List<Integer> evenList = new ArrayList<>();
        for(int i = 0;i<arr1.length;i++){
            if(arr1[i] / 2 == 0){
                evenList.add(i);
            }
        }
        for(int i = 0;i < arr2.length;i++){
            if(arr2[i]/2 == 0){
                evenList.add(i);
            }
        }
        return evenList.stream().mapToInt(x -> x).toArray();
    }
    public static int[] revereArray(int[] arr){
        int[] result = new  int[arr.length-1];
        for(int i = 0;i < arr.length-1;i++){
            int temp = arr[i];
            result[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

        return result;
    }
    public static int[] revereInPlace(int[] arr){

        for(int i = 0;i < arr.length/2;i++){
            int temp = arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        return arr;
    }
    public static void findMax(int[] arr){
        Arrays.stream(arr).max().ifPresent(System.out::println);
    }
    public static void rotateArray(int[] arr){
        int first = arr[0];
        for(int i = 0;i<arr.length;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = first;
    }
    public static void charOccurance(String s){
        Map<Character,Integer> map = new HashMap<>();

        for(int i = 0;i< s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                int count = map.get(c);
                map.put(c, count + 1);
            }else{
                map.put(c, 1);
            }
        }
        
    }
    public static String charTransform(String s){
        StringBuilder sb = new StringBuilder(s);

        for(int i = 0;i< s.length();i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                sb.setCharAt(i, Character.toLowerCase(c));
            }else if(Character.isLowerCase(c)){
                sb.setCharAt(i, Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }
    public static void mapIteration(Map<Object,Object> map){
        Set<Map.Entry<Object,Object>> set = map.entrySet();

        for (Map.Entry<Object,Object> entries : set) {
            System.out.println(entries.getKey()+":"+entries.getValue());
        }
        
    }
    public static void firstAppear(List<String> list){
        Set<String> set = new HashSet<>();
        for (String str : set) {
            if(set.contains(str)){
                System.out.println("First repeating string is :" + str);
                break;
            }else{
                set.add(str);
            }
        }
    }
    public static void appearTimes(String[] arr){
        Map<String,Integer> map = new HashMap<>();
        for(String str : arr){
            if(map.containsKey(str)){
                int count = map.get(str);
                map.put(str, count + 1);
            }else {
                map.put(str, 1);
            }
        }
        System.out.println(map);
    }
    public static void sortString(String[] arr){
        Arrays.stream(arr).sorted((a,b)->a.compareTo(b)).forEach(System.out::println);
    }
    public static void twoSumTarget(int[] arr,int target){
        int [] ans = new int[2];
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
    }
    public static int romanToInt(String str){
        int ans = 0;
        int num = 0;
        for(int i = str.length()-1;i>0;i--){
            switch(str.charAt(i)){
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
            if(4*num < ans){
                ans = ans - num;
            }else{
                ans = ans+num;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] arr = { 1, 2, 3, 8, 6, 9 };
        // secondHighest(arr);
        // reverseString("jatin");
        // Arrays.stream(revereArray(arr)).forEach(System.out::println);
        // Arrays.stream(revereInPlace(arr)).forEach(System.out::println);
        findMax(arr);
    }
}