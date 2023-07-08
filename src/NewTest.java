import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NewTest {

    public static void main(String[] args) {
        
        String str= "jatindramalik";

        Map<String, List<String>> collect = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(s->s));

                System.out.println(collect);

        Map<String, Long> charCount = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(charCount);

        //**All duplicate
        List<String> duplicates = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(x->x.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

                System.out.println(duplicates);

        //**Unique Element */

        List<String> uniqueElement = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(x->x.getValue()==1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(uniqueElement);

        //*find first non repeating element */
        Optional<String> nonRepeat = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream()
                .filter(x->x.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

                System.out.println(nonRepeat);

         //** Q3.Find the second highest no in given array
        int[] numArray = {2,5,8,9,11,35,25};

        Optional<Integer> findFirst = Arrays.stream(numArray).boxed().
                                            sorted(Comparator.reverseOrder())
                                            .skip(1).findFirst();
        System.out.println(findFirst);

         //**Q-Find the longest string in given string array */

        String[] sstr = {"jk","malik","baumandal","gutaguha"};

        String longestString = Arrays.stream(sstr)
                .reduce((a,b)->a.length()>b.length()?a:b)
                .get();
            System.out.println(longestString);


    }
    
}
