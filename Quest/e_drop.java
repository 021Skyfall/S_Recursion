package Quest;

import java.util.Arrays;

public class e_drop {
    public static void main(String[] args) {
        e_drop e = new e_drop();
        System.out.println(Arrays.toString(e.drop(2, new int[]{1, 2, 3, 4, 5})));

    }
    public int[] drop(int num, int[] arr){
        if (num >= arr.length) return new int[]{};
        if (arr.length == 0 || num == 0) return arr;
        int[] tail = Arrays.copyOfRange(arr,1,arr.length);
        return drop(num -1,tail);
    }
}
// num 은 2, 배열은 1,2,3,4,5 들어감
// 일단 조건에 둘다 안걸림 num 이 배열길이보다 작고
// 빈배열 혹은 num 이 0이 아니니까
// 그럼? tail에 배열의 0번째 인덱스 빼고 복사됨
// 그렇게되면 tail 은 2,3,4,5 임
// 다음에 재귀함수 호출해서 drop 에 들어가는 num을 하나 빼줌
// tail 은 2,3,4,5
// 그러면 인자로 들어가는 값이 1 과 2,3,4,5 가됨
// 다시 로직 돌아감
// 조건에 안걸리고
// tail 을 거쳐
// 1 과 3,4,5 가되고
// 다시 drop 의 인자로 들어감
// 들어가게되면 num 이 0이 되기 때문에 조건에 걸림
// if (arr.length == 0 || num == 0) return arr; << 이 조건
// 조건에 걸리게되면 인자로 입력된 arr 을 리턴하라고 했으니까
// num 이 0이 된 시점에 인자로 받아온  3,4,5 가 리턴됨
// 사실 바로 이러고 출력 된다고 봐도 무방함
// 왜? 결국 결과로 나타낼 return 값은 drop() 이 함수 뿐이니까
// 전처럼 추가 연산이 없음
// 그럼 재귀를 마친 drop() 의 값 자체가 3,4,5 인 배열이 되는거고
// 결국 출력 값이 3,4,5가 되는 것