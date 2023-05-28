import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;

public class DoIt {
    public static void main(String[] args) {

        String s = "JaVaPRoGraMmiNg";

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i <= s.length() - 1; i++) {

            char c = s.charAt(i);
            if (map.containsKey(c)) {
                int count = map.get(c);
                map.put(c, count + 1);
            } else {
                map.put(c, 1);
            }
        }

        System.out.println(map);

        StringBuffer sb = new StringBuffer(s);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (Character.isLowerCase(ch)) {
                sb.setCharAt(i, Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                sb.setCharAt(i, Character.toLowerCase(ch));
            }
        }

        System.out.println(sb);
        Integer[] intarr = { 1, 2, 4, 6, 3, 9, 8, 5, 1 };

        int large_no = intarr[0];
        int small_no = intarr[0];
        for (int i = 0; i < intarr.length; i++) {
            if (intarr[i] > large_no) {
                large_no = intarr[i];
            } else if (intarr[i] < small_no) {
                small_no = intarr[i];
            }
        }
        System.out.println("Largest No :" + large_no);
        System.out.println("Smallest No :" + small_no);

        Map<String,Integer> map2 = new HashMap<>();
        map2.put("John", 25);
        map2.put("jane", 30);
        map2.put("jaitn",40);

        Set<Map.Entry<String, Integer>> entries = map2.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        // Output:
        // John - 25
        // Jane - 30

        Integer[] accountBalance = {6,7,9};
        Optional<Integer> totalBalance = Arrays.stream(accountBalance).reduce((a,b)->a+b);
        System.out.println(totalBalance);
        OptionalDouble average = Arrays.stream(accountBalance).mapToDouble(c->c).average();
        System.out.println(average);

        



    }

}
