import java.util.*;
import java.util.stream.Collectors;

public class ElectionWinner {
    public static void main(String[] args) {
        
        // String[] votes = {"john", "johnny", "jackie", "johnny", "john", "jackie", "jamie", "jamie", "john", "johnny", "jamie", "johnny", "john"};

        String[] votes = {"andy","blake","clark"};
        // Map<String, Long> voteCount = Arrays.stream(votes).collect(Collectors.groupingBy(e -> e,LinkedHashMap::new, Collectors.counting()));
        // String winner = Collections.max(voteCount.entrySet(), Map.Entry.comparingByValue()).getKey();
        // System.out.println(winner + " " + voteCount.get(winner));

        Map<String, Long> voteCount = Arrays.stream(votes)
                                            .collect(Collectors.groupingBy(x->x,LinkedHashMap::new,Collectors.counting()));

        String winner = Collections.max(voteCount.entrySet(),Map.Entry.comparingByValue()).getKey();
        int[] arr = { 12, 6, 14, 8, 3, 5, 17 };

        noOfOccurance("jaintinmalik", 'a');
        findItem(arr, 8);
    }

    public static void noOfOccurance(String str, char c) {

        long count = str.chars().filter(x->x == c).count();

        // int count = 0;
        // for (int i = 0; i < str.length(); i++) {
        //     if (str.charAt(i) == c) {
        //         count++;
        //     }
        // }
        System.out.println("no of occurance is :" + count);
    }

    public static Integer findItem(int[] arr, int item) {

        int asInt = Arrays.stream(arr).filter(x->x==item).findAny().getAsInt();
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] == item) {
        //         return item;
        //     }
        // }
        return asInt;
    }

}
