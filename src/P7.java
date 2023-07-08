import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class P7 {

    public static String binaryAdd(String a,String b){
        int i = a.length();
        int j = b.length();

        if(i>j){
            int diff = i-j;
            for(int k = 0;k<=diff;k++){
                b = "0"+b;

            }
        }
        if(i<j){
            int diff = j-i;
            for(int k = 0;k<=diff;k++){
                a = "0"+a;
            }
        }
        int carry = 0;
        String ans = "";
        for(int k =i-1;k>=0;k--){
            if(a.charAt(k)=='0' && b.charAt(k)=='0' && carry == 0){
                ans = "0" + ans;
                carry = 0;
            }else if(a.charAt(k)=='0' && b.charAt(k)=='0' && carry == 1){
                ans = "0"+ans;
                carry = 1;
            }
            if(carry == 1){
                ans = ans +"1";
            }
        }

        return ans;
    }
    public static void swapTwono(int a,int b){
        int c = a;
        a = b;
        b = c;
    }
    public static void swapTwono2(int a,int b){
        a = a + b;
        b = a-b;
        a = a-b;
    }
    public static void findLargeAndSmall(int[] arr){
        int largest = arr[0];
        int smallest = arr[0];

        for(int i = 0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }else if(arr[i]<smallest){
                smallest =arr[i];
            }
        }

    }
    public static void reverseString(String str){
        String rev = "";

        for(int i = str.length()-1;i>=0;i--){
            rev = rev+ str.charAt(i);
        }
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
    }
    //**Second largest
    public static Integer secondLargest(int[] arr){
        if(arr == null && arr.length<2){
            return null;
        }
        Arrays.sort(arr);
        int secondLargest =arr[arr.length-2];
        return secondLargest;
    }
    public static void noOfOccurance(String str,char c){

        int count = 0;
        for(int i = 0;i <=str.length()-1;i++){
            if(str.charAt(i) == c){
                count++;
            }
        }
    }
    public static void charOccurance(String str){
        Map<Character,Integer> map = new HashMap<>();

        for(int i = 0;i< str.length()-1;i++){
            char c = str.charAt(i);
            if(map.containsKey(c)){
                int count = map.get(c);
                map.put(c, count+1);
            }else{
                map.put(c, 1);
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
    
}
