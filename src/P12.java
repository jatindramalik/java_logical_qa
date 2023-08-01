import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class P12 {

    public static void addBinary(String s1,String s2){
        int i = Integer.parseInt(s1);
        int j = Integer.parseInt(s2);

        int sum = i + j;
        String binarySum = Integer.toBinaryString(sum);
    }

    public static void swapString(String s1,String s2){
        s1 = s1+s2;
        s2 = s1.substring(0, s1.length()-s2.length());
        s1 = s1.substring(s2.length());
    }
    public static void swapTwono(int a,int b){
        a = a+b;
        b = a-b;
        a = a-b;

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

    public static void charTransform(String s){

        StringBuilder sb = new StringBuilder(s);
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                sb.setCharAt(i, Character.toUpperCase(c));
            }else if(Character.isLowerCase(c)){
                sb.setCharAt(i, Character.toUpperCase(c));
            }
        }
    }
    public static void noOfOccurance(String s){
        Map<String, List<String>> collect = Arrays.stream(s.split(""))
        .collect(Collectors.groupingBy(x->x));
        System.out.println(collect);
    }
    public static void findItem(int[] arr,int target){
        Optional<Integer> findAny = Arrays.stream(arr)
                                    .boxed()
                                    .filter(x->x==target).findAny();
                    System.out.println(findAny);
    }
    public static void reverseArray(int[] arr){
        int[] rev = new int[arr.length-1];

        for(int i = 0;i < arr.length;i++){
            rev[i] = arr[arr.length-1-i];
        }
    }
    public static void findMax(int[] arr){
        Arrays.stream(arr).max().ifPresent(System.out::println);
    }
    public static void sum(int [] arr){
        Arrays.stream(arr).reduce(0, (a,b)->a+b);
    }
    public static void firstAppear(String str){
        List<String> collect = Arrays.stream(str.split(""))
            .collect(Collectors.groupingBy(x->x,Collectors.counting()))
            .entrySet().stream()
            .filter(x->x.getValue()>1)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
            System.out.println(collect);
    }
    public static void twoSum(int[] arr,int target){
        int[] result = new int[2];
        for(int i = 0;i <arr.length;i++){
            for(int j = i + 1; j < arr.length;j++){
                if(arr[i]+arr[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
    }
    public static void palindrome(int num){
        int r= 0;
        int rev = 0;
        while(num > 0){
             r = num % 10;
             num = num / 10;
            rev = rev * 10 + r;

        }
    }
    public static void fibonacciSerises(int num){
        int f_no = 0;
        int s_no = 1;
        int sum = f_no + s_no;
        for(int i  = 0;i < num ;i++){
            System.out.println(sum);
            f_no= s_no;
            s_no = sum;
        }
    }
    public static void romanToInt(String str){
        int num = 0;
        int ans = 0;
        for(int i =0;i < str.length();i++){
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
            if(4 * num < ans){
                ans = ans - num;
            }else{
                ans = ans + num;
            }

        }
    }
    public static void main(String[] args) {
        noOfOccurance("abcdefghijklmnopkahafvaseui");
        int [] arr = {1,2,5,8,3};
        findItem(arr, 5);
        firstAppear("jatinmalik");
    }
    
}
