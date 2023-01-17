import java.util.Arrays;

public class Day05Arrays {
    public static void main(String[] args) {
        int[] nums;
        nums = new int[3];
        nums[0] = 3;
        nums[1] = 1;
        nums[2] = 4;
        int [] nums = {5,11,9};
        int [] newNums;
        newNums = new int [] {nums[2], nums[1], nums[0]};
        System.out.println(Arrays.toString(newNums));

        int[] a = {1,2,3} ;
        if (a [0] == 2 && a[1] == 3){
            a [1]= 0;
        }else if (a [1] == 2 && a[2]==3) {
            a [2] = 0;
        }
        System.out.println(Arrays.toString(a));
    }
    
}