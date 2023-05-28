import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Demo {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream().max((a,b)->a-b).ifPresent(System.out::println);
        int product = list.stream().reduce(1,(a,b)->a*b);
        System.out.println(product);

        Integer[] array = {1,2,3,4,5};
        int max = 1;
        for(int i = 0;i <= array.length-1;i++){
            max = max*array[i];
        }
        System.out.println("max :" + max);
    } 
    
    
}
