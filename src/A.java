class A {
    public String addBinary(String a, String b) {

        int i = a.length();
        int j = b.length();
        if(i > j){
            int diff = i - j;
            for(int k = 0;k<diff;k++){
                b = "0" + b;
            }
        }else if(i < j){
            int diff = j - i;
            for(int k = 0;k < diff;k++){
                a = "0"+a;
            }
        }
        int carry = 0;
        String ans = "";
        for(int k = i-1;k>=0;k--){
            if(a.charAt(i)=='0' && b.charAt(i)=='0'&& carry == 0){
                ans="0"+ans;
            }else if(a.charAt(i)=='0' && b.charAt(i)=='0' && carry == 1){
                ans = "1"+ans;
                carry = 0;
            }else if(a.charAt(i) == '0'&& b.charAt(i) =='1'&& carry ==1){
                ans = "0"+ans;
                carry = 1;
            }else if (a.charAt(i) == '1' && b.charAt(i)=='0' && carry == 1){
                ans = "0" + ans;
                carry = 1;
            } else if (a.charAt(i) == '1' && b.charAt(i) == '0' && carry == 0) {
                ans = "1" + ans;
                carry = 0;
            } else if (a.charAt(i) == '1' && b.charAt(i) == '1' && carry == 1) {
                ans = "1" + ans;
                carry = 1;
            } else if (a.charAt(i) == '1' && b.charAt(i) == '1' && carry == 0) {
                ans = "0" + ans;
                carry = 1;
            } else if (a.charAt(i) == '0' && b.charAt(i) == '1' && carry == 0) {
                ans = "1" + ans;
                carry = 0;
            }
       if (carry == 1) {
            ans = "1" + ans;
        }
    }
        return ans;

    }
}
