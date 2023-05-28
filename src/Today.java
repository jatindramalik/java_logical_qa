import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Today {

    public static void main(String[] args) {
        String s = "hello world";
        String[] sarray = s.split(" ");
        for(String sr : sarray){
            System.out.println(sr);
        }

        String newStr = "hii byddy are u ok ..... ok... ohk";

        String[] tarray = s.split(" ");
        int count = 1;
        for(String str : tarray){
            if(str.equals("ok")){
                count ++;
            }
        }

        String newString = "madam";
        String rev="";
        for(int i = newString.length()-1;i>=0;i--){
            rev = rev+newString.charAt(i);
        }
        System.out.println(rev);

        int num = 151;
        int r = 0;
        int intrev = 0;
        while(num>0){
            r = num % 10;
            num = num / 10;
            intrev = intrev*10+r;
        }
        System.out.println(intrev);

        List<String> slist = Arrays.asList("aa", "bb", "cc", "aa", "bb");

        Set<String> set = new HashSet<>();

        for(String str : slist){
            if(set.contains(str)){
                System.out.println("repeat string :" + str);
                break;
            }else{
                set.add(str);
            }
        }
        int n = 10;
        int f_no = 0;
        int s_no = 1;
        int sum = f_no + s_no;
        System.out.println(f_no);
        System.out.println(s_no);
        while(sum<= n){
            System.out.println(sum);
            f_no=s_no;
            s_no = sum;
            sum= f_no + s_no;
        }

        int[] intArray = { 10, 20, 30, 40, 50, 60 };
        int largest_no = intArray[0];
        int smallest_no = intArray[0];

        for(int i = 1;i <intArray.length;i++){
            if(intArray[i] > largest_no){
                largest_no = intArray[i];
            }else if(intArray[i] < smallest_no){
                smallest_no = intArray[i];
            }
        }
        System.out.println("large_no :" + largest_no);
        System.out.println("small_no :" + smallest_no);

        int add = Arrays.stream(intArray).sum();
        System.out.println(add);

        int fn = 5;
        int factorial = 1;
        for(int i = 1;i<=5;i++){
            factorial*=i;
        }
        System.out.println(factorial);

        String st = "JaVaPRoGraMmiNg";

        for(int i = 0 ; i<=st.length()-1;i++){
            char c = st.charAt(i);
            if(Character.isUpperCase(c)){
                Character.toLowerCase(c);
            }else if(Character.isLowerCase(c)){
                Character.toUpperCase(c);
            }
        }
        System.out.println(st);

        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0 ;i<st.length();i++){
            char cc = st.charAt(i);
            if(map.containsKey(cc)){
                int countt = map.get(cc);
                map.put(cc, countt+1);
            }else{
                map.put(cc, 1);
            }
        }
        System.out.println(map);

        List<String> words = Arrays.asList(s.split(" "));
        Collections.reverse(words);
        System.out.println(words);

        // for(int i =0;i<st.length();i++){
        //     char ccc = st.charAt(i);
        //     if(ccc == 'a' || ccc = 'e' || ccc = 'i'){

        //     }
        // }

        List<String> smm = Arrays.asList("aa","bb","cc","dd","aa","bb");

        Set<String> newSet = new HashSet<>();

        for(String sss : smm){
            if(newSet.contains(sss)){
                System.out.println("repeating character : " + sss);
                break;
            }else{
                newSet.add(sss);
            }
        }

    }
    
}
