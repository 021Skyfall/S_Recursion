package Quest;

import java.util.Arrays;

public class d_arrLength {
    public static void main(String[] args) {
        d_arrLength d = new d_arrLength();
        System.out.println(d.arrLength(new int[] {1,2,3,4,5}));
    }
    public int arrLength(int[] arr){
        if(arr.length == 0) return 0; // 더 이상 쪼갤 수 없는 경우
        int[] tail = Arrays.copyOfRange(arr,1,arr.length); // 작은 단위로 쪼개는 중
        return 1 + arrLength(tail);
        // add() 를 다시 호출해서 arr 을 계속 쪼갬
        // 맨 처음 꺼빼고 복사 한게 tail 임 계속 tail 에 담김
        // 1,2,3,4,5 들어가면
        // 2,3,4,5
        // 3,4,5
        // 4,5
        // 5 까지 쪼개지고 마지막으로 5까지 들어가게되면
        // 얘도 버려지기 때문에
        // tail 에 저장된 배열은 빈 배열됨
        // 그럼 이제 add() 인자로 빈 배열이 들어갔기 때문에
        // if 문 조건에 걸림
        // 그럼 add(tail) 이라는 메소드의 리턴 값은 0이 됨
        // 그럼 마지막 연산인 1 + add(tail) 은 1 + 0이 되는 것
        // 그럼 이제 마지막 재귀연산된 값이 1 임
        // 이전으로 돌아오면 1 + 1임
        // 1+ 1
        // 1+ 2
        // 1+ 3
        // 1+ 4
        // 마지막 값이 출력됨
        // 마지막 까지 쪼갠다음에 조건에 걸리면 다시 앞으로 돌아가면서 1 + 가 연산됨
    }
}
