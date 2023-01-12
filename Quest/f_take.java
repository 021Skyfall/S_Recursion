package Quest;

import java.util.Arrays;

public class f_take {
    public static void main(String[] args) {
        f_take f = new f_take();
        System.out.println(Arrays.toString(f.take(2, new int[]{1, 2, 3, 4, 5})));
    } // 개수 만큼 남는 배열

    public int[] take(int num, int[] arr){
//        if (num == 0 || arr.length == 0){
//            return new int[]{};
//        } // 배열 길이 혹은 num 이 0 일 경우 빈배열 생성해 리턴
//
//        if(num >= arr.length) { // 1. 2보다 1,2,3,4,5 길이인 5가 큼
//                                // 4. 2보다 1,2,3,4 길이인 4가 큼
//                                // 7. 2보다 1,2,3 길이인 3이 큼
//                                // 10. 2와 1,2 길이인 2가 같아짐
//            return arr; // 11. 해당 배열 리턴
//        } // num 인자 값이 arr 길이보다 크면 해당 arr 출력
//        int[] tail = Arrays.copyOfRange(arr,0,arr.length-1);
//        // 2. 실행되서 맨 마지막 인덱스 빼고 복사
//        // 5. 실행되서 맨 마지막 인덱스 빼고 복사
//        // 8. 실행되서 맨 마지막 인덱스 빼고 복사
//        return take(num,tail);
//        // 3. 복사된 인자 넘어감 ~> 2, {1,2,3,4}
//        // 6. 복사된 인자 넘어감 ~> 2, {1,2,3}
//        // 9. 복사된 인자 넘어감 ~> 2, {1,2}
        if (num == 0 || arr.length == 0) return new int[]{};
        if (num == arr.length) return arr;
        int[] tail = Arrays.copyOfRange(arr,0,arr.length-1);
        return take(num,tail);
    }
}
// 일단 제일 먼저 엣지 케이스로 num 이 0일때 혹은 arr 이 빈 배열일때 새로운 빈 배열 생성
// 가장 먼저 생각해야될게 남는 배열이니까 인데스 0번 부터 복사하되
// 마지막 배열을 지워줘야 함
// 이 말은 drop 이랑 다르게 인자로 들어간 숫자가 줄어 들게 아니라
// 길이가 줄어들어서 base case 랑 맞닿아야함
// 2 랑 1,2,3,4,5가 인자로 들어가고
// 일단 조건에 안걸리겠죠
// tail 로 배열 1,2,3,4 복사 넣기
// take() 재귀
// 1,2,3
// 다시
// 1,2 가 딱 들어갔더니
// num 과 인자로 받은 1,2 즉 arr 의 길이가 같아짐
// 그럼 조건에 맞아 떨어지니까 현재 인자로 들어간 arr 을 리턴하고 끝
// 그럼 take() 라는 재귀함수의 값 자체가 1,2 로 된 배열임
// 그럼? 결과값은 1,2
