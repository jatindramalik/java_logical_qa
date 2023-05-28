public class StringLL {

   

    public static boolean isUpperCase(String str){
        return str.chars().allMatch(Character::isUpperCase);

    }
    public static boolean isLowerCase(String str){
        return str.chars().noneMatch(Character::isUpperCase);
        // return str.chars().allMatch(Character::isLowerCase);
    }
    public static boolean isPasswordComplex(String str){
        return str.chars().anyMatch(Character::isUpperCase)&&
                str.chars().anyMatch(Character::isLowerCase) &&
                str.chars().anyMatch(Character::isDigit);
    }
    //!Normalize
    public static String normalizeString(String str){
        return str.toLowerCase().trim().replace(",", "");
    }
    public static void parseContents(String str){
        System.out.println("Option 1");
        for(char c : str.toCharArray()){
            System.out.println(c);
        }
        System.out.println();
        for(int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
    public static boolean isAtEvenIndex(String str,char item){
        if(str == null || str.isEmpty()){
            return false;
        }
        for(int i = 0;i<str.length()/2+1;i = i+2){
            if(str.charAt(i)== item){
                return true;
            }
        }
        return false;
    }
    public static String reverse(String str){
        if(str == null ||str.isEmpty()){
            return str;
        }
        StringBuilder reverse = new StringBuilder();
        for(int i = str.length()-1;i >= 0;i--){
            reverse = reverse.append(str.charAt(i));
        }
        return reverse.toString();
    }
    public static String reverse2(String str){
        if(str == null ||str.isEmpty()){
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    public static String reverseWord(String str){
        String[] stringArray = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < stringArray.length;i++){
            sb.append(reverse(stringArray[i]));
            if(i !=stringArray.length-1){
                sb.append(" ");
            }
            
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "HKLAHHAUFKASKL";
        
        System.out.println(isUpperCase(str));
        System.out.println(isLowerCase("jatinmal"));
        System.out.println(isPasswordComplex("jatinK47"));
        System.out.println(normalizeString("Jati,n k MaliK"));

        System.out.println(str.contains("HH"));
        System.out.println("==========================");
        System.out.println(isAtEvenIndex(str, 'J'));
        System.out.println(isAtEvenIndex(str, 'L'));
        System.out.println(isAtEvenIndex(str, 'j'));

        System.out.println(reverse("jatin"));
        System.out.println(reverse2("JUA"));
        System.out.println(reverse("gudi"));

        System.out.println("======================");
        System.out.println(reverseWord("hii i am jatin"));

        // parseContents(str);

        
    }
}
