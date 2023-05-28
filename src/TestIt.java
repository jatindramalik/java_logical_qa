import java.util.HashMap;
import java.util.Map;

public class TestIt {

    public static void main(String[] args) {
        String s = "JaVaPRoGraMmiNg";

        for(int i = 0;i<=s.length()-1;i++){

            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                Character.toLowerCase(c);
            }else if(Character.isLowerCase(c)){
                Character.toUpperCase(c);
            }
        }
        System.out.println(s);

        Map<Character,Integer> map = new HashMap<>();

        for(int i = 0;i<s.length();i++){

            char cc = s.charAt(i);
            if(map.containsKey(cc)){
                int count = map.get(cc);
                map.put(cc, count+1);
            }else{
                map.put(cc, 1);
            }
        }

        System.out.println(map);

        // int f_no=0;
        // int s_no=1;
        // int sum = f_no+s_no;
        // int num = 10;
        // System.out.println(f_no);
        // while(num<=10){
        //     f_no = sum;


        // }

        //write fibbonacci series till 10
        int f_no=0;
        int s_no=1;
        int sum = f_no+s_no;
        int num = 10;
        System.out.println(f_no);
        System.out.println(s_no);
        while(sum<=num){
            System.out.println(sum);
            f_no = s_no;
            s_no = sum;
            sum = f_no+s_no;
        }
    }
    
}
