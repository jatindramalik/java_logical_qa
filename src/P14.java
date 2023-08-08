import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.Set;

public class P14 {
    public static void binaryAdd(String s1,String s2){
        int i = Integer.parseInt(s1);
        int j = Integer.parseInt(s2);

        int sum = i + j;
        String bno = Integer.toBinaryString(sum);
        System.out.println(bno);
    }
    public static void swapString(String s1,String s2){
        s1 = s1+s2;
        s2 = s1.substring(0, s1.length()-s2.length());
        s1 = s1.substring(s2.length());
    }
    public static void swapTwono(int i,int j){
        int k = i;
        j = i;
        i = k;
    }
    public static void swapTwono2(int i,int j){
        i = i + j;
        j = i - j;
        i = i - j;
    }
    public static void findLargeAndSmall(int[] arr){
        int large_no = arr[0];
        int small_no = arr[0];
        for(Integer i : arr){
            if(arr[i] > large_no){
                large_no =arr[i];
            }else if(arr[i]<small_no){
                small_no = arr[i];
            }
        }
    }
    public static void reverseString(String s){
        String rev = "";
        for(int i = s.length()-1;i >= 0;i--){
            rev = rev + s.charAt(i);
        }
        StringBuilder sb = new StringBuilder(s);
        sb.reverse().toString();
    }
    public static void noOfOccurance(String s){
        Map<Character,Integer> map = new HashMap<>();
        char[] c = s.toCharArray();
        for(Character i : c){
            if(map.containsKey(i)){
                int count = map.get(i);
                map.put(i, count + 1);
            }else {
                map.put(i, 1);
            }
        }
    }
    public static void arraySum(int[] arr){
     OptionalLong i = Arrays.stream(arr).mapToLong(x->x)
                                .reduce((a,b)->a+b);
        System.out.println(i);
    }
    public static void palindromeCheck(int num){
        int r = 0;
        int rev = 0;
        while(num > 0){
        r = num % 10;
        num = num / 10;
        rev = rev * 10+r;
        }
    }
    public static void findItem(int [] arr,int i){

        for(Integer k : arr){
            if(arr[k] == i){
                System.out.println(arr[k]);
            }
        }
    }
    public static void reverseArray(int[] arr){
        int [] result = new int[arr.length-1];
        for(int i = 0;i <=arr.length;i++){
            int temp = arr[i];
            result[i]= arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }
    public static void revereInPlace(int[] arr){
        int temp = arr[0];
        for(int i = 0 ;i <=arr.length/2;i++){
            arr[i] = arr[arr.length-i-1];
            temp = arr[arr.length-i-1];
        }
    }
    public static void findMax(int[] arr){
        Arrays.stream(arr).max().ifPresent(System.out::println);
    }
    public static void rotateArray(int[] arr){
        int first = arr[0];
        for(int i = 0;i < arr.length - 1 ;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = first;
    }
    public static void charTransform(String s){
        StringBuffer sb = new StringBuffer(s);
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                sb.setCharAt(i, Character.toLowerCase(c));
            }else if(Character.isLowerCase(c)){
                sb.setCharAt(i, Character.toUpperCase(c));
            }
        }
    }
    public static void mapIteration(Map<String,Integer> map){
        Set<Map.Entry<String,Integer>> entries = map.entrySet();
        for(Map.Entry<String,Integer> entry : entries){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
    public static void firstAppear(String[] str){
        Set<String> set = new HashSet<>();

        for(String s : str){
            if(set.contains(s)){
                System.out.println(s);
                break;
            }else{
                set.add(s);
            }
        }
    }
    public static void sortString(String[] s){
        Arrays.stream(s).sorted(Comparator.naturalOrder())
                        .forEach(System.out::println);
    }
    
    
}
