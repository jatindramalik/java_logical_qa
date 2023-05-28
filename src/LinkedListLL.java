import java.util.LinkedList;

public class LinkedListLL {

    public static void main(String[] args) {

        LinkedList<String> listy = new LinkedList<>();
        listy.add("jua");
        listy.add("siddhu");
        listy.add("gudi");
        listy.add("rakhi");
        listy.add("krishna");
        listy.add("kaveri");

        System.out.println(listy.contains("jua"));
        listy.remove("gudi");
        System.out.println(listy.size());

        for(String str: listy){
            System.out.println(str);
        }
        
    }
    
}
