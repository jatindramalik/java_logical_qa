import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Java8 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");

        for (Map.Entry<Integer, String> entrty : map.entrySet()) {
            System.out.println(entrty.getKey() + " " + entrty.getValue());
        }
        System.out.println("==========================================");
        map.forEach((a, b) -> System.out.println(a + " " + b));

        System.out.println("==========================================");
        map.entrySet().stream().filter(x-> x.getValue().startsWith("T"))
        .forEach(a -> System.out.println(a));

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");

        list.stream().sorted((a,b) -> a.length()- b.length()).forEach(t->System.out.println(t));
        String string = list.stream().reduce((a,b)->a.length()>b.length()?a:b).get();
        System.out.println(string+"====================");

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        List<Integer> collect = list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect);

        String s = "madam";
        int len = s.length();
        String rev="" ;

        for(int i = len-1;i >= 0 ;i--){
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);

        int num = 151;
        int r =0;
        int p = 0;

        while(num>0){
            r = num % 10;
            num = num/10;
            p = p*10 +r;
        }
        System.out.println("rev :" + p);

        List<String> smm = Arrays.asList("aa","bb","cc","dd","aa","bb");

        Set<String> set = new HashSet<>();
        for(String str : smm){
            if(set.contains(str)){
                System.out.println("repeat : "+ str);
                break;
            }else{
                set.add(str);
            }
        }
    }

}
