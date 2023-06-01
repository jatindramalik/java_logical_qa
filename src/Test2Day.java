import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test2Day {

    public static void main(String[] args) {
        int i = 356;
        int r = 0;
        int num = 0;
        while (i > 0) {
            r = i % 10;
            i = i / 10;

            num = num + r;
        }
        System.out.println(num);

        int a = 15;
        int b = 30;

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a is :" + a);
        System.out.println("b is :" + b);

        int[] arr = { 22, 45, 7, 11, 20 };
        int large_no = arr[0];
        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] > large_no) {
                large_no = arr[j];
                System.out.println("second highest : " +arr[j-1] );

            }
        }

        // ["Morning","is","and","!"]
        // ["Sunshine","bright","beautiful"]
        // Morning sunshine is bright and beautiful !
        List<String> str1 =Arrays.asList("Morning","is","and","!");
        List<String> str2 =Arrays.asList("Sunshine","bright","beautiful");

        List<String> newList = new ArrayList<>();

        // for(String s : str1){
        //     if()
        // }

        String s1 ="java";
        String s2 = new String("java");
        // s1.equals(s2)
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        StringBuffer sb = new StringBuffer("java");
        System.out.println(s1.equals(sb));
        select max(e_salary) from empl where e_salay<()


    }

}
