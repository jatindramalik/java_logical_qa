import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class P11 {

    public static void addBinaryNo(String s1,String s2){
        int i = Integer.parseInt(s1,2);
        int j = Integer.parseInt(s2, 2);

        int sum = i + j;
        String sumBinary = Integer.toBinaryString(sum);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(sumBinary);
    }
    public static void swapTwono(int a,int b){
        int c = a;
        a = b;
        b = c;
    }

    public static void swapString(String s1,String s2){

        System.out.println("Before s1 :" + s1);
        System.out.println("Before s2 :" + s2);
        s1 = s1+s2;
        s2=s1.substring(0, s1.length()-s2.length());
        s1=s1.substring(s2.length());

        System.out.println("After s1 :" + s1);
        System.out.println("After s2 :" + s2);

    }
    public static void swapTwono2(int a,int b){
        a = a+b;
        b = a - b;
        a = a-b;
    }
    public static void findLargeAndSmall(int[] arr){
        int large_no = arr[0];
        int small_no = arr[0];
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i] > large_no){
                large_no=arr[i];
            }else if(arr[i]< small_no){
                small_no = arr[i];
            }
        }
    }
    public static void reverseString(String s){
        String rev = "";
        for(int i = s.length()-1;i>=0;i--){
            rev = rev+ s.charAt(i);
        }

        String revs = new StringBuilder(s).reverse().toString();
    }
    public static void noOfOccurance(String s){

        // Arrays.stream(s.split(""))
        //     .collect(Collectors.groupingBy(x->x,Collectors.counting()))
        char[] c = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();

        for(char i : c){
            if(map.containsKey(i)){
                int count = map.get(i);
                map.put(i, count + 1);
            }else {
                map.put(i, 1);
            }
        }
    }
    public static void arraySum(int[] arr){
        Arrays.stream(arr).reduce(0,(a,b)->a+b);
    }
    public static void palindromeCheck(int num){
        int r = 0;
        int rev = 0;

        while(num > 0){
            r = r % 10;
            num = num / 10;
            rev = rev *10+r;
        }
    }
    public static void stringReverse(String s){
        String string = new StringBuilder(s).reverse().toString();
    }
    public static void findItem(int[] arr , int item){
        for(int i = 0;i< arr.length;i++){
            if(arr[i] == item){
                System.out.println(item);
            }
        }
    }
    public static void evenList(int[] arr1,int[] arr2){
        List<Integer> evenList = new ArrayList<>();

        List<Integer> list1 = Arrays.stream(arr1).boxed().filter(x->x%2 == 0).collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(arr2).boxed().filter(x->x%2 == 0).collect(Collectors.toList());

        evenList.addAll(list1);
        evenList.addAll(list2);
        System.out.println(evenList);
    }





    public static void main(String[] args) {
        addBinaryNo("10", "10");
        swapString("jatin", "raka");
    }
    
}
