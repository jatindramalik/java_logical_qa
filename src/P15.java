import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;

public class P15 {

    public static void binaryAdd(String s1,String s2){
        int i = Integer.parseInt(s1,2);
        int j = Integer.parseInt(s2,2);

        int sum = i+j;
        String bno = Integer.toBinaryString(sum);
        System.out.println(bno);
    }
    public static boolean isPalindrome(String s){
        String cleanedString = s.replaceAll("[^a-zA-A0-9]", "").toLowerCase();
        
        int left = 0;
        int right =cleanedString.length()-1;
        while(left < right){
            if(cleanedString.charAt(left) != cleanedString.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void swapString(String s1,String s2){

        s1 = s1+s2;
        s2 = s1.substring(0, s1.length()-s2.length());
        s1 = s1.substring(s2.length());
        System.out.println("s1 :" + s1 + "s2 :" + s2);
    }
    public static void swapTwono(int a,int b){
        int c = a;
        b = a;
        a = c;
    }
    public static void swapTwono2(int a,int b){
        a = a+b;
        b = a - b;
        a = a-b;
    }
    public static void findLargeAndSmall(int[] arr){
       int large_no = arr[0];
       int small_no = arr[0];
      for(int i = 0;i < arr.length;i++){
        if(arr[i] > large_no){
            large_no =arr[i];
        }else if(arr[i] < small_no){
            small_no = arr[i];
        }

      }
    }
    public static void reverseString(String s){
        StringBuilder rev = new StringBuilder();
        for(int i = s.length()-1;i >=0;i--){
            rev = rev.append(s.charAt(i));
        }
        
    }
    public static void noOfOccurance(String s){
        char[] ch = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(char c : ch){
            if(map.containsKey(c)){
                int count = map.get(c);
                map.put(c, count + 1);
            }else {
                map.put(c, 1);
            }
        }
    }
    public static void arraySum(int [] arr){
         Arrays.stream(arr).reduce(0, (a,b)->a+b);
    }
    public static void palindromeCheck(int num){
        int r = 0;
        int rev = 0;
        while(num > 0){
            r = r % 10;
            num = num / 10;
            rev = rev *10 + r;
        }
    }
    public static boolean stringPalindrome(String s){

        int left = 0;
        int right = s.length()-1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
    public static void findItem(int [] arr,int item){
        for(int i = 0 ;i <= arr.length-1;i++){
            if(arr[i] == item){
                System.out.println(item);
            }
        }
    }
    public static void reverseArray(int[] arr){
        int[] result = new int[arr.length-1];
        for(int i = 0 ;i <=arr.length;i++){
            int temp = arr[i];
            result[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
    }
    public static void revereInPlace(int[] arr){
        int temp = arr[0];
        for(int i = 0;i <= arr.length/2;i++){
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
    }
    public static void findItem2(int[] arr,int item){
        OptionalInt findItem = Arrays.stream(arr).filter(x -> x== item).findAny();
    }
    public static void findMax(int[] arr){
        Arrays.stream(arr).max().ifPresent(x->System.out.println(x));
    }
    public static void  charTransform(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0;i<=s.length()-1;i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                sb.setCharAt(i, Character.toLowerCase(c));
            }else if(Character.isLowerCase(c)){
                sb.setCharAt(i, Character.toUpperCase(c));
            }
        }
    }
    public static void mapIteration(Map<String ,Integer> map){
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();

        for(Map.Entry<String,Integer> entry : entrySet){
            System.out.println(entry.getKey() + ":"+entry.getValue());
        }
    }
    public static void firstAppear(String s){
        char[] ch = s.toCharArray();
        Set<Character> set = new HashSet<>();
        for(Character c : ch){
            if(set.contains(c)){
                System.out.println(c);
                break;
            }else{
                set.add(c);
            }
        }
        
    }
    public static void sortString(String[] s){
        Arrays.stream(s).sorted(Comparator.naturalOrder())
                        .forEach(System.out::println);
    }
    public static void twoSum(int[] arr,int target){
        int[] result = new int[2];
        for(int i = 0 ;i <arr.length;i++){
            for(int j = i+1;j < arr.length; j++){
                if(arr[i]+arr[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
    }
    public static void romanToInt(String str){
        int num = 0;
        int ans = 0;
        for(int i = 0;i < str.length();i++){
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
            if(4* num < ans){
                ans = ans - num;
            }else {
                ans = ans + num;
            }
        }
    }
    public static void fibonacciSerises(int num){
        int f_no = 0;
        int s_no = 1;
        int sum = f_no + s_no;
        for(int i = 0;i < num ;i++){
            System.out.println(sum);
            f_no = s_no;
            s_no = sum;
        }
    }
    public static boolean areAnagrams(String str1,String str2){
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if(str1.length() != str2.length()){
            return false;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);

    }
    public static void reverseStringWord(String s){
        StringBuilder sb = new StringBuilder();
        String[] str = s.split("");

        for(String i : str){
            StringBuilder rev = new StringBuilder(i);
            rev.reverse();
            sb.append(rev).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
