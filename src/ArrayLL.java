import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

public class ArrayLL {

    public static Integer linearSearch(int[] arr, int item){
        for(Integer current: arr){
            if(current == item){
                return item;
            }
        }
        return null;
    }
    public static OptionalInt linearSearch2(int[] arr,int item){
        return Arrays.stream(arr).filter(x-> x == item).findFirst();
    }
    //!for sorted array
    public static boolean binarySearch2(int[] arr, int item){
        int min = 0;
        int max = arr.length-1;
        while(min<=max){
            int mid = (min+max)/2;
            if(item==arr[mid]){
                return true;
            }else if(item < arr[mid]){
                max = mid - 1;
            }else{
                max = mid + 1;
            }
        }
        return false;
    }
    public static int[] findEvenNo(int[] arr1, int[] arr2){
        List<Integer> list = new ArrayList<>();

        for (Integer integer : arr1) {
            if(integer%2==0){
                list.add(integer);
            }
        }
         for (Integer integer : arr2) {
            if(integer%2==0){
                list.add(integer);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    public static int[] findEven2(int[] arr1,int[] arr2){
        IntPredicate isEvenPredicate = num -> num%2==0;
        return Stream.of(arr1,arr2).flatMapToInt(Arrays::stream).filter(isEvenPredicate).toArray();
    }
    public static int[] reverse(int[] arr){
        int[] result = new int[arr.length-1];
        for(int i = 0;i< arr.length;i++){
            result[i]=arr[arr.length-1-i];
        }
        return result;
    }
    public static void revereInPlace(int[] arr){
        int temp = arr[0];

        for(int i = 0;i<arr.length/2;i++){
            //Swap the item at index(i) and
            //item at intdex {arr.length -i-1}
            arr[i] =arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;

        }
    }
    public static void rotateArray(int[] arr){

        for(int i = 0;i < arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[0]=arr[arr.length-1];

    }


    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.binarySearch(arr, 5));
        // System.out.println(linearSearch(arr, 12));
        // System.out.println(linearSearch(arr, 5));

        // System.out.println("=======================================");
        // linearSearch2(arr, 9).ifPresent(System.out::println);
        // linearSearch2(arr, 60).ifPresent(System.out::println);
        System.out.println("hii jatin");
        // Arrays.stream(rota)
System.out.println("**************************************");
        int[] arr1 = {2,12,48,5,47,25,6,98};
        int[] arr2 = {65,89,30,20,50,49};
        // System.out.println(findEvenNo(arr1, arr2));
        // System.out.println(findEven2(arr1, arr2));
        Arrays.stream(findEven2(arr1, arr2)).forEach(System.out::println);
        
        System.out.println("============================");
        System.out.println(binarySearch2(arr, 5));
        System.out.println(binarySearch2(arr, 12));
         Arrays.stream(findEvenNo(arr1, arr2)).forEach(System.out::println);
         System.out.println("++++++++++++++++++++++++++++");
         System.out.println(reverse(arr));
        Arrays.stream(reverse(arr)).forEach(System.out::println);
        revereInPlace(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
    
}
