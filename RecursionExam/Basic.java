package RecursionExam;

import java.util.Arrays;

public class Basic {
    public static void main(String[] args) {

    }

//    public static int arrSum(int[] arr) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        return sum;
//    }
    // 기존 배열의 합 메소드
    // 1. 문제를 더 작게 쪼갬
    // 2. 가장 작은 단위로 쪼갬
    // 3. 가장 작은 단위로 문제 해결

    // 1. 문제를 더 작게 쪼개기
//    public static int arrSum(int[] arr) {
//        arrSum([1,2,3,4,5]) == 1 + arrSum([2,3,4,5])
//        arrSum([2,3,4,5]) == 2 + arrSum([3,4,5])
//        arrSum([3,4,5]) == 3 + arrSum([4,5])
//        arrSum([4,5]) == 4 + arrSum([5])
//        arrSum([5]) == 5 + arrSum([]) // 가장 작은 단위
//        arrSum([]) == 0 // 문제가 더 작아지지 않는 순간
//        // 다시 역순으로 합쳐짐
//        arrSum([5]) == 5 + arrSum([]) == 5 + 0 == 5;
//        arrSum([4, 5]) == 4 + arrSum([5]) == 4 + 5 == 9;
//        arrSum([3, 4, 5]) == 3 + arrSum([4, 5]) == 3 + 9 == 12;
//        arrSum([2, 3, 4, 5]) == 2 + arrSum([3, 4, 5]) == 2 + 12 == 14;
//        arrSum([1, 2, 3, 4, 5]) == 1 + arrSum([2, 3, 4, 5]) == 1 + 14 == 15;
        // 위 과정을 반영하면
//        if (arr.length == 0) {
//            return 0;
//        } // 가장 작은 문제 일때 0 리턴
//        int[] tail = Arrays.copyOfRange(arr,1,arr.length);
//        // 배열을 복사
//        return arr[0] = arrSum(tail);

        // 아 그러니까 메소드 내부에서 자기자신을 호출하게 되면
        // 배열이 쪼개져서 0이 될 때까지 반복하고
        // 조건문으로 0되면 0반환 하라했으니 멈춰진 거고
        // 결과 그 이전 단계 배열들이 숫자 리턴해서 배열의 합을 만든다?
        // 솔직히 뭔말인지 모르겟다;
        // 그러니까 1,2,3,4,5 의 배열이 쪼개지면 1 뱉어내고 2 뱉어 내고 하다가
        // 길이가 아예 0이되면 뱉을 게 없으니까 종료 시키고
        // 그렇게 종료되면 뱉어 낸거 주워 담으면서 숫자가 합쳐진다?
        // 숫자가 왜 합쳐짐?
        // 왜 뱉어냄?
        // 당장 마지막으로 작성한 코드 불러내니까 0 나오는디
    // 이거는 문제를 풀어보던가 해야 감이라도 잡힐거 같은데
    // 말로만 봐서는 무슨 말인지 감도 안온다...

//        public type recursive(input1, input2, ...) {
//            // Base Case : 문제를 더 이상 쪼갤 수 없는 경우
//            if (문제를 더 이상 쪼갤 수 없을 경우) {
//                return 단순한 문제의 해답;
//            }
//            // recursive Case
//            // 그렇지 않은 경우
//            return 더 작은 문제로 새롭게 정의된 문제
//            // 예1. someValue + recursive(input1Changed, input2Changed, ...)
//            // 예2. someValue * recursive(input1Changed, input2Changed, ...)
//        }
    // 재귀 연습 템플릿
}

