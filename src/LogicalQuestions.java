import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LogicalQuestions {

    public static void main(String[] args) {
        LogicalQuestions l = new LogicalQuestions();

        // int s = l.lengthOfLongestSubstring("javaajavajava");
        // System.out.println(s);
        int[] sarray = {1,2,3,4,8,9,5,6};
        // int[] result = l.twoSum(sarray, 15);
        // Arrays.stream(result).forEach(System.out::println);

        int sum = l.romanToInt("LXVI");
        System.out.println(sum);

        
    }

    // public int lengthOfLongestSubstring(String s) {
    //     int i = 0, j = 0, max = 0;
    //     Set<Character> set = new HashSet<>();
        
    //     while (j < s.length()) {
    //         if (!set.contains(s.charAt(j))) {
    //             set.add(s.charAt(j++));
    //             max = Math.max(max, set.size());
    //         } else {
    //             set.remove(s.charAt(i++));
    //         }
    //     }
        
    //     return max;
    // }
    // public int[] twoSum(int[] intArray,int target){
    //     int[] ans = new int[2];
    //     for(int i = 0;i<intArray.length;i++){
    //         for(int j = i+1;j<intArray.length;j++){
    //             if(intArray[i]+intArray[j] == target){
    //                 ans[0]=i;
    //                 ans[1]=j;
    //             }
    //         }
    //     }
    //     return ans;
    // }
    // public int[] twoSum(int[] nums, int target) {
    //     for(int i = 0; i < nums.length; i++)
    //     {
    //         int num1 = nums[i];

    //         for(int j = i + 1; j < nums.length; j++)
    //         {
    //             int num2 = nums[j];

    //             int sum = num1 + num2;

    //             if(sum == target)
    //             {
    //                 return new int[] {i , j };
    //             }
    //         }
    //     }
    //     return null;
    // }
    public int romanToInt(String s) {
        int ans = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }

    
}
