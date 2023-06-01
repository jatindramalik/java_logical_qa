import java.util.Arrays;
import java.util.Collections;

public class NewFile {

    public static void main(String [] args){

        //reverse string
        String s = "madam";
        // String rev = "";
        // for(int i = s.length()-1;i>=0;i--){
        //     rev = rev +s.charAt(i);

        // }
        // System.out.println(rev);
       StringBuffer sb = new StringBuffer(s);
       sb.reverse().toString();

        // if(s.equals(sb)){
        //     System.out.println("String is palindrome" + s);
        // }else{
        //     System.out.println("String is not palindrome" + s);

        // }
    }
    
}
