import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P10 {

    public static void binaryAdd(String s1, String s2) {
        int i = Integer.parseInt(s1, 2);
        int j = Integer.parseInt(s2, 2);

        int sum = i + j;
        String sumBinary = Integer.toBinaryString(sum);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(sumBinary);

    }

    public static void swapTwono(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
    }

    public static void findLargeAndSmall(int[] arr) {
        int largest = arr[0];
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            } else if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
    }

    public static void reverseString(String str) {
        String collect = Arrays.stream(str.split("")).sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(""));
        System.out.println(collect);
    }

    public static void noOfOccurance(String str, char c) {
        str.chars().filter(x -> x == c).forEach(System.out::println);

    }

    public static void sum(int[] arr) {
        Arrays.stream(arr).sum();
    }

    public static boolean isPalindrome(int i) {
        String str = String.valueOf(i);
        return str.equals(new StringBuffer(str).reverse().toString());
    }

    public static void findItem(int[] arr, int item) {
        OptionalInt findAny = Arrays.stream(arr).filter(x -> x == item).findAny();
        System.out.println(findAny);
    }

    public static int[] reverseArray(int[] arr){       
         return IntStream.range(0, arr.length)
                        .map(x->arr[arr.length-1-x])
                        .toArray();
}

    public static void reverseString2(String str){
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println(rev);
    }
    public static void charOccurance(String s){
        Map<String, Long> collect = Arrays.stream(s.split("")).
                collect(Collectors.groupingBy(x->x,Collectors.counting()));
                System.out.println(collect);
    }
    public static void charTransform(String s){
        s.chars().mapToObj(c->{
            if(Character.isUpperCase(c)){
               return Character.toLowerCase(c);
            }else if(Character.isLowerCase(c)){
               return Character.toUpperCase(c);
            }
            return c;
        }).map(Object::toString)
            .collect(Collectors.joining());
    }
    public static void charTransform2(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                sb.setCharAt(i, Character.toUpperCase(c));
            }else if(Character.isLowerCase(c)){
                sb.setCharAt(i, Character.toUpperCase(c));
            }
        }
    }
    public static void firstAppear(String str){
        List<String> firstappear = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(x->x,Collectors.counting()))
                .entrySet().stream()
                .filter(x->x.getValue()==1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
                System.out.println(firstappear);
    }

    public static void main(String[] args) {

        // binaryAdd("0110101", "11011");

        // reverseString("jkmall");

        // noOfOccurance("jatin", 'a');
        // int[] arr = { 12, 6, 14, 8, 3, 5, 17 };
        // findItem(arr, 7);
        // charOccurance("jkamll");

        // firstAppear("jatinmalik");

        String input= "one_day_i_will_be_billionair";
        Map<String, List<String>> charAppear = Arrays.stream(input.split(""))
            .collect(Collectors.groupingBy(x->x));

            System.out.println(charAppear);

        Map<String, Long> charCount = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(x->x,Collectors.counting()));

            System.out.println(charCount);
        List<String> duplicate = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(x->x,Collectors.counting()))
                .entrySet().stream()
                .filter(x->x.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
                System.out.println(duplicate);
    }
    

}
