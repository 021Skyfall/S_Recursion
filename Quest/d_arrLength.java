package Quest;

import java.util.Arrays;

public class d_arrLength {
    public static void main(String[] args) {
        d_arrLength d = new d_arrLength();
        System.out.println(d.arrLength(new int[] {1,2,3,4,5}));
    }
    public int arrLength(int[] arr){
        if (arr.length == 0) return 0;
        int[] tail = Arrays.copyOfRange(arr,1,arr.length);
        return 1 + arrLength(tail); // 배열 길이니까 배열 개수 그대로 가져오고서 + 1
    }
}
