package Quest;

public class b_fibonacci {
    public static void main(String[] args) {
        b_fibonacci b = new b_fibonacci();
        System.out.println(b.fibonacci(7));
    }

    public int fibonacci(int num){
//        if (num <= 1) return num; // 최소치가 1 이하가 되면 다시 num return
        // 0과 1이 고정임 ~> 피보나치의 특성 / 그래서 1<= 임
        // 호출 횟수를 줄이는 방법 ~> 알고리즘
        if (num == 0) return 0;
        if (num == 1 || num ==2) return 1;
        return fibonacci(num-1) + fibonacci(num-2); // 인자의 이전 숫자와 그 전 숫자의 합
        // 피보나치는 0~num 까지 이전의 것과 그 이전의 것을 더 한 것
        // ex) 0, 0, 1, 1, 2, 3, 5, 8 ...
    }
}
// 피보나지는 현재 숫자 이전 그이전의 숫자를 더한 값이 현재 숫자임
// 풀어서
// 8이 들어감
// 그럼 f() 의 인자는 5임
// 조건에 안걸리고 return 하려했더니 f() 재귀함수에 걸림
// f(4) + f(3)으로 다시 피보나치 함수가 돌아감
// 도식으로 설명하면
//                                      5
//                        4                           3
//               3                2            2              1
//           2      1
// 이중에서  0, 1, 2에 걸린 숫자가 다시 돌아감
// 마지막에 1이면 1이고 2도 1이고 0은 0임
// 그럼 그 숫자 들이 다 더해짐
// 왜? 리턴된 값이 1 or 0 이니까 그걸 다시 다 갖고 돌아오면서 더해지는 것임
// 그러니까 마지막 까지 쪼개져서 조건에 걸린 재귀함수가 그 자체 결과값으로 0 or 1 이 되는것
// 알고리즘 복잡하게 안하려고 == 2 넣고 더 빨리 끝낼 수 있는게 바로 위