package Quest;

import java.util.Arrays;

public class c_arrSum {
    public static void main(String[] args) {
        c_arrSum c = new c_arrSum();
        System.out.println(c.arrSum(new int[]{1,2,3,4,5}));
    }
    public int arrSum(int[] arr){
        if (arr.length == 0) return 0;
        int[] tail = Arrays.copyOfRange(arr,1,arr.length);
        return arr[0] + arrSum(tail);
    }
}
// 이거부터 다시 이해해야함
