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
// 1,2,3,4,5 가 arr 로 들어가면
// tail이 맨 처음을 빼고 복사를 하기 때문에
// 2,3,4,5 가됨
// 그대로 arrSum(tail) 의 인자로 들어감
// 3,4,5 가됨
// 반복해서
// 4,5
// 5
// 마지막으로 들어가면
// tail 은 빈 배열임
// 조건에 빈 배열일 경우에 0 리턴이니까
// 마지막까지 쪼개진 arrSum() 은 0임
// 이전으로 돌아와서 보면
// 5 겠지? 5가 들어가서 빈배열이니까 그 바로 전이면 5 맞음
// 그럼 arr 의 0번째 인덱스는 5임
// 그럼 arr + arrSum 은? 5 + 0 임
// 그럼 arrSum() 의 값은 5가됨
// 다시 돌아가면
// 4,5니까 arr 0번째 인덱스는 4고 arrSum 자체의 값은 5임
// 그걸 더해주라 했으니까
// 9
// 반복해서
// 3+ 9
// 2 + 12
// 1 + 14
// 결과는? 15
