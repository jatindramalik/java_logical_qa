import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Saturday {

    public static void main(String[] args) {
        String s = "hello world";
        String[] splitString = s.split(" ");
        for(String ss : splitString){
            System.out.println(ss);
        }
        Arrays.stream(splitString).distinct().forEach(System.out::println);

        List<String> sarry = Arrays.asList("aa","bb","cc","dd","aa","bb","cc");

        Set<String> set = new HashSet<>();

        for(String ss : sarry){
            if(set.contains(ss)){
                System.out.println("repeat string : " + ss);
                break;
            }else{
                set.add(ss);
            }
        }

        Map<String,Integer> map = new HashMap<>();

        for(String ss : sarry){
            if(map.containsKey(ss)){
                int count = map.get(ss);
                map.put(ss, count+1);
            }else{
                map.put(ss, 1);
            }
        }
        System.out.println(map);

        String sString = "JaVaPRoGraMmiNg";

        Map<Character,Integer> sMap = new HashMap<>();

        for(int i = 0;i <= sString.length()-1;i++){
            char c = sString.charAt(i);
            if(sMap.containsKey(c)){
                int count = sMap.get(c);
                sMap.put(c, count+1);
            }else{
                sMap.put(c, 1);
            }

        }
        sMap.entrySet().stream().forEach(System.out::println);
        StringBuffer sb = new StringBuffer(sString);

        for(int i = 0;i <= sb.length()-1;i++){
            char c = sb.charAt(i);
            if(Character.isUpperCase(c)){
                sb.setCharAt(i, Character.toLowerCase(c));
            }else if(Character.isLowerCase(c)){
                sb.setCharAt(i, Character.toUpperCase(c));
            }

        }
        System.out.println(sb);

        Integer[] intarr = { 1, 2, 4, 6, 3, 9, 8, 5, 1 };
      Math.sqrt(0)
      
        int large_no = intarr[0];
        int small_no = intarr[0];
        for(Integer i =0;i<=intarr.length-1;i++){
            if(intarr[i]>large_no){
                large_no = intarr[i];
            }else if(intarr[i] < small_no){
                small_no = intarr[i];
            }
        }
        System.out.println("large no :"+large_no);
        System.out.println("small no :"+small_no);

        int lengthOfLastWord = lengthOfLastWord("hii i am jatin");
        System.out.println("----------------- " +lengthOfLastWord);
        

    }
    public static int lengthOfLastWord(String s) {

        String[] sArray = s.split(" ");
        Arrays.sort(sArray);
        for(String st : sArray){
        System.out.println(st);
            
        }
        int i = sArray[0].length();
        return i;
        
    }
    
}
