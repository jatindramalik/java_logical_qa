import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("aa","bb","cc","dd","bb","aa");

        Set<String> set = new HashSet<>();

        for(String str : list){
            if(set.contains(str)){
                System.out.println("First repeating string is :" + str);
                break;
            }else{
                set.add(str);
            }
        }

        int num = 153;
        int r = 0;
        int rev = 0;
        while(num > 0){
            r = num % 10;
            num = num / 10;
            rev = rev+r*r*r;
        }
        System.out.println(rev);

        int[] intArrays = {10,20,30,40,50,60};
        int largest = intArrays[0];
        int smallest = intArrays[0];

        for(int i = 0;i <= intArrays.length-1;i++){
            if(intArrays[i] > largest){
                largest = intArrays[i];

            }else if(intArrays[i] > smallest){
                smallest = intArrays[i];
            }
        }
        System.out.println("larget : "+ largest);
        System.out.println("smallest : "+ smallest);

        //write java method to find the fibbonacci series for given number

        int n = 10;
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i = 0;i <= n;i++){
            c = a+b;
            a = b;
            b = c;
            System.out.println(c);
        }

        //swap two no without using third variable write java program

        int x = 10;
        int y = 20;

        x = x+y;
        y = x-y;
        x = x-y;

        System.out.println("x : "+ x);
        System.out.println("y : "+ y);

        //write java program to find the factorial of given number

        int fact = 1;
        int num1 = 5;
        for(int i = 1;i <= num1;i++){
            fact = fact*i;
        }
        System.out.println(fact);

        //write java program to find the reverse of given number

        int num2 = 123;
        int rev2 = 0;
        while(num2 > 0){
            rev2 = rev2*10 + num2%10;
            num2 = num2/10;
        }
        System.out.println(rev2);

        // write java program to find the sum of given number

        int num3 = 123;
        int sum = 0;
        while(num3 > 0){
            sum = sum + num3%10;
            num3 = num3/10;
        }
        String st = "JaVaPRoGraMmiNg";

        for(int i = 0;i<st.length();i++){
            char cc = st.charAt(i);
            if(Character.isUpperCase(cc)){
                Character.toLowerCase(cc);

            }else if(Character.isLowerCase(cc)){
                Character.toUpperCase(cc);
            }
        }
        System.out.println(st);

        Map<Character,Integer> map = new HashMap<>();

        for(int i = 0;i<=st.length()-1;i++){
            char ccc = st.charAt(i);
            if(map.containsKey(ccc)){
                int count = map.get(ccc);
                map.put(ccc, count+1);
            }else{
                map.put(ccc, 1);
            }
        }
        System.out.println(map);






    }
    
}
