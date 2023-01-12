package Quest;

import java.util.Arrays;

public class g_and {
    public static void main(String[] args) {
        g_and g = new g_and();
        System.out.println(g.and(new boolean[] {true,true,false}));
    }
    public boolean and(boolean[] arr){
        if (arr.length == 0) return true;

        boolean[] tail = Arrays.copyOfRange(arr,1,arr.length);
        if (arr[0]) {
            return and(tail);
        }
        return false;
        // boolean head == arr[0];
        // return head && and(tail); << 연산자로 풀어야함
    }
}
// arr 로 t,t,f 들어감
// 일단 빈 배열 조건에 안걸림
// tail 로 0 번 인덱스 자르면
// t,f 가 저장됨
// 근데 여기서 arr 이 true 면 재귀함수가 돌아감
// 그럼 t,f 가 다시 들어가고
// tail 이 f 가됨
// 그 f 가 다시 인자로 들어가게되면
// 두 번째 if에 안걸리게 되고
// 값 자체가 false 가 됨
// 갖고 다시 거슬러 올라가도
// 결국 값 자체가 false 라서 걍 false 임
// 만약 올 ture 인 배열이면
// 두 번째 if 조건에서 계~속 돌아가다 빈 배열이되면
// 맨 처음인 if 조건에서 걸리겠지
// 그럼 값 자체가 true 인것
// 그럼 결과? true
// if (arr[0]) {
//            return and(tail);
//        }
//        return false;
// 근데 이제 이거를
// 내가 직접 계산하는 거 잖음? 결국
// 그럼 하나라도 false 여야 하는 연산 특성상
// 걍 and 연산자로 묶어버리면 됨
// 즉 return arr[0]&&and(tail) 이거랑 똑같은거임
// and(tail) 계속 돌아가면서 하나라도 false 값이면 && 연산 결과는 false 니까
// 근데 arr[0] 부터 and(tail) 재귀함수로 계속 돌아간 값이 빈 배열이 될 때까지
// true 면 결국 첫 번째 조건에 걸려서 true 가 됨