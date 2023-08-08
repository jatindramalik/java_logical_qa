import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class P13 {

    public static String addBinaryNo(String s1,String s2){
        int i = s1.length();
        int j = s2.length();

        if(i>j){
            int diff = i-j;
            for(int k=0;k <=diff;k++){
                s2 = "0"+s2;
            }
        }else if(i<j){
            int diff = j-i;
            for(int k =0;k<=0;k++){
                s1 = "0"+s1;
            }
        }
        int carry = 0;
        String ans = "";
        for(int k = i-1;k>=0;k--){
            if(s1.charAt(k) == '0' && s2.charAt(k) == '0'&&carry==0){
                ans = ans+"0";
                carry =0;

            }else if(s1.charAt(k) == '0' && s2.charAt(k) == '0'&& carry ==1){
                ans= ans+"0";
                carry=1;
            }
            if(carry ==1){
                ans = ans+"1";
            }
        }
        return ans;
    }
    public static void binaryAdd(String a,String b){
        int i = Integer.parseInt(a);
        int j = Integer.parseInt(b);

        int sum = i+j;
        String bno = Integer.toBinaryString(sum);
        System.out.println(bno);
    }
    public static void swapString(String a,String b){
        a = a+b;
        b = a.substring(0, a.length()-b.length());
        a = a.substring(b.length());
        System.out.println("A is :"+ a+"B is :"+ b);
    }
    public static void swapTwono(int A,int B){
        int c = A;
        A = B;
        B = c;
    }
    public static void swapTwono2(int a,int b){
        a = a+b;
        b = a-b;
        a = a-b;
    }
    public static void findLargeAndSmall(int [] arr){
        int large_no = arr[0];
        int small_no = arr[0];

        for(int i = 0;i < arr.length;i++){
            if(arr[i] > large_no){
                large_no = arr[0];
            }else if(arr[i] < small_no){
                small_no = arr[0];
            }
        }
    }
    public static void reverseString(String s){
        String rev = "";
        for(int i = s.length()-1;i >=0;i--){
            rev = rev +s.charAt(i);
        }

        new StringBuffer(s).reverse().toString();
    }
    public static void noOfOccurance(String s){
        char[] c = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();

        for(char i : c){
            if(map.containsKey(i)){
                int count = map.get(i);
                map.put(i, count + 1);
            }else{
                map.put(i, 1);
            }
        }
    }  
    public static int arraySum(int[] arr){
       return Arrays.stream(arr).reduce(0,(a,b)->a+b);
       
    } 
    public static void palindromeCheck(int num){
        int r = 0;
        int rev = 0;
        while(num>0){
            r = r % 10;
            num = num / 10;
            rev = rev*10 + r;
        }
    }
    public static void findItem(int [] arr,int item){
        for(int i = 0 ;i < arr.length;i++){
            if(arr[i] == item){
                System.out.println(item);
            }
        }
        Arrays.stream(arr).filter(x->x==item).forEach(x->System.out.println(x));
    }
    public static void reverseArray(int [] arr){
        int[] result = new int[arr.length-1];
        for(int i = 0;i < arr.length;i++){
            int temp = arr[i];
            result[i] =arr[arr.length - 1 -i];
            arr[arr.length - 1 -i] =temp;

        }
        
    }
    public static void revereInPlace(int [] arr){
        int temp = arr[0];
        for(int i = 0;i < arr.length/2;i++){
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    }
    public static void findMax(int [] arr){
        Arrays.stream(arr).max().ifPresent(x->System.out.println(x));
    }
    public static void charTransform(String s){
        StringBuilder sb = new StringBuilder(s);
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
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        for(Map.Entry<String,Integer> entry : entrySet){
            System.out.println(entry.getKey() + ":"+entry.getValue());
        }
    }
    public static void firstAppear(String[] s){
        Set<String> set = new HashSet<>();
        for(String sr : s){
            if(set.contains(sr)){
                System.out.println(sr);
                break;
            }else {
                set.add(sr);
            }
        }
    }
    public static void sorStrings(String [] s){
        Arrays.stream(s)
            .sorted(Comparator.naturalOrder())
            .forEach(x->System.out.println(x));
    }
    public static void twoSum(int[] arr,int target){
        int [] result = new int[2];
        for(int i = 0;i < arr.length;i++){
            for(int j= i+1;j < arr.length;j++){
                if(arr[i] + arr[j] == target){
                    result[0] =i;
                    result [1] = j;
                }
            }
        }
    }
    public static void romanToInt(String s){
        int num = 0;
        int ans = 0;
        for(int i = 0;i < s.length();i++){
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
            if(4*num < num ){
                ans  = ans - num;
            }else{
                ans = ans + num;
            }
        }
    }

  
    
}
