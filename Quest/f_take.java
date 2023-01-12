package Quest;

import java.util.Arrays;

public class f_take {
    public static void main(String[] args) {
        f_take f = new f_take();
        System.out.println(Arrays.toString(f.take(2, new int[]{1, 2, 3, 4, 5})));
    }

    public int[] take(int num, int[] arr){
        if (num == 0 || arr.length == 0){
            return new int[]{};
        } // 배열 길이 혹은 num 이 0 일 경우 빈배열 생성해 리턴

        if(num >= arr.length) { // 1. 2보다 1,2,3,4,5 길이인 5가 큼
                                // 4. 2보다 1,2,3,4 길이인 4가 큼
                                // 7. 2보다 1,2,3 길이인 3이 큼
                                // 10. 2와 1,2 길이인 2가 같아짐
            return arr; // 11. 해당 배열 리턴
        } // num 인자 값이 arr 길이보다 크면 해당 arr 출력
        int[] tail = Arrays.copyOfRange(arr,0,arr.length-1);
        // 2. 실행되서 맨 마지막 인덱스 빼고 복사
        // 5. 실행되서 맨 마지막 인덱스 빼고 복사
        // 8. 실행되서 맨 마지막 인덱스 빼고 복사
        return take(num,tail);
        // 3. 복사된 인자 넘어감 ~> 2, {1,2,3,4}
        // 6. 복사된 인자 넘어감 ~> 2, {1,2,3}
        // 9. 복사된 인자 넘어감 ~> 2, {1,2}
    }
}
