package Quest;

import java.util.Arrays;

public class e_drop {
    public static void main(String[] args) {
        e_drop e = new e_drop();
        System.out.println(Arrays.toString(e.drop(2, new int[]{1, 2, 3, 4, 5})));

    }
    public int[] drop(int num, int[] arr){
        if (arr.length == 0 || num == 0) return arr; // 배열 길이와 num 이 0일 경우 arr 그대로 리턴
        int[] tail = Arrays.copyOfRange(arr,1,arr.length); // 꼬리 지정
        return drop(num -1,tail); // num 에서 계속 -1 , 배열의 기준은 arr 이 복사된 tail
        // 2 , 1 2 3 4 5 입력
        // tail 변수에  2 3 4 5 복사
        // num 에 1 빼주고 다시 인자로 재귀
        // 1, 2 3 4 5 입력
        // tail 변수에 3 4 5 복사
        // 0 , 3 4 5 << if num == 0 에 걸려서 현재 배열 리턴
    }
}
