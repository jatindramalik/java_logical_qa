import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class P6 {


    public static String binaryAdd(String a,String b){
        int i = a.length();
        int j = b.length();

        if(i > j){
            int diff = i - j ;
            for(int k = 0;k<=diff;k++){
                b = "0"+b;
            }
        }
        if(i<j){
            int diff = j - i;
            for(int k = 0;k <= diff;k++){
                a = "0"+a;
            }
        }
        int carry = 0;
        String ans = "";

        for(int k = i-1;k>=0;k--){
            if(a.charAt(k)=='0' && b.charAt(k) == '0' && carry == 0){
                ans = "0" + ans;
                carry = 0;
            }else if(a.charAt(k) == '0' && b.charAt(k)=='0' && carry == 1){
                ans = "0"+ans;
                carry = 1;
            }if(carry == 1){
                ans = "1"+ans;
            }
        }
        return ans;
    }

    public static void swapTwono(int a,int b){
        a = a+b;
        b = a-b;
        a = a-b;
    }
    public static void swapTwono2(int a, int b){
        int c = a;
        a = b;
        b = c;
    }
    public static void findLargeAndSmall(int[] arr){
        int largest = arr[0];
        int smallest = arr[0];
        
        for(int i = 0;i < arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }else if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
    }
    public static void reverseString(String str){
        String rev = "";
        for(int i = str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
    }
    public static void noOfOccurance(String str,char c){
        int count = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)==c){
                count++;
            }
        }
    }
    public static void sum(int[] arr){
        Arrays.stream(arr).sum();
    }
    public static void numPalindrome(int i){
        int r = 0;
        int rev = 0;
        while(i > 0){
            r = r %10;
            i = i / 10;
            rev = rev*10+r;
        }
    }
    public static Integer findItem(int[] arr,int item){
        for(int i = 0;i <arr.length;i++){
            if(arr[i] == item){
                return item;
            }
        }
        return null;
    }
    public static void findEvenNo(int[] arr1,int[] arr2){
        List<Integer> evenList = new ArrayList<>();

        for(int i = 0 ;i < arr1.length;i++){
            if(arr1[i] /2 == 0){
                evenList.add(arr1[i]);
            }
        }
        for(int i = 0;i < arr2.length;i++){
            if(arr2[i]/2==0){
                evenList.add(i);
            }
        }
    }
    public static void reverseString(int[] arr){
        int[] result = new int[arr.length-1];
        for(int i = 0 ;i < arr.length-1;i++ ){
            int temp = arr[i];
            result[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] =temp;
        }
    }
    public static void revereInPlace(int[] arr){

        for(int i = 0;i < arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }
    public static void findMax(int[] arr){
        Arrays.stream(arr).max().ifPresent(System.out::println);
    }
    public static void rotateArray(int[] arr){

        int first = arr[0];
        for(int i = 0; i < arr.length;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = first;
    }
    public static void charOccurance(String s){
        Map<Character,Integer> map = new HashMap<>();

        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                int count = map.get(c);
                map.put(c, count+1);
            }else{
                map.put(c, 1);
            }
        }
    }
    public static void charTransform(String s){
        StringBuilder sb = new StringBuilder(s);

        for(int i =0 ;i < s.length();i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                sb.setCharAt(i,Character.toLowerCase(c));
            }else if(Character.isLowerCase(c)){
                sb.setCharAt(i,Character.toUpperCase(c));
            }
        }
    }
    public static void firstAppear(String[] arr){
        Set<String> set = new HashSet<>();

        for(String str : set){
            if(set.contains(str)){
                System.out.println(str);
                break;
            }else{
                set.add(str);
            }
        }
    }
    public static void appearTimes(String[] str){
        Map<String,Integer> map = new HashMap<>();

        for(String s : str){
            if(map.containsKey(str)){
                int count = map.get(s);
                map.put(s, count+1);
            }else{
                map.put(s, 1);
            }
        }
    }
    
    public static void sortString(String[] str){
        Arrays.stream(str).sorted((a,b)->a.length()-b.length()).forEach(System.out::println);
    }

    public static void twoSumTarget(int[] arr,int target){
        int[] ans = new int[2];
        for(int i = 0;i< arr.length;i++){
            for(int j = i + 1; j < arr.length;j++){
                if(arr[i]+arr[j] == target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
    }
    public static void romanToInt(String str){
        int num = 0;
        int ans = 0;
        for(int i = 0;i< str.length();i++){
            switch(num){
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
                ans = ans + num;
            }
        }
    }
    public static void fibonacciSerises(int num){
        int f_no = 0;
        int s_no = 1;
        int sum = f_no + s_no;
        for(int i = 0 ;i < num ;i ++){
            System.out.println(sum);
            f_no = s_no;
            s_no = sum;
        }
    }
}
