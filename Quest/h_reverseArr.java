package Quest;

import java.util.Arrays;

public class h_reverseArr {
    public static void main(String[] args) {
        h_reverseArr h = new h_reverseArr();
        System.out.println(Arrays.toString(h.reverseArr(new int[]{1, 2, 3, 4, 5})));
    }
    public int[] reverseArr(int[] arr) {
        if (arr.length == 0) return new int[]{}; // < 1. 여기서 return 조건에 부합하면
        // 배열 뽑아와서 맨 마지막 부터 다시 복사해야됨
        // 1,2,3,4,5
        // 1,2,3,4
        // 1,2,3
        // 1,2
        // 1
        // 0 << 이걸 위에 조건에 걸리게하고
        // 요소를 다시 5부터 쌓아야함
        // 헤드로 마지막 부터
        // 테일로 처음부터
        int[] head = Arrays.copyOfRange(arr,arr.length-1,arr.length);
        System.out.println("Head : " + Arrays.toString(head));
        int[] tail = reverseArr(Arrays.copyOfRange(arr,0,arr.length-1)); // < 2. 재귀 실행 시점인 여기로 돌아오게되는 것
        System.out.println("Tail : " + Arrays.toString(tail));

        int[] result = new int[head.length+ tail.length];
        System.arraycopy(head,0,result,0,head.length);
        System.arraycopy(tail,0,result,head.length,tail.length);

        return result; // < 3. 리턴문을 만나면 tail 이 result 그 자체가 되는 거임 왜? 결국 재귀함수도 메소드 호출해서 사용하는거랑 똑같기 때문에
        // head[3] / reverseArr[1,2]
        //           head[2] /  reverseArr[1]
        //                  head[1] /  reverseArr[]
        //                          [] 조건 걸림
        //                  head[2] / tail[1]
        //           head[3] / tail[2,1]
        // result = head + tail
        // [3,2,1]
    }
}
// 1,2,3,4,5 가 인자임
// 일단 빈 배열 아니니까 조건 패스
// 헤드 먼저 들어감
// 맨 마지막 꺼 빠짐
// 그럼 head 라는 배열에 5가 저장됨
// 이제 나머지인 1,2,3,4 가 tail 에 들어감
// 들어갔더니 재귀함수 인자로 들어가게 생김
// 그럼 재귀함수 인자로 1,2,3,4 가 들어감
// 다시 헤드가 4 가져감 ~> 헤드에 4,5 저장됨
// 다시 1,2,3이 tail 로 들어가서
// 다시 재귀 돔
// 계속해서
// 3 ~> 헤드가 가져감
// 1,2 다시
// 2 ~> 헤드가 가져감
// 1 다시
// 1 ~> 헤드가 가져감
// 0
// 조건 걸림
// 조건에 걸렸기 때문에 tail 의 값이 빈 배열임
// 빈 배열이고 재귀가 끝났기 때문에 돌아가면서
// result 가 실행됨
// 이 result 는 두 배열을 합쳐주는 거임
// 당장 전번으로 돌아게되면
// head = {1} / tail = {} 이 상태임
// result 는 두 배열 길이의 합만큼의 용량으로 생성되었고
// head 를 0 번째 인덱스로 복붙함
// tail 은 head 의 길이 인덱스니까 마지막으로 붙여짐
// result = {1} 이 됨
// 또 다시 돌아가게 되면
// Head = {2} 고 Tail = {1} 임
// 또 result 돌아가고
// head 가 먼저 앞에 복사되니까
// result = {2,1} 임
// 그 다음으로 또 돌아가면
// Head = {3} 이고 Tail = {2,1} 임
// 그럼? result = {3,2,1}
// 다시 돌아가면 Head = {4} 고 Tail = {3,2,1} 임
// 이렇게 반복되서 역순으로 복붙 되는 것
// 이게 내가 잘 못 생각한게 재귀 함수 돌아간 시점으로 계속 돌아가는 줄 알았는데
// 그게 아니라 재귀 함수 마지막에 결과값을 찾으면 호출한 메소드 자체가 실행되는 거임
// 그러니까 맨 마지막에 arr 이 빈 배열로 바뀌었을때
// 조건에 걸려서 결과값은 빈 배열이 되고 딱 그때 바로 돌아가서
// 재귀함수 실행 시점부터 다시 return 나올 때 까지 쭉 실행되는 거임
// 보통의 return 문 실행되는 것 처럼
// 재귀함수 실행된 시점으로 돌아가는게 맞긴한데
// 내가 생각한건 실행된 시점으로 돌아가고 바로 실행된 시점으로 돌아가고 인 줄 알았는데
// 일단 메소드를 호출 한 거기 때문에
// 메소드가 다 돌아가야하는 거 였음
// 마지막에