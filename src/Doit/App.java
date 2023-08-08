package Doit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        // Singh is king= hgnis si gnik
        String  str = "singh is king";
        StringBuilder rev = new StringBuilder();
        List<String> collect = Arrays.stream(str.split(" ")).collect(Collectors.toList());

        for(String s : collect){
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            sb.append(sb).append(" ");
        }
        
        System.out.println(rev.toString().trim());
 
    }

    
}
