import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P8J8 {

    public static void main(String[] args) {


    String input= "one day i will be billionair";
    //** Q1.count the occurance of each character in a string
    Map<String, List<String>> collect = Arrays.stream(input.split(""))
                                            .collect(Collectors.groupingBy(s->s));
    System.out.println(collect);
    //** Q2.count the occurance of each character in a string
    Map<String, Long> charCount = Arrays.stream(input.split(""))
                    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    System.out.println(charCount);

    //** Q3.Find all duplicate element from given string
    List<String> duplicateList = Arrays.stream(input.split(""))
    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                                    .entrySet().stream()
                                    .filter(x->x.getValue() > 1)
                                    .map(Map.Entry::getKey)
                                    .collect(Collectors.toList());

                                System.out.println(duplicateList);
    //** Q3.Find all unique element from given string

      List<String> uniqueList = Arrays.stream(input.split(""))
      .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                                    .entrySet().stream()
                                    .filter(x->x.getValue() == 1)
                                    .map(Map.Entry::getKey)
                                    .collect(Collectors.toList());

                                System.out.println(uniqueList);

        //** Q3.Find first non repeating character from given string

      String key = Arrays.stream(input.split(""))
                                    .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                                    .entrySet().stream()
                                    .filter(x->x.getValue() == 1)
                                    .findFirst().get().getKey();

                                System.out.println(key);


    //** Q3.Find the second highest no in given array
        int[] numArray = {2,5,8,9,11,35,25};
        Integer secondHighest = Arrays.stream(numArray)
                                .boxed()
                                .sorted(Comparator.reverseOrder())
                                .skip(1).findFirst().get();
        System.out.println(secondHighest);

        //**Q-Find the longest string in given string array */

        String[] str = {"jk","malik","baumandal","gutaguha"};
        Optional<String> reduce = Arrays.stream(str).reduce((a,b)->a.length()>b.length()?a:b);
        System.out.println(reduce);

        //**find elements from array who starts with 1 */

        List<String> startsWith = Arrays.stream(numArray).boxed()
                .map(x->x+"")
                .filter(s->s.startsWith("2"))
                .collect(Collectors.toList());
            System.out.println(startsWith);

        //*String join */
        List<String> nos = Arrays.asList("1","2","3","4");

        String result = String.join("-", nos);
        System.out.println(result);


        https://www.linkedin.com/in/jatindramalik/

        
    }

}
